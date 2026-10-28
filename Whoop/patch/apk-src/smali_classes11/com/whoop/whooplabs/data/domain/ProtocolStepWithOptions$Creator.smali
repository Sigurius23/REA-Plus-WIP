.class public final Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;",
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
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;
    .locals 6

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    :goto_0
    if-eq v3, v1, :cond_0

    sget-object v4, Lcom/whoop/whooplabs/data/domain/OptionSelection;->CREATOR:Landroid/os/Parcelable$Creator;

    const/4 v5, 0x1

    .line 1
    invoke-static {v4, p1, v2, v3, v5}, Lnh3/a;->b(Landroid/os/Parcelable$Creator;Landroid/os/Parcel;Ljava/util/ArrayList;II)I

    move-result v3

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v1, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    sget-object v1, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    :goto_1
    check-cast p1, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;

    new-instance v1, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;

    invoke-direct {v1, v0, v2, p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;-><init>(Lcom/whoop/whooplabs/data/domain/ProtocolStep;Ljava/util/List;Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;)V

    return-object v1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions$Creator;->newArray(I)[Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;

    move-result-object p1

    return-object p1
.end method
