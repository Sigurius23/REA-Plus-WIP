.class public final Lcom/whoop/data/local/room/entity/TeamsDto$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/data/local/room/entity/TeamsDto;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/whoop/data/local/room/entity/TeamsDto;",
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
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/whoop/data/local/room/entity/TeamsDto;
    .locals 20

    .line 1
    move-object/from16 v0, p1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v4, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object v4, v1

    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v5

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v10

    sget-object v1, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    move v13, v3

    :goto_1
    if-eq v13, v1, :cond_1

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lcom/whoop/ui/ScoreContext;->valueOf(Ljava/lang/String;)Lcom/whoop/ui/ScoreContext;

    move-result-object v14

    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v13

    sget-object v1, Lcom/whoop/domain/model/teams/TeamType;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Lcom/whoop/domain/model/teams/TeamType;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v15

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v16

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    sget-object v1, Lcom/whoop/domain/model/teams/ChatChannel;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    :goto_2
    move-object/from16 v17, v2

    check-cast v17, Lcom/whoop/domain/model/teams/ChatChannel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_3

    const/4 v3, 0x1

    :cond_3
    move/from16 v18, v3

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v19

    new-instance v3, Lcom/whoop/data/local/room/entity/TeamsDto;

    invoke-direct/range {v3 .. v19}, Lcom/whoop/data/local/room/entity/TeamsDto;-><init>(Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/domain/model/teams/TeamPrivacyProfile;Ljava/util/List;ILcom/whoop/domain/model/teams/TeamType;IILcom/whoop/domain/model/teams/ChatChannel;ZI)V

    return-object v3
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/data/local/room/entity/TeamsDto$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/whoop/data/local/room/entity/TeamsDto;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/whoop/data/local/room/entity/TeamsDto;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/whoop/data/local/room/entity/TeamsDto;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/data/local/room/entity/TeamsDto$Creator;->newArray(I)[Lcom/whoop/data/local/room/entity/TeamsDto;

    move-result-object p1

    return-object p1
.end method
