.class public final Lcom/whoop/domain/model/Invitation;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/domain/model/Invitation$Type;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0086\u0008\u0018\u00002\u00020\u0001:\u0001\u001bB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J5\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019H\u00d6\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/whoop/domain/model/Invitation;",
        "",
        "inviteCode",
        "",
        "type",
        "Lcom/whoop/domain/model/Invitation$Type;",
        "teamName",
        "teamIcon",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/domain/model/Invitation$Type;Ljava/lang/String;Ljava/lang/String;)V",
        "getInviteCode",
        "()Ljava/lang/String;",
        "getType",
        "()Lcom/whoop/domain/model/Invitation$Type;",
        "getTeamName",
        "getTeamIcon",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "Type",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final inviteCode:Ljava/lang/String;

.field private final teamIcon:Ljava/lang/String;

.field private final teamName:Ljava/lang/String;

.field private final type:Lcom/whoop/domain/model/Invitation$Type;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/whoop/domain/model/Invitation$Type;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "inviteCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/domain/model/Invitation;->inviteCode:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/whoop/domain/model/Invitation;->type:Lcom/whoop/domain/model/Invitation$Type;

    .line 4
    iput-object p3, p0, Lcom/whoop/domain/model/Invitation;->teamName:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/whoop/domain/model/Invitation;->teamIcon:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/domain/model/Invitation$Type;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    move-object p4, v0

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/domain/model/Invitation;-><init>(Ljava/lang/String;Lcom/whoop/domain/model/Invitation$Type;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/domain/model/Invitation;Ljava/lang/String;Lcom/whoop/domain/model/Invitation$Type;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/domain/model/Invitation;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/domain/model/Invitation;->inviteCode:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/domain/model/Invitation;->type:Lcom/whoop/domain/model/Invitation$Type;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/domain/model/Invitation;->teamName:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/domain/model/Invitation;->teamIcon:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/domain/model/Invitation;->copy(Ljava/lang/String;Lcom/whoop/domain/model/Invitation$Type;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/domain/model/Invitation;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/Invitation;->inviteCode:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/domain/model/Invitation$Type;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/Invitation;->type:Lcom/whoop/domain/model/Invitation$Type;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/Invitation;->teamName:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/Invitation;->teamIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/domain/model/Invitation$Type;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/domain/model/Invitation;
    .locals 1

    const-string v0, "inviteCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/domain/model/Invitation;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/domain/model/Invitation;-><init>(Ljava/lang/String;Lcom/whoop/domain/model/Invitation$Type;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/domain/model/Invitation;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/domain/model/Invitation;

    iget-object v1, p0, Lcom/whoop/domain/model/Invitation;->inviteCode:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/Invitation;->inviteCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/domain/model/Invitation;->type:Lcom/whoop/domain/model/Invitation$Type;

    iget-object v3, p1, Lcom/whoop/domain/model/Invitation;->type:Lcom/whoop/domain/model/Invitation$Type;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/domain/model/Invitation;->teamName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/Invitation;->teamName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/domain/model/Invitation;->teamIcon:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/domain/model/Invitation;->teamIcon:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getInviteCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/Invitation;->inviteCode:Ljava/lang/String;

    return-object v0
.end method

.method public final getTeamIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/Invitation;->teamIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getTeamName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/Invitation;->teamName:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Lcom/whoop/domain/model/Invitation$Type;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/Invitation;->type:Lcom/whoop/domain/model/Invitation$Type;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/domain/model/Invitation;->inviteCode:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/domain/model/Invitation;->type:Lcom/whoop/domain/model/Invitation$Type;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/domain/model/Invitation;->teamName:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/domain/model/Invitation;->teamIcon:Ljava/lang/String;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/domain/model/Invitation;->inviteCode:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/domain/model/Invitation;->type:Lcom/whoop/domain/model/Invitation$Type;

    iget-object v2, p0, Lcom/whoop/domain/model/Invitation;->teamName:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/domain/model/Invitation;->teamIcon:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Invitation(inviteCode="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", teamName="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", teamIcon="

    const-string v1, ")"

    invoke-static {v4, v2, v0, v3, v1}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
