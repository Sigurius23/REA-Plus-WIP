.class public final Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;
.super Llive/hms/video/signal/jsonrpc/models/HMSParams;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/signal/jsonrpc/models/HMSParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "BulkRoleChangeRequest"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B%\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0004H\u00c6\u0003J-\u0010\u0013\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0004H\u00d6\u0001R\u001c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001a"
    }
    d2 = {
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams;",
        "rolesList",
        "",
        "",
        "force",
        "",
        "toRoleName",
        "<init>",
        "(Ljava/util/List;ZLjava/lang/String;)V",
        "getRolesList",
        "()Ljava/util/List;",
        "getForce",
        "()Z",
        "getToRoleName",
        "()Ljava/lang/String;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
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
.field private final force:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "force"
    .end annotation
.end field

.field private final rolesList:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "roles"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final toRoleName:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "role"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;ZLjava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "rolesList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "toRoleName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Llive/hms/video/signal/jsonrpc/models/HMSParams;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;->rolesList:Ljava/util/List;

    iput-boolean p2, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;->force:Z

    iput-object p3, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;->toRoleName:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;Ljava/util/List;ZLjava/lang/String;ILjava/lang/Object;)Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;->rolesList:Ljava/util/List;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-boolean p2, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;->force:Z

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;->toRoleName:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;->copy(Ljava/util/List;ZLjava/lang/String;)Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;->rolesList:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;->force:Z

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;->toRoleName:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/util/List;ZLjava/lang/String;)Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/lang/String;",
            ")",
            "Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;"
        }
    .end annotation

    const-string v0, "rolesList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "toRoleName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;

    invoke-direct {v0, p1, p2, p3}, Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;-><init>(Ljava/util/List;ZLjava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;->rolesList:Ljava/util/List;

    iget-object v3, p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;->rolesList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;->force:Z

    iget-boolean v3, p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;->force:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;->toRoleName:Ljava/lang/String;

    iget-object p1, p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;->toRoleName:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getForce()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;->force:Z

    return v0
.end method

.method public final getRolesList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;->rolesList:Ljava/util/List;

    return-object v0
.end method

.method public final getToRoleName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;->toRoleName:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;->rolesList:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;->force:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;->toRoleName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "BulkRoleChangeRequest(rolesList="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;->rolesList:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", force="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;->force:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", toRoleName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;->toRoleName:Ljava/lang/String;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
