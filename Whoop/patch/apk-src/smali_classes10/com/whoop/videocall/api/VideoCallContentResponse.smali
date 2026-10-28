.class public final Lcom/whoop/videocall/api/VideoCallContentResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/videocall/api/VideoCallContentResponse$$serializer;,
        Lcom/whoop/videocall/api/VideoCallContentResponse$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u0000 32\u00020\u0001:\u000245B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bBC\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J8\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u001bJ\u0010\u0010%\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010)\u001a\u00020(2\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010+\u001a\u0004\u0008,\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010-\u001a\u0004\u0008.\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010/\u001a\u0004\u00080\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00101\u001a\u0004\u00082\u0010!\u00a8\u00066"
    }
    d2 = {
        "Lcom/whoop/videocall/api/VideoCallContentResponse;",
        "",
        "",
        "callId",
        "Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;",
        "waitingRoom",
        "Lcom/whoop/videocall/api/VideoCallParticipantsModel;",
        "participants",
        "Lcom/whoop/videocall/api/VideoCallPermissionsModel;",
        "permissions",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;Lcom/whoop/videocall/api/VideoCallParticipantsModel;Lcom/whoop/videocall/api/VideoCallPermissionsModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;Lcom/whoop/videocall/api/VideoCallParticipantsModel;Lcom/whoop/videocall/api/VideoCallPermissionsModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$video_call_release",
        "(Lcom/whoop/videocall/api/VideoCallContentResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;",
        "component3",
        "()Lcom/whoop/videocall/api/VideoCallParticipantsModel;",
        "component4",
        "()Lcom/whoop/videocall/api/VideoCallPermissionsModel;",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;Lcom/whoop/videocall/api/VideoCallParticipantsModel;Lcom/whoop/videocall/api/VideoCallPermissionsModel;)Lcom/whoop/videocall/api/VideoCallContentResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getCallId",
        "Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;",
        "getWaitingRoom",
        "Lcom/whoop/videocall/api/VideoCallParticipantsModel;",
        "getParticipants",
        "Lcom/whoop/videocall/api/VideoCallPermissionsModel;",
        "getPermissions",
        "Companion",
        "$serializer",
        "a",
        "video-call_release"
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

.field public static final Companion:Lcom/whoop/videocall/api/VideoCallContentResponse$a;


# instance fields
.field private final callId:Ljava/lang/String;

.field private final participants:Lcom/whoop/videocall/api/VideoCallParticipantsModel;

.field private final permissions:Lcom/whoop/videocall/api/VideoCallPermissionsModel;

.field private final waitingRoom:Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/videocall/api/VideoCallContentResponse$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/videocall/api/VideoCallContentResponse$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/videocall/api/VideoCallContentResponse;->Companion:Lcom/whoop/videocall/api/VideoCallContentResponse$a;

    sget v0, Lcom/whoop/design/models/modal/DialogModel;->$stable:I

    sget v1, Lcom/whoop/design/models/items/SecondaryButtonModel;->$stable:I

    or-int/2addr v0, v1

    sget v1, Lcom/whoop/design/models/InfoCalloutTileModel;->$stable:I

    or-int/2addr v0, v1

    sget v1, Lcom/whoop/design/models/items/ImageUrlModel;->$stable:I

    or-int/2addr v0, v1

    or-int/2addr v0, v1

    sget v1, Lcom/whoop/design/models/items/NavigationBarModel;->$stable:I

    or-int/2addr v0, v1

    sput v0, Lcom/whoop/videocall/api/VideoCallContentResponse;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;Lcom/whoop/videocall/api/VideoCallParticipantsModel;Lcom/whoop/videocall/api/VideoCallPermissionsModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/videocall/api/VideoCallContentResponse$$serializer;->INSTANCE:Lcom/whoop/videocall/api/VideoCallContentResponse$$serializer;

    invoke-virtual {p6}, Lcom/whoop/videocall/api/VideoCallContentResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->callId:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->waitingRoom:Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;

    iput-object p4, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->participants:Lcom/whoop/videocall/api/VideoCallParticipantsModel;

    iput-object p5, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->permissions:Lcom/whoop/videocall/api/VideoCallPermissionsModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;Lcom/whoop/videocall/api/VideoCallParticipantsModel;Lcom/whoop/videocall/api/VideoCallPermissionsModel;)V
    .locals 1

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "waitingRoom"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "participants"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "permissions"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->callId:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->waitingRoom:Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;

    .line 5
    iput-object p3, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->participants:Lcom/whoop/videocall/api/VideoCallParticipantsModel;

    .line 6
    iput-object p4, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->permissions:Lcom/whoop/videocall/api/VideoCallPermissionsModel;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/videocall/api/VideoCallContentResponse;Ljava/lang/String;Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;Lcom/whoop/videocall/api/VideoCallParticipantsModel;Lcom/whoop/videocall/api/VideoCallPermissionsModel;ILjava/lang/Object;)Lcom/whoop/videocall/api/VideoCallContentResponse;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->callId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->waitingRoom:Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->participants:Lcom/whoop/videocall/api/VideoCallParticipantsModel;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->permissions:Lcom/whoop/videocall/api/VideoCallPermissionsModel;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/videocall/api/VideoCallContentResponse;->copy(Ljava/lang/String;Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;Lcom/whoop/videocall/api/VideoCallParticipantsModel;Lcom/whoop/videocall/api/VideoCallPermissionsModel;)Lcom/whoop/videocall/api/VideoCallContentResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$video_call_release(Lcom/whoop/videocall/api/VideoCallContentResponse;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->callId:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/videocall/api/VideoCallWaitingRoomModel$$serializer;->INSTANCE:Lcom/whoop/videocall/api/VideoCallWaitingRoomModel$$serializer;

    iget-object v1, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->waitingRoom:Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/videocall/api/VideoCallParticipantsModel$$serializer;->INSTANCE:Lcom/whoop/videocall/api/VideoCallParticipantsModel$$serializer;

    iget-object v1, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->participants:Lcom/whoop/videocall/api/VideoCallParticipantsModel;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/videocall/api/VideoCallPermissionsModel$$serializer;->INSTANCE:Lcom/whoop/videocall/api/VideoCallPermissionsModel$$serializer;

    iget-object p0, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->permissions:Lcom/whoop/videocall/api/VideoCallPermissionsModel;

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->callId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->waitingRoom:Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;

    return-object v0
.end method

.method public final component3()Lcom/whoop/videocall/api/VideoCallParticipantsModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->participants:Lcom/whoop/videocall/api/VideoCallParticipantsModel;

    return-object v0
.end method

.method public final component4()Lcom/whoop/videocall/api/VideoCallPermissionsModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->permissions:Lcom/whoop/videocall/api/VideoCallPermissionsModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;Lcom/whoop/videocall/api/VideoCallParticipantsModel;Lcom/whoop/videocall/api/VideoCallPermissionsModel;)Lcom/whoop/videocall/api/VideoCallContentResponse;
    .locals 1

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "waitingRoom"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "participants"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "permissions"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/videocall/api/VideoCallContentResponse;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/videocall/api/VideoCallContentResponse;-><init>(Ljava/lang/String;Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;Lcom/whoop/videocall/api/VideoCallParticipantsModel;Lcom/whoop/videocall/api/VideoCallPermissionsModel;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/videocall/api/VideoCallContentResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/videocall/api/VideoCallContentResponse;

    iget-object v1, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->callId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/videocall/api/VideoCallContentResponse;->callId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->waitingRoom:Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;

    iget-object v3, p1, Lcom/whoop/videocall/api/VideoCallContentResponse;->waitingRoom:Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->participants:Lcom/whoop/videocall/api/VideoCallParticipantsModel;

    iget-object v3, p1, Lcom/whoop/videocall/api/VideoCallContentResponse;->participants:Lcom/whoop/videocall/api/VideoCallParticipantsModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->permissions:Lcom/whoop/videocall/api/VideoCallPermissionsModel;

    iget-object p1, p1, Lcom/whoop/videocall/api/VideoCallContentResponse;->permissions:Lcom/whoop/videocall/api/VideoCallPermissionsModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCallId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->callId:Ljava/lang/String;

    return-object v0
.end method

.method public final getParticipants()Lcom/whoop/videocall/api/VideoCallParticipantsModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->participants:Lcom/whoop/videocall/api/VideoCallParticipantsModel;

    return-object v0
.end method

.method public final getPermissions()Lcom/whoop/videocall/api/VideoCallPermissionsModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->permissions:Lcom/whoop/videocall/api/VideoCallPermissionsModel;

    return-object v0
.end method

.method public final getWaitingRoom()Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->waitingRoom:Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->callId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->waitingRoom:Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;

    invoke-virtual {v1}, Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->participants:Lcom/whoop/videocall/api/VideoCallParticipantsModel;

    invoke-virtual {v0}, Lcom/whoop/videocall/api/VideoCallParticipantsModel;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->permissions:Lcom/whoop/videocall/api/VideoCallPermissionsModel;

    invoke-virtual {v1}, Lcom/whoop/videocall/api/VideoCallPermissionsModel;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->callId:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->waitingRoom:Lcom/whoop/videocall/api/VideoCallWaitingRoomModel;

    iget-object v2, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->participants:Lcom/whoop/videocall/api/VideoCallParticipantsModel;

    iget-object v3, p0, Lcom/whoop/videocall/api/VideoCallContentResponse;->permissions:Lcom/whoop/videocall/api/VideoCallPermissionsModel;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "VideoCallContentResponse(callId="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", waitingRoom="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", participants="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", permissions="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
