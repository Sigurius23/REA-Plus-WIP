.class public final Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0013\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\t\"\u0004\u0008\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\t\"\u0004\u0008\u000f\u0010\u000b\u00a8\u0006\u001a"
    }
    d2 = {
        "Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;",
        "",
        "admin",
        "",
        "read",
        "write",
        "<init>",
        "(ZZZ)V",
        "getAdmin",
        "()Z",
        "setAdmin",
        "(Z)V",
        "getRead",
        "setRead",
        "getWrite",
        "setWrite",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "other",
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
.field private admin:Z

.field private read:Z

.field private write:Z


# direct methods
.method public constructor <init>(ZZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;->admin:Z

    iput-boolean p2, p0, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;->read:Z

    iput-boolean p3, p0, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;->write:Z

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;ZZZILjava/lang/Object;)Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-boolean p1, p0, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;->admin:Z

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-boolean p2, p0, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;->read:Z

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-boolean p3, p0, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;->write:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;->copy(ZZZ)Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;->admin:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;->read:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;->write:Z

    return v0
.end method

.method public final copy(ZZZ)Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;
    .locals 1

    new-instance v0, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;

    invoke-direct {v0, p1, p2, p3}, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;-><init>(ZZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;

    iget-boolean v1, p0, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;->admin:Z

    iget-boolean v3, p1, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;->admin:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;->read:Z

    iget-boolean v3, p1, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;->read:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;->write:Z

    iget-boolean p1, p1, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;->write:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getAdmin()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;->admin:Z

    return v0
.end method

.method public final getRead()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;->read:Z

    return v0
.end method

.method public final getWrite()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;->write:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;->admin:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;->read:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;->write:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final setAdmin(Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;->admin:Z

    return-void
.end method

.method public final setRead(Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;->read:Z

    return-void
.end method

.method public final setWrite(Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;->write:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HMSWhiteBoardPermission(admin="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;->admin:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", read="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;->read:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", write="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;->write:Z

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lb9/y;->r(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
