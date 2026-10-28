.class public final Lcom/whoop/service/network/model/UserDtoKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "toUser",
        "Lcom/whoop/domain/model/User;",
        "Lcom/whoop/service/network/model/UserDto;",
        "core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final toUser(Lcom/whoop/service/network/model/UserDto;)Lcom/whoop/domain/model/User;
    .locals 19

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/service/network/model/UserDto;->getId()I

    move-result v2

    invoke-virtual {v1}, Lcom/whoop/service/network/model/UserDto;->getCreatedAt()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/service/network/model/UserDto;->getFirstName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/service/network/model/UserDto;->getLastName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/service/network/model/UserDto;->getCity()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/service/network/model/UserDto;->getCountry()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lcom/whoop/service/network/model/UserDto;->getAdminDivision()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, Lcom/whoop/service/network/model/UserDto;->getFullName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/service/network/model/UserDto;->getEmail()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/service/network/model/UserDto;->getUsername()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/service/network/model/UserDto;->getAvatarUrl()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    move-object v10, v0

    invoke-virtual {v1}, Lcom/whoop/service/network/model/UserDto;->getConcealed()Ljava/lang/Boolean;

    move-result-object v15

    invoke-virtual {v1}, Lcom/whoop/service/network/model/UserDto;->getProfile()Lcom/whoop/service/network/model/ProfileDto;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/whoop/service/network/model/ProfileDtoKt;->toUserProfile(Lcom/whoop/service/network/model/ProfileDto;)Lcom/whoop/domain/model/UserProfile;

    move-result-object v0

    :goto_0
    move-object v14, v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    new-instance v1, Lcom/whoop/domain/model/User;

    const/16 v17, 0x4040

    const/16 v18, 0x0

    const/4 v8, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v1 .. v18}, Lcom/whoop/domain/model/User;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/domain/model/UserProfile;Ljava/lang/Boolean;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
