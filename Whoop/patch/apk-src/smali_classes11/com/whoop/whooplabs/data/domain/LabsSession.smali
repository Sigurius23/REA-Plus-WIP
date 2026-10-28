.class public final Lcom/whoop/whooplabs/data/domain/LabsSession;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\nJ\u001a\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\nJ\u001a\u0010\u001b\u001a\u00020\u001a2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u001d\u001a\u0004\u0008\u001e\u0010\n\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/domain/LabsSession;",
        "Landroid/os/Parcelable;",
        "",
        "campaignSessionId",
        "<init>",
        "(I)V",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;",
        "toDto",
        "()Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;",
        "describeContents",
        "()I",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "Ll83/a0;",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "component1",
        "copy",
        "(I)Lcom/whoop/whooplabs/data/domain/LabsSession;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getCampaignSessionId",
        "whooplabs_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/whoop/whooplabs/data/domain/LabsSession;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final campaignSessionId:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/whooplabs/data/domain/LabsSession$Creator;

    invoke-direct {v0}, Lcom/whoop/whooplabs/data/domain/LabsSession$Creator;-><init>()V

    sput-object v0, Lcom/whoop/whooplabs/data/domain/LabsSession;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/whoop/whooplabs/data/domain/LabsSession;->campaignSessionId:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/whooplabs/data/domain/LabsSession;IILjava/lang/Object;)Lcom/whoop/whooplabs/data/domain/LabsSession;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget p1, p0, Lcom/whoop/whooplabs/data/domain/LabsSession;->campaignSessionId:I

    :cond_0
    invoke-virtual {p0, p1}, Lcom/whoop/whooplabs/data/domain/LabsSession;->copy(I)Lcom/whoop/whooplabs/data/domain/LabsSession;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/domain/LabsSession;->campaignSessionId:I

    return v0
.end method

.method public final copy(I)Lcom/whoop/whooplabs/data/domain/LabsSession;
    .locals 1

    new-instance v0, Lcom/whoop/whooplabs/data/domain/LabsSession;

    invoke-direct {v0, p1}, Lcom/whoop/whooplabs/data/domain/LabsSession;-><init>(I)V

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/whooplabs/data/domain/LabsSession;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/whooplabs/data/domain/LabsSession;

    iget v1, p0, Lcom/whoop/whooplabs/data/domain/LabsSession;->campaignSessionId:I

    iget p1, p1, Lcom/whoop/whooplabs/data/domain/LabsSession;->campaignSessionId:I

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getCampaignSessionId()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/domain/LabsSession;->campaignSessionId:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/domain/LabsSession;->campaignSessionId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    return v0
.end method

.method public final toDto()Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;
    .locals 2

    new-instance v0, Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;

    iget v1, p0, Lcom/whoop/whooplabs/data/domain/LabsSession;->campaignSessionId:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;-><init>(Ljava/lang/Integer;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lcom/whoop/whooplabs/data/domain/LabsSession;->campaignSessionId:I

    const-string v1, "LabsSession(campaignSessionId="

    const-string v2, ")"

    invoke-static {v0, v1, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p0, Lcom/whoop/whooplabs/data/domain/LabsSession;->campaignSessionId:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
