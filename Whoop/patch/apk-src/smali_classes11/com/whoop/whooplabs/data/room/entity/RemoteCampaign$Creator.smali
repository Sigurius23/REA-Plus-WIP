.class public final Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;",
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
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;
    .locals 7

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    const/4 v5, 0x1

    if-eq v4, v1, :cond_0

    sget-object v6, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1
    invoke-static {v6, p1, v2, v4, v5}, Lnh3/a;->b(Landroid/os/Parcelable$Creator;Landroid/os/Parcel;Ljava/util/ArrayList;II)I

    move-result v4

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    if-eq v3, v1, :cond_1

    sget-object v6, Lcom/whoop/whooplabs/data/domain/LegalDocument;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 3
    invoke-static {v6, p1, v4, v3, v5}, Lnh3/a;->b(Landroid/os/Parcelable$Creator;Landroid/os/Parcel;Ljava/util/ArrayList;II)I

    move-result v3

    goto :goto_1

    .line 4
    :cond_1
    new-instance p1, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    invoke-direct {p1, v0, v2, v4}, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;-><init>(Lcom/whoop/whooplabs/data/domain/LabsCampaign;Ljava/util/List;Ljava/util/List;)V

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 7
    invoke-virtual {p0, p1}, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign$Creator;->newArray(I)[Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    move-result-object p1

    return-object p1
.end method
