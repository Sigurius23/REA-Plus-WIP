.class public final Lcom/whoop/service/network/model/Sport$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/service/network/model/Sport;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/whoop/service/network/model/Sport;",
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
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/whoop/service/network/model/Sport;
    .locals 10

    .line 1
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/service/network/model/Sport;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v0, :cond_0

    move v0, v4

    move v4, v5

    move v6, v4

    goto :goto_0

    :cond_0
    move v0, v4

    move v6, v5

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/ui/activities/realtime/SportCategory;->valueOf(Ljava/lang/String;)Lcom/whoop/ui/activities/realtime/SportCategory;

    move-result-object v7

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v8

    if-eqz v8, :cond_1

    move v8, v6

    move-object v6, v7

    move v7, v8

    goto :goto_1

    :cond_1
    move v8, v6

    move-object v6, v7

    move v7, v0

    :goto_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v9

    if-eqz v9, :cond_2

    goto :goto_2

    :cond_2
    move v8, v0

    :goto_2
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v9

    invoke-direct/range {v1 .. v9}, Lcom/whoop/service/network/model/Sport;-><init>(ILjava/lang/String;ZLjava/lang/String;Lcom/whoop/ui/activities/realtime/SportCategory;ZZLjava/lang/String;)V

    return-object v1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/service/network/model/Sport$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/whoop/service/network/model/Sport;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/whoop/service/network/model/Sport;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/whoop/service/network/model/Sport;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/service/network/model/Sport$Creator;->newArray(I)[Lcom/whoop/service/network/model/Sport;

    move-result-object p1

    return-object p1
.end method
