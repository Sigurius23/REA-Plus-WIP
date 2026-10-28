.class public final Llive/hms/video/sdk/models/SDKUpdate$Room;
.super Llive/hms/video/sdk/models/SDKUpdate;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/sdk/models/SDKUpdate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Room"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\t\u0010\u0008\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0012"
    }
    d2 = {
        "Llive/hms/video/sdk/models/SDKUpdate$Room;",
        "Llive/hms/video/sdk/models/SDKUpdate;",
        "type",
        "Llive/hms/video/sdk/models/enums/HMSRoomUpdate;",
        "<init>",
        "(Llive/hms/video/sdk/models/enums/HMSRoomUpdate;)V",
        "getType",
        "()Llive/hms/video/sdk/models/enums/HMSRoomUpdate;",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final type:Llive/hms/video/sdk/models/enums/HMSRoomUpdate;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/models/enums/HMSRoomUpdate;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Llive/hms/video/sdk/models/SDKUpdate;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Llive/hms/video/sdk/models/SDKUpdate$Room;->type:Llive/hms/video/sdk/models/enums/HMSRoomUpdate;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sdk/models/SDKUpdate$Room;Llive/hms/video/sdk/models/enums/HMSRoomUpdate;ILjava/lang/Object;)Llive/hms/video/sdk/models/SDKUpdate$Room;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Llive/hms/video/sdk/models/SDKUpdate$Room;->type:Llive/hms/video/sdk/models/enums/HMSRoomUpdate;

    :cond_0
    invoke-virtual {p0, p1}, Llive/hms/video/sdk/models/SDKUpdate$Room;->copy(Llive/hms/video/sdk/models/enums/HMSRoomUpdate;)Llive/hms/video/sdk/models/SDKUpdate$Room;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Llive/hms/video/sdk/models/enums/HMSRoomUpdate;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/SDKUpdate$Room;->type:Llive/hms/video/sdk/models/enums/HMSRoomUpdate;

    return-object v0
.end method

.method public final copy(Llive/hms/video/sdk/models/enums/HMSRoomUpdate;)Llive/hms/video/sdk/models/SDKUpdate$Room;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/sdk/models/SDKUpdate$Room;

    invoke-direct {v0, p1}, Llive/hms/video/sdk/models/SDKUpdate$Room;-><init>(Llive/hms/video/sdk/models/enums/HMSRoomUpdate;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sdk/models/SDKUpdate$Room;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sdk/models/SDKUpdate$Room;

    iget-object v1, p0, Llive/hms/video/sdk/models/SDKUpdate$Room;->type:Llive/hms/video/sdk/models/enums/HMSRoomUpdate;

    iget-object p1, p1, Llive/hms/video/sdk/models/SDKUpdate$Room;->type:Llive/hms/video/sdk/models/enums/HMSRoomUpdate;

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getType()Llive/hms/video/sdk/models/enums/HMSRoomUpdate;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/SDKUpdate$Room;->type:Llive/hms/video/sdk/models/enums/HMSRoomUpdate;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/SDKUpdate$Room;->type:Llive/hms/video/sdk/models/enums/HMSRoomUpdate;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Room(type="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/sdk/models/SDKUpdate$Room;->type:Llive/hms/video/sdk/models/enums/HMSRoomUpdate;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
