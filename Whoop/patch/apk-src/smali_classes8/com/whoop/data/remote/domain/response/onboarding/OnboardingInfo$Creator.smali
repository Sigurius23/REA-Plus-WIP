.class public final Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;",
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
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;
    .locals 9

    .line 1
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    move v2, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    if-eqz v4, :cond_1

    move v4, v3

    goto :goto_1

    :cond_1
    move v4, v3

    move v3, v0

    :goto_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_2

    :cond_2
    move v4, v0

    :goto_2
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;->valueOf(Ljava/lang/String;)Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;

    move-result-object v5

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v6, 0x0

    if-nez v0, :cond_3

    move-object v0, v6

    goto :goto_3

    :cond_3
    sget-object v0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    :goto_3
    check-cast v0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    if-nez v7, :cond_4

    goto :goto_4

    :cond_4
    sget-object v6, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v6, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v6

    :goto_4
    move-object v7, v6

    check-cast v7, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v8

    move-object v6, v0

    invoke-direct/range {v1 .. v8}, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;-><init>(ZZZLcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;I)V

    return-object v1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo$Creator;->newArray(I)[Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;

    move-result-object p1

    return-object p1
.end method
