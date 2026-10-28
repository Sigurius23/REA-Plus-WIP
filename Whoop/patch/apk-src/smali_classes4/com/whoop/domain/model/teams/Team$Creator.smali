.class public final Lcom/whoop/domain/model/teams/Team$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/domain/model/teams/Team;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/whoop/domain/model/teams/Team;",
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
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/whoop/domain/model/teams/Team;
    .locals 18

    .line 1
    move-object/from16 v0, p1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v8

    sget-object v1, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    move v11, v2

    :goto_0
    if-eq v11, v1, :cond_0

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/whoop/ui/ScoreContext;->valueOf(Ljava/lang/String;)Lcom/whoop/ui/ScoreContext;

    move-result-object v12

    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v11

    sget-object v1, Lcom/whoop/domain/model/teams/TeamType;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lcom/whoop/domain/model/teams/TeamType;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v13

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v14

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    sget-object v1, Lcom/whoop/domain/model/teams/ChatChannel;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    :goto_1
    move-object v15, v1

    check-cast v15, Lcom/whoop/domain/model/teams/ChatChannel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_2

    const/4 v2, 0x1

    :cond_2
    move/from16 v16, v2

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v17

    new-instance v2, Lcom/whoop/domain/model/teams/Team;

    invoke-direct/range {v2 .. v17}, Lcom/whoop/domain/model/teams/Team;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/domain/model/teams/TeamPrivacyProfile;Ljava/util/List;ILcom/whoop/domain/model/teams/TeamType;IILcom/whoop/domain/model/teams/ChatChannel;ZI)V

    return-object v2
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/domain/model/teams/Team$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/whoop/domain/model/teams/Team;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/whoop/domain/model/teams/Team;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/whoop/domain/model/teams/Team;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/domain/model/teams/Team$Creator;->newArray(I)[Lcom/whoop/domain/model/teams/Team;

    move-result-object p1

    return-object p1
.end method
