.class public final Lcom/whoop/domain/model/teams/TeamPrivacyProfile$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/domain/model/teams/TeamPrivacyProfile;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/whoop/domain/model/teams/TeamPrivacyProfile;",
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
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/whoop/domain/model/teams/TeamPrivacyProfile;
    .locals 11

    .line 1
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move-object v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    if-nez v4, :cond_1

    move-object v4, v2

    goto :goto_2

    :cond_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    if-eqz v4, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    :goto_2
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    if-nez v5, :cond_3

    move-object v5, v2

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/domain/model/teams/PrivacyType;->valueOf(Ljava/lang/String;)Lcom/whoop/domain/model/teams/PrivacyType;

    move-result-object v5

    :goto_3
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    if-nez v6, :cond_4

    move-object v6, v2

    goto :goto_4

    :cond_4
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/domain/model/teams/PrivacyType;->valueOf(Ljava/lang/String;)Lcom/whoop/domain/model/teams/PrivacyType;

    move-result-object v6

    :goto_4
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    if-nez v7, :cond_5

    move-object v7, v2

    goto :goto_5

    :cond_5
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/domain/model/teams/PrivacyType;->valueOf(Ljava/lang/String;)Lcom/whoop/domain/model/teams/PrivacyType;

    move-result-object v7

    :goto_5
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v8

    if-nez v8, :cond_6

    move-object v8, v2

    goto :goto_6

    :cond_6
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/domain/model/teams/PrivacyType;->valueOf(Ljava/lang/String;)Lcom/whoop/domain/model/teams/PrivacyType;

    move-result-object v8

    :goto_6
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v9

    if-nez v9, :cond_7

    move-object v9, v2

    goto :goto_7

    :cond_7
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/domain/model/teams/PrivacyType;->valueOf(Ljava/lang/String;)Lcom/whoop/domain/model/teams/PrivacyType;

    move-result-object v9

    :goto_7
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v10

    if-nez v10, :cond_8

    :goto_8
    move-object v10, v2

    move-object v2, v0

    goto :goto_9

    :cond_8
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/domain/model/teams/PrivacyType;->valueOf(Ljava/lang/String;)Lcom/whoop/domain/model/teams/PrivacyType;

    move-result-object v2

    goto :goto_8

    :goto_9
    invoke-direct/range {v1 .. v10}, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;)V

    return-object v1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/domain/model/teams/TeamPrivacyProfile$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/whoop/domain/model/teams/TeamPrivacyProfile;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/domain/model/teams/TeamPrivacyProfile$Creator;->newArray(I)[Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    move-result-object p1

    return-object p1
.end method
