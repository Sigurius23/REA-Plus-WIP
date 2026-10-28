.class public final Lcom/whoop/domain/model/teams/TeamUser;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\tH\u00c6\u0003J=\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c6\u0001J\u0014\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u001d\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0005H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000fR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/whoop/domain/model/teams/TeamUser;",
        "",
        "id",
        "",
        "avatarUrl",
        "",
        "fullName",
        "userName",
        "privacyProfile",
        "Lcom/whoop/domain/model/teams/TeamPrivacyProfile;",
        "<init>",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/domain/model/teams/TeamPrivacyProfile;)V",
        "getId",
        "()I",
        "getAvatarUrl",
        "()Ljava/lang/String;",
        "getFullName",
        "getUserName",
        "getPrivacyProfile",
        "()Lcom/whoop/domain/model/teams/TeamPrivacyProfile;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
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
.field private final avatarUrl:Ljava/lang/String;

.field private final fullName:Ljava/lang/String;

.field private final id:I

.field private final privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

.field private final userName:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/domain/model/teams/TeamPrivacyProfile;)V
    .locals 1

    const-string v0, "fullName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userName"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "privacyProfile"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/whoop/domain/model/teams/TeamUser;->id:I

    iput-object p2, p0, Lcom/whoop/domain/model/teams/TeamUser;->avatarUrl:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/domain/model/teams/TeamUser;->fullName:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/domain/model/teams/TeamUser;->userName:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/domain/model/teams/TeamUser;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/domain/model/teams/TeamUser;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/domain/model/teams/TeamPrivacyProfile;ILjava/lang/Object;)Lcom/whoop/domain/model/teams/TeamUser;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lcom/whoop/domain/model/teams/TeamUser;->id:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/domain/model/teams/TeamUser;->avatarUrl:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/domain/model/teams/TeamUser;->fullName:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/domain/model/teams/TeamUser;->userName:Ljava/lang/String;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/domain/model/teams/TeamUser;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/domain/model/teams/TeamUser;->copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/domain/model/teams/TeamPrivacyProfile;)Lcom/whoop/domain/model/teams/TeamUser;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/TeamUser;->id:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUser;->avatarUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUser;->fullName:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUser;->userName:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/domain/model/teams/TeamPrivacyProfile;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUser;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/domain/model/teams/TeamPrivacyProfile;)Lcom/whoop/domain/model/teams/TeamUser;
    .locals 7

    const-string v0, "fullName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userName"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "privacyProfile"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/domain/model/teams/TeamUser;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/domain/model/teams/TeamUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/domain/model/teams/TeamPrivacyProfile;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/domain/model/teams/TeamUser;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/domain/model/teams/TeamUser;

    iget v1, p0, Lcom/whoop/domain/model/teams/TeamUser;->id:I

    iget v3, p1, Lcom/whoop/domain/model/teams/TeamUser;->id:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamUser;->avatarUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamUser;->avatarUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamUser;->fullName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamUser;->fullName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamUser;->userName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/TeamUser;->userName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamUser;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    iget-object p1, p1, Lcom/whoop/domain/model/teams/TeamUser;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAvatarUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUser;->avatarUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getFullName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUser;->fullName:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/TeamUser;->id:I

    return v0
.end method

.method public final getPrivacyProfile()Lcom/whoop/domain/model/teams/TeamPrivacyProfile;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUser;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    return-object v0
.end method

.method public final getUserName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamUser;->userName:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/whoop/domain/model/teams/TeamUser;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamUser;->avatarUrl:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamUser;->fullName:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamUser;->userName:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamUser;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    invoke-virtual {v1}, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget v0, p0, Lcom/whoop/domain/model/teams/TeamUser;->id:I

    iget-object v1, p0, Lcom/whoop/domain/model/teams/TeamUser;->avatarUrl:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/domain/model/teams/TeamUser;->fullName:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/domain/model/teams/TeamUser;->userName:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/domain/model/teams/TeamUser;->privacyProfile:Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    const-string v5, ", avatarUrl="

    const-string v6, ", fullName="

    const-string v7, "TeamUser(id="

    invoke-static {v0, v7, v5, v1, v6}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", userName="

    const-string v5, ", privacyProfile="

    invoke-static {v0, v2, v1, v3, v5}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
