.class public final Llive/hms/video/connection/models/HMSSessionDescription;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/connection/models/HMSSessionDescription$Companion;,
        Llive/hms/video/connection/models/HMSSessionDescription$Type;,
        Llive/hms/video/connection/models/HMSSessionDescription$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0080\u0008\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0006\u0010\u000e\u001a\u00020\u000fJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J)\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000c\u00a8\u0006\u001c"
    }
    d2 = {
        "Llive/hms/video/connection/models/HMSSessionDescription;",
        "",
        "type",
        "Llive/hms/video/connection/models/HMSSessionDescription$Type;",
        "description",
        "",
        "sfuNodeId",
        "<init>",
        "(Llive/hms/video/connection/models/HMSSessionDescription$Type;Ljava/lang/String;Ljava/lang/String;)V",
        "getType",
        "()Llive/hms/video/connection/models/HMSSessionDescription$Type;",
        "getDescription",
        "()Ljava/lang/String;",
        "getSfuNodeId",
        "native",
        "Lhms/webrtc/SessionDescription;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "Companion",
        "Type",
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


# static fields
.field public static final Companion:Llive/hms/video/connection/models/HMSSessionDescription$Companion;

.field private static final TAG:Ljava/lang/String; = "HMSSessionDescription"


# instance fields
.field private final description:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sdp"
    .end annotation
.end field

.field private final sfuNodeId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sfu_node_id"
    .end annotation
.end field

.field private final type:Llive/hms/video/connection/models/HMSSessionDescription$Type;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "type"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/connection/models/HMSSessionDescription$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/connection/models/HMSSessionDescription$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/connection/models/HMSSessionDescription;->Companion:Llive/hms/video/connection/models/HMSSessionDescription$Companion;

    return-void
.end method

.method public constructor <init>(Llive/hms/video/connection/models/HMSSessionDescription$Type;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Llive/hms/video/connection/models/HMSSessionDescription;->type:Llive/hms/video/connection/models/HMSSessionDescription$Type;

    .line 3
    iput-object p2, p0, Llive/hms/video/connection/models/HMSSessionDescription;->description:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Llive/hms/video/connection/models/HMSSessionDescription;->sfuNodeId:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Llive/hms/video/connection/models/HMSSessionDescription$Type;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Llive/hms/video/connection/models/HMSSessionDescription;-><init>(Llive/hms/video/connection/models/HMSSessionDescription$Type;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/connection/models/HMSSessionDescription;Llive/hms/video/connection/models/HMSSessionDescription$Type;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Llive/hms/video/connection/models/HMSSessionDescription;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Llive/hms/video/connection/models/HMSSessionDescription;->type:Llive/hms/video/connection/models/HMSSessionDescription$Type;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Llive/hms/video/connection/models/HMSSessionDescription;->description:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Llive/hms/video/connection/models/HMSSessionDescription;->sfuNodeId:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Llive/hms/video/connection/models/HMSSessionDescription;->copy(Llive/hms/video/connection/models/HMSSessionDescription$Type;Ljava/lang/String;Ljava/lang/String;)Llive/hms/video/connection/models/HMSSessionDescription;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Llive/hms/video/connection/models/HMSSessionDescription$Type;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/models/HMSSessionDescription;->type:Llive/hms/video/connection/models/HMSSessionDescription$Type;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/models/HMSSessionDescription;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/models/HMSSessionDescription;->sfuNodeId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Llive/hms/video/connection/models/HMSSessionDescription$Type;Ljava/lang/String;Ljava/lang/String;)Llive/hms/video/connection/models/HMSSessionDescription;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/connection/models/HMSSessionDescription;

    invoke-direct {v0, p1, p2, p3}, Llive/hms/video/connection/models/HMSSessionDescription;-><init>(Llive/hms/video/connection/models/HMSSessionDescription$Type;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/connection/models/HMSSessionDescription;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/connection/models/HMSSessionDescription;

    iget-object v1, p0, Llive/hms/video/connection/models/HMSSessionDescription;->type:Llive/hms/video/connection/models/HMSSessionDescription$Type;

    iget-object v3, p1, Llive/hms/video/connection/models/HMSSessionDescription;->type:Llive/hms/video/connection/models/HMSSessionDescription$Type;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/connection/models/HMSSessionDescription;->description:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/connection/models/HMSSessionDescription;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/connection/models/HMSSessionDescription;->sfuNodeId:Ljava/lang/String;

    iget-object p1, p1, Llive/hms/video/connection/models/HMSSessionDescription;->sfuNodeId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/models/HMSSessionDescription;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getSfuNodeId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/models/HMSSessionDescription;->sfuNodeId:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Llive/hms/video/connection/models/HMSSessionDescription$Type;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/models/HMSSessionDescription;->type:Llive/hms/video/connection/models/HMSSessionDescription$Type;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llive/hms/video/connection/models/HMSSessionDescription;->type:Llive/hms/video/connection/models/HMSSessionDescription$Type;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Llive/hms/video/connection/models/HMSSessionDescription;->description:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Llive/hms/video/connection/models/HMSSessionDescription;->sfuNodeId:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final native()Lhms/webrtc/SessionDescription;
    .locals 3

    iget-object v0, p0, Llive/hms/video/connection/models/HMSSessionDescription;->type:Llive/hms/video/connection/models/HMSSessionDescription$Type;

    sget-object v1, Llive/hms/video/connection/models/HMSSessionDescription$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    sget-object v0, Lhms/webrtc/SessionDescription$Type;->ANSWER:Lhms/webrtc/SessionDescription$Type;

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    sget-object v0, Lhms/webrtc/SessionDescription$Type;->PRANSWER:Lhms/webrtc/SessionDescription$Type;

    goto :goto_0

    :cond_2
    sget-object v0, Lhms/webrtc/SessionDescription$Type;->OFFER:Lhms/webrtc/SessionDescription$Type;

    :goto_0
    new-instance v1, Lhms/webrtc/SessionDescription;

    iget-object v2, p0, Llive/hms/video/connection/models/HMSSessionDescription;->description:Ljava/lang/String;

    invoke-direct {v1, v0, v2}, Lhms/webrtc/SessionDescription;-><init>(Lhms/webrtc/SessionDescription$Type;Ljava/lang/String;)V

    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HMSSessionDescription(type="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/connection/models/HMSSessionDescription;->type:Llive/hms/video/connection/models/HMSSessionDescription$Type;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/models/HMSSessionDescription;->description:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sfuNodeId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/models/HMSSessionDescription;->sfuNodeId:Ljava/lang/String;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
