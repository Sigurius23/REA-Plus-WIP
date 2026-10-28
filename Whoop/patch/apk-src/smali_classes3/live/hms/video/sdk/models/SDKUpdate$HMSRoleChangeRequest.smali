.class public final Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;
.super Llive/hms/video/sdk/models/SDKUpdate;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/sdk/models/SDKUpdate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "HMSRoleChangeRequest"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B!\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J)\u0010\u0013\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0007H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001b"
    }
    d2 = {
        "Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;",
        "Llive/hms/video/sdk/models/SDKUpdate;",
        "requestedBy",
        "Llive/hms/video/sdk/models/HMSPeer;",
        "suggestedRole",
        "Llive/hms/video/sdk/models/role/HMSRole;",
        "token",
        "",
        "<init>",
        "(Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/models/role/HMSRole;Ljava/lang/String;)V",
        "getRequestedBy",
        "()Llive/hms/video/sdk/models/HMSPeer;",
        "getSuggestedRole",
        "()Llive/hms/video/sdk/models/role/HMSRole;",
        "getToken",
        "()Ljava/lang/String;",
        "component1",
        "component2",
        "component3",
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
.field private final requestedBy:Llive/hms/video/sdk/models/HMSPeer;

.field private final suggestedRole:Llive/hms/video/sdk/models/role/HMSRole;

.field private final token:Ljava/lang/String;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/models/role/HMSRole;Ljava/lang/String;)V
    .locals 1

    const-string v0, "suggestedRole"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "token"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Llive/hms/video/sdk/models/SDKUpdate;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;->requestedBy:Llive/hms/video/sdk/models/HMSPeer;

    iput-object p2, p0, Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;->suggestedRole:Llive/hms/video/sdk/models/role/HMSRole;

    iput-object p3, p0, Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;->token:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/models/role/HMSRole;Ljava/lang/String;ILjava/lang/Object;)Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;->requestedBy:Llive/hms/video/sdk/models/HMSPeer;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;->suggestedRole:Llive/hms/video/sdk/models/role/HMSRole;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;->token:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;->copy(Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/models/role/HMSRole;Ljava/lang/String;)Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Llive/hms/video/sdk/models/HMSPeer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;->requestedBy:Llive/hms/video/sdk/models/HMSPeer;

    return-object v0
.end method

.method public final component2()Llive/hms/video/sdk/models/role/HMSRole;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;->suggestedRole:Llive/hms/video/sdk/models/role/HMSRole;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;->token:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/models/role/HMSRole;Ljava/lang/String;)Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;
    .locals 1

    const-string v0, "suggestedRole"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "token"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;

    invoke-direct {v0, p1, p2, p3}, Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;-><init>(Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/models/role/HMSRole;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;

    iget-object v1, p0, Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;->requestedBy:Llive/hms/video/sdk/models/HMSPeer;

    iget-object v3, p1, Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;->requestedBy:Llive/hms/video/sdk/models/HMSPeer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;->suggestedRole:Llive/hms/video/sdk/models/role/HMSRole;

    iget-object v3, p1, Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;->suggestedRole:Llive/hms/video/sdk/models/role/HMSRole;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;->token:Ljava/lang/String;

    iget-object p1, p1, Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;->token:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getRequestedBy()Llive/hms/video/sdk/models/HMSPeer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;->requestedBy:Llive/hms/video/sdk/models/HMSPeer;

    return-object v0
.end method

.method public final getSuggestedRole()Llive/hms/video/sdk/models/role/HMSRole;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;->suggestedRole:Llive/hms/video/sdk/models/role/HMSRole;

    return-object v0
.end method

.method public final getToken()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;->token:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;->requestedBy:Llive/hms/video/sdk/models/HMSPeer;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;->suggestedRole:Llive/hms/video/sdk/models/role/HMSRole;

    invoke-virtual {v1}, Llive/hms/video/sdk/models/role/HMSRole;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;->token:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HMSRoleChangeRequest(requestedBy="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;->requestedBy:Llive/hms/video/sdk/models/HMSPeer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", suggestedRole="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;->suggestedRole:Llive/hms/video/sdk/models/role/HMSRole;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", token="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/SDKUpdate$HMSRoleChangeRequest;->token:Ljava/lang/String;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
