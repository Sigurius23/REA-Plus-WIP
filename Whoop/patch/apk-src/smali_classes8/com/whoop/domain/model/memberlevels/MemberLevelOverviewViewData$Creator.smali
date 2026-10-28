.class public final Lcom/whoop/domain/model/memberlevels/MemberLevelOverviewViewData$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/domain/model/memberlevels/MemberLevelOverviewViewData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/whoop/domain/model/memberlevels/MemberLevelOverviewViewData;",
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
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/whoop/domain/model/memberlevels/MemberLevelOverviewViewData;
    .locals 2

    .line 1
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/domain/model/memberlevels/MemberLevelOverviewViewData;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    :goto_0
    check-cast v1, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    invoke-direct {v0, v1, p1}, Lcom/whoop/domain/model/memberlevels/MemberLevelOverviewViewData;-><init>(Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;Z)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/domain/model/memberlevels/MemberLevelOverviewViewData$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/whoop/domain/model/memberlevels/MemberLevelOverviewViewData;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/whoop/domain/model/memberlevels/MemberLevelOverviewViewData;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/whoop/domain/model/memberlevels/MemberLevelOverviewViewData;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/domain/model/memberlevels/MemberLevelOverviewViewData$Creator;->newArray(I)[Lcom/whoop/domain/model/memberlevels/MemberLevelOverviewViewData;

    move-result-object p1

    return-object p1
.end method
