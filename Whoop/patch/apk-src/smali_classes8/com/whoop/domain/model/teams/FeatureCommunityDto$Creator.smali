.class public final Lcom/whoop/domain/model/teams/FeatureCommunityDto$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/domain/model/teams/FeatureCommunityDto;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/whoop/domain/model/teams/FeatureCommunityDto;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/whoop/domain/model/teams/FeatureCommunityDto;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/whoop/domain/model/teams/FeatureCommunityDto;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v1, :cond_0

    move v1, v4

    move v4, v5

    move v6, v4

    goto :goto_0

    :cond_0
    move v1, v4

    move v6, v5

    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    move v7, v6

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v8

    if-eqz v8, :cond_1

    move v8, v7

    goto :goto_1

    :cond_1
    move v8, v7

    move v7, v1

    :goto_1
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v9

    if-eqz v9, :cond_2

    move v9, v8

    goto :goto_2

    :cond_2
    move v9, v8

    move v8, v1

    :goto_2
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v10

    if-eqz v10, :cond_3

    move v10, v9

    goto :goto_3

    :cond_3
    move v10, v9

    move v9, v1

    :goto_3
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v11

    move v12, v10

    move-object v10, v11

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v11

    move v13, v12

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v14

    if-eqz v14, :cond_4

    goto :goto_4

    :cond_4
    move v13, v1

    :goto_4
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v14, 0x0

    if-nez v1, :cond_5

    move-object v1, v14

    goto :goto_5

    :cond_5
    sget-object v1, Lcom/whoop/domain/model/teams/TeamType;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    :goto_5
    check-cast v1, Lcom/whoop/domain/model/teams/TeamType;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v15

    if-nez v15, :cond_6

    move-object v15, v14

    goto :goto_6

    :cond_6
    sget-object v15, Lcom/whoop/domain/model/teams/InviteCodeDto;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v15, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v15

    :goto_6
    check-cast v15, Lcom/whoop/domain/model/teams/InviteCodeDto;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v16

    if-nez v16, :cond_7

    goto :goto_7

    :cond_7
    sget-object v14, Lcom/whoop/domain/model/teams/MetaDataDto;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v14, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v14

    :goto_7
    move-object/from16 v16, v14

    check-cast v16, Lcom/whoop/domain/model/teams/MetaDataDto;

    move-object v14, v1

    invoke-direct/range {v2 .. v16}, Lcom/whoop/domain/model/teams/FeatureCommunityDto;-><init>(IZLjava/lang/String;IZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/domain/model/teams/TeamType;Lcom/whoop/domain/model/teams/InviteCodeDto;Lcom/whoop/domain/model/teams/MetaDataDto;)V

    return-object v2
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/domain/model/teams/FeatureCommunityDto$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/whoop/domain/model/teams/FeatureCommunityDto;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/whoop/domain/model/teams/FeatureCommunityDto;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/whoop/domain/model/teams/FeatureCommunityDto;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/domain/model/teams/FeatureCommunityDto$Creator;->newArray(I)[Lcom/whoop/domain/model/teams/FeatureCommunityDto;

    move-result-object p1

    return-object p1
.end method
