.class public final Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;
.super Llive/hms/video/sdk/models/HMSNotifications;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/sdk/models/HMSNotifications;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "RoomInfo"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0014\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0086\u0008\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\t\u0010\u0019\u001a\u00020\tH\u00c6\u0003JB\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\t2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0007H\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\rR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0008\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006!"
    }
    d2 = {
        "Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;",
        "Llive/hms/video/sdk/models/HMSNotifications;",
        "roomId",
        "",
        "roomName",
        "description",
        "maxSize",
        "",
        "largeRoomOptimizationDone",
        "",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V",
        "getRoomId",
        "()Ljava/lang/String;",
        "getRoomName",
        "getDescription",
        "getMaxSize",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getLargeRoomOptimizationDone",
        "()Z",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final description:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "description"
    .end annotation
.end field

.field private final largeRoomOptimizationDone:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "large_room_optimization"
    .end annotation
.end field

.field private final maxSize:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "max_size"
    .end annotation
.end field

.field private final roomId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "room_id"
    .end annotation
.end field

.field private final roomName:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "name"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V
    .locals 1

    const-string v0, "roomId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "roomName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Llive/hms/video/sdk/models/HMSNotifications;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->roomId:Ljava/lang/String;

    iput-object p2, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->roomName:Ljava/lang/String;

    iput-object p3, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->description:Ljava/lang/String;

    iput-object p4, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->maxSize:Ljava/lang/Integer;

    iput-boolean p5, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->largeRoomOptimizationDone:Z

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZILjava/lang/Object;)Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->roomId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->roomName:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->description:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->maxSize:Ljava/lang/Integer;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-boolean p5, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->largeRoomOptimizationDone:Z

    :cond_4
    move-object p6, p4

    move p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->roomId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->roomName:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->maxSize:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->largeRoomOptimizationDone:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;
    .locals 7

    const-string v0, "roomId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "roomName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->roomId:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->roomId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->roomName:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->roomName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->description:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->maxSize:Ljava/lang/Integer;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->maxSize:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->largeRoomOptimizationDone:Z

    iget-boolean p1, p1, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->largeRoomOptimizationDone:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getLargeRoomOptimizationDone()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->largeRoomOptimizationDone:Z

    return v0
.end method

.method public final getMaxSize()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->maxSize:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getRoomId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->roomId:Ljava/lang/String;

    return-object v0
.end method

.method public final getRoomName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->roomName:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->roomId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->roomName:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->description:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->maxSize:Ljava/lang/Integer;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->largeRoomOptimizationDone:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RoomInfo(roomId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->roomId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", roomName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->roomName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->description:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", maxSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->maxSize:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", largeRoomOptimizationDone="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/sdk/models/HMSNotifications$RoomInfo;->largeRoomOptimizationDone:Z

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lb9/y;->r(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
