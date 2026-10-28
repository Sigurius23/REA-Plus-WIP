.class public final Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;
.super Llive/hms/video/signal/jsonrpc/models/HMSParams;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/signal/jsonrpc/models/HMSParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SendOffer"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0080\u0008\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\"\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0008j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J*\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0008j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003JJ\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032$\u0008\u0002\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0008j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\u00052\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR4\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0008j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u000e\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u001f"
    }
    d2 = {
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams;",
        "description",
        "Llive/hms/video/connection/models/HMSSessionDescription;",
        "tracks",
        "Lkotlin/collections/HashMap;",
        "",
        "Llive/hms/video/sdk/models/HMSNotifications$Track;",
        "Ljava/util/HashMap;",
        "sfuNodeId",
        "<init>",
        "(Llive/hms/video/connection/models/HMSSessionDescription;Ljava/util/HashMap;Ljava/lang/String;)V",
        "getDescription",
        "()Llive/hms/video/connection/models/HMSSessionDescription;",
        "getTracks",
        "()Ljava/util/HashMap;",
        "Ljava/util/HashMap;",
        "getSfuNodeId",
        "()Ljava/lang/String;",
        "component1",
        "component2",
        "component3",
        "copy",
        "(Llive/hms/video/connection/models/HMSSessionDescription;Ljava/util/HashMap;Ljava/lang/String;)Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;",
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
.field private final description:Llive/hms/video/connection/models/HMSSessionDescription;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "desc"
    .end annotation
.end field

.field private final sfuNodeId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sfu_node_id"
    .end annotation
.end field

.field private final tracks:Ljava/util/HashMap;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "tracks"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Llive/hms/video/sdk/models/HMSNotifications$Track;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Llive/hms/video/connection/models/HMSSessionDescription;Ljava/util/HashMap;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/connection/models/HMSSessionDescription;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Llive/hms/video/sdk/models/HMSNotifications$Track;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "description"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tracks"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Llive/hms/video/signal/jsonrpc/models/HMSParams;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;->description:Llive/hms/video/connection/models/HMSSessionDescription;

    iput-object p2, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;->tracks:Ljava/util/HashMap;

    iput-object p3, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;->sfuNodeId:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;Llive/hms/video/connection/models/HMSSessionDescription;Ljava/util/HashMap;Ljava/lang/String;ILjava/lang/Object;)Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;->description:Llive/hms/video/connection/models/HMSSessionDescription;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;->tracks:Ljava/util/HashMap;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;->sfuNodeId:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;->copy(Llive/hms/video/connection/models/HMSSessionDescription;Ljava/util/HashMap;Ljava/lang/String;)Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Llive/hms/video/connection/models/HMSSessionDescription;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;->description:Llive/hms/video/connection/models/HMSSessionDescription;

    return-object v0
.end method

.method public final component2()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Llive/hms/video/sdk/models/HMSNotifications$Track;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;->tracks:Ljava/util/HashMap;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;->sfuNodeId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Llive/hms/video/connection/models/HMSSessionDescription;Ljava/util/HashMap;Ljava/lang/String;)Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/connection/models/HMSSessionDescription;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Llive/hms/video/sdk/models/HMSNotifications$Track;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;"
        }
    .end annotation

    const-string v0, "description"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tracks"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;

    invoke-direct {v0, p1, p2, p3}, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;-><init>(Llive/hms/video/connection/models/HMSSessionDescription;Ljava/util/HashMap;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;->description:Llive/hms/video/connection/models/HMSSessionDescription;

    iget-object v3, p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;->description:Llive/hms/video/connection/models/HMSSessionDescription;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;->tracks:Ljava/util/HashMap;

    iget-object v3, p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;->tracks:Ljava/util/HashMap;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;->sfuNodeId:Ljava/lang/String;

    iget-object p1, p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;->sfuNodeId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getDescription()Llive/hms/video/connection/models/HMSSessionDescription;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;->description:Llive/hms/video/connection/models/HMSSessionDescription;

    return-object v0
.end method

.method public final getSfuNodeId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;->sfuNodeId:Ljava/lang/String;

    return-object v0
.end method

.method public final getTracks()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Llive/hms/video/sdk/models/HMSNotifications$Track;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;->tracks:Ljava/util/HashMap;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;->description:Llive/hms/video/connection/models/HMSSessionDescription;

    invoke-virtual {v0}, Llive/hms/video/connection/models/HMSSessionDescription;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;->tracks:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;->sfuNodeId:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SendOffer(description="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;->description:Llive/hms/video/connection/models/HMSSessionDescription;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tracks="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;->tracks:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sfuNodeId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;->sfuNodeId:Ljava/lang/String;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
