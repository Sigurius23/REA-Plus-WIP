.class public final Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;
.super Llive/hms/video/signal/jsonrpc/models/HMSParams;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/signal/jsonrpc/models/HMSParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Offer"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0080\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0006\u0010\u000c\u001a\u00020\rJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0018"
    }
    d2 = {
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams;",
        "type",
        "Llive/hms/video/connection/models/HMSSessionDescription$Type;",
        "description",
        "",
        "<init>",
        "(Llive/hms/video/connection/models/HMSSessionDescription$Type;Ljava/lang/String;)V",
        "getType",
        "()Llive/hms/video/connection/models/HMSSessionDescription$Type;",
        "getDescription",
        "()Ljava/lang/String;",
        "toSDP",
        "Llive/hms/video/connection/models/HMSSessionDescription;",
        "component1",
        "component2",
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
.field private final description:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sdp"
    .end annotation
.end field

.field private final type:Llive/hms/video/connection/models/HMSSessionDescription$Type;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "type"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Llive/hms/video/connection/models/HMSSessionDescription$Type;Ljava/lang/String;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Llive/hms/video/signal/jsonrpc/models/HMSParams;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;->type:Llive/hms/video/connection/models/HMSSessionDescription$Type;

    iput-object p2, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;->description:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;Llive/hms/video/connection/models/HMSSessionDescription$Type;Ljava/lang/String;ILjava/lang/Object;)Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;->type:Llive/hms/video/connection/models/HMSSessionDescription$Type;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;->description:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2}, Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;->copy(Llive/hms/video/connection/models/HMSSessionDescription$Type;Ljava/lang/String;)Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Llive/hms/video/connection/models/HMSSessionDescription$Type;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;->type:Llive/hms/video/connection/models/HMSSessionDescription$Type;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Llive/hms/video/connection/models/HMSSessionDescription$Type;Ljava/lang/String;)Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;

    invoke-direct {v0, p1, p2}, Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;-><init>(Llive/hms/video/connection/models/HMSSessionDescription$Type;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;->type:Llive/hms/video/connection/models/HMSSessionDescription$Type;

    iget-object v3, p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;->type:Llive/hms/video/connection/models/HMSSessionDescription$Type;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;->description:Ljava/lang/String;

    iget-object p1, p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;->description:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Llive/hms/video/connection/models/HMSSessionDescription$Type;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;->type:Llive/hms/video/connection/models/HMSSessionDescription$Type;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;->type:Llive/hms/video/connection/models/HMSSessionDescription$Type;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;->description:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toSDP()Llive/hms/video/connection/models/HMSSessionDescription;
    .locals 6

    new-instance v0, Llive/hms/video/connection/models/HMSSessionDescription;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;->type:Llive/hms/video/connection/models/HMSSessionDescription$Type;

    iget-object v2, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;->description:Ljava/lang/String;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Llive/hms/video/connection/models/HMSSessionDescription;-><init>(Llive/hms/video/connection/models/HMSSessionDescription$Type;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Offer(type="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;->type:Llive/hms/video/connection/models/HMSSessionDescription$Type;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;->description:Ljava/lang/String;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
