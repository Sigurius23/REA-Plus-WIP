.class public final Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;
.super Llive/hms/video/sdk/models/HMSNotifications;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/sdk/models/HMSNotifications;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "PeerLeave"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\u0008\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0008H\u00c6\u0003J9\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0010\u0008\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000cR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001e"
    }
    d2 = {
        "Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;",
        "Llive/hms/video/sdk/models/HMSNotifications;",
        "peerId",
        "",
        "role",
        "groups",
        "Ljava/util/ArrayList;",
        "info",
        "Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;)V",
        "getPeerId",
        "()Ljava/lang/String;",
        "getRole",
        "getGroups",
        "()Ljava/util/ArrayList;",
        "getInfo",
        "()Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
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
.field private final groups:Ljava/util/ArrayList;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "groups"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final info:Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "info"
    .end annotation
.end field

.field private final peerId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "peer_id"
    .end annotation
.end field

.field private final role:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "role"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;",
            ")V"
        }
    .end annotation

    const-string v0, "peerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "role"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "info"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Llive/hms/video/sdk/models/HMSNotifications;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object p1, p0, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->peerId:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->role:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->groups:Ljava/util/ArrayList;

    .line 6
    iput-object p4, p0, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->info:Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    const/4 p3, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;)V

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;ILjava/lang/Object;)Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->peerId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->role:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->groups:Ljava/util/ArrayList;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->info:Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;)Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->peerId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->role:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->groups:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final component4()Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->info:Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;)Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;",
            ")",
            "Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;"
        }
    .end annotation

    const-string v0, "peerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "role"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "info"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;

    invoke-direct {v0, p1, p2, p3, p4}, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->peerId:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->peerId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->role:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->role:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->groups:Ljava/util/ArrayList;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->groups:Ljava/util/ArrayList;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->info:Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;

    iget-object p1, p1, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->info:Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getGroups()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->groups:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getInfo()Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->info:Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;

    return-object v0
.end method

.method public final getPeerId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->peerId:Ljava/lang/String;

    return-object v0
.end method

.method public final getRole()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->role:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->peerId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->role:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->groups:Ljava/util/ArrayList;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->info:Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PeerLeave(peerId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->peerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", role="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->role:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", groups="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->groups:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", info="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$PeerLeave;->info:Llive/hms/video/sdk/models/HMSNotifications$PeerInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
