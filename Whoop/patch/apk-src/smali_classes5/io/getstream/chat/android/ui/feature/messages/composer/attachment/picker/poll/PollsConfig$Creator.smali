.class public final Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
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
.method public final createFromParcel(Landroid/os/Parcel;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;
    .locals 8

    .line 1
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v6, 0x0

    if-nez v0, :cond_0

    move-object v0, v6

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    if-nez v7, :cond_1

    :goto_1
    move-object v7, v6

    move-object v6, v0

    goto :goto_2

    :cond_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    goto :goto_1

    :goto_2
    invoke-direct/range {v1 .. v7}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-object v1
.end method

.method public final bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig$Creator;->createFromParcel(Landroid/os/Parcel;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;
    .locals 0

    .line 1
    new-array p1, p1, [Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    return-object p1
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2
    new-array p1, p1, [Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    return-object p1
.end method
