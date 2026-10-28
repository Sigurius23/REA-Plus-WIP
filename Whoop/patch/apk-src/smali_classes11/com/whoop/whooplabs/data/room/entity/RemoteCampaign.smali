.class public final Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0087\u0008\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0004\u00a2\u0006\u0004\u0008\t\u0010\nJ\r\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J:\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\rJ\u001a\u0010\"\u001a\u00020!2\u0008\u0010 \u001a\u0004\u0018\u00010\u001fH\u00d6\u0003\u00a2\u0006\u0004\u0008\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010$\u001a\u0004\u0008%\u0010\u0015R \u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010&\u001a\u0004\u0008\'\u0010\u0017R \u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010&\u001a\u0004\u0008(\u0010\u0017\u00a8\u0006)"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;",
        "Landroid/os/Parcelable;",
        "Lcom/whoop/whooplabs/data/domain/LabsCampaign;",
        "campaign",
        "",
        "Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;",
        "protocolSteps",
        "Lcom/whoop/whooplabs/data/domain/LegalDocument;",
        "legalDocuments",
        "<init>",
        "(Lcom/whoop/whooplabs/data/domain/LabsCampaign;Ljava/util/List;Ljava/util/List;)V",
        "",
        "describeContents",
        "()I",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "Ll83/a0;",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "component1",
        "()Lcom/whoop/whooplabs/data/domain/LabsCampaign;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "copy",
        "(Lcom/whoop/whooplabs/data/domain/LabsCampaign;Ljava/util/List;Ljava/util/List;)Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/whooplabs/data/domain/LabsCampaign;",
        "getCampaign",
        "Ljava/util/List;",
        "getProtocolSteps",
        "getLegalDocuments",
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
.field public static final $stable:I = 0x8

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final campaign:Lcom/whoop/whooplabs/data/domain/LabsCampaign;

.field private final legalDocuments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/domain/LegalDocument;",
            ">;"
        }
    .end annotation
.end field

.field private final protocolSteps:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign$Creator;

    invoke-direct {v0}, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign$Creator;-><init>()V

    sput-object v0, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/whooplabs/data/domain/LabsCampaign;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whooplabs/data/domain/LabsCampaign;",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/domain/LegalDocument;",
            ">;)V"
        }
    .end annotation

    const-string v0, "campaign"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocolSteps"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "legalDocuments"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->campaign:Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    iput-object p2, p0, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->protocolSteps:Ljava/util/List;

    iput-object p3, p0, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->legalDocuments:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;Lcom/whoop/whooplabs/data/domain/LabsCampaign;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->campaign:Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->protocolSteps:Ljava/util/List;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->legalDocuments:Ljava/util/List;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->copy(Lcom/whoop/whooplabs/data/domain/LabsCampaign;Ljava/util/List;Ljava/util/List;)Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/whoop/whooplabs/data/domain/LabsCampaign;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->campaign:Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->protocolSteps:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/domain/LegalDocument;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->legalDocuments:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lcom/whoop/whooplabs/data/domain/LabsCampaign;Ljava/util/List;Ljava/util/List;)Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whooplabs/data/domain/LabsCampaign;",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/domain/LegalDocument;",
            ">;)",
            "Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;"
        }
    .end annotation

    const-string v0, "campaign"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocolSteps"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "legalDocuments"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;-><init>(Lcom/whoop/whooplabs/data/domain/LabsCampaign;Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->campaign:Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->campaign:Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->protocolSteps:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->protocolSteps:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->legalDocuments:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->legalDocuments:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getCampaign()Lcom/whoop/whooplabs/data/domain/LabsCampaign;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->campaign:Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    return-object v0
.end method

.method public final getLegalDocuments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/domain/LegalDocument;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->legalDocuments:Ljava/util/List;

    return-object v0
.end method

.method public final getProtocolSteps()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->protocolSteps:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->campaign:Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->protocolSteps:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->legalDocuments:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->campaign:Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    iget-object v1, p0, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->protocolSteps:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->legalDocuments:Ljava/util/List;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "RemoteCampaign(campaign="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", protocolSteps="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", legalDocuments="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v3, v2, v0}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->campaign:Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    invoke-virtual {v0, p1, p2}, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->protocolSteps:Ljava/util/List;

    invoke-static {v0, p1}, Ld13/a;->o(Ljava/util/List;Landroid/os/Parcel;)Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;

    invoke-virtual {v1, p1, p2}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->legalDocuments:Ljava/util/List;

    invoke-static {v0, p1}, Ld13/a;->o(Ljava/util/List;Landroid/os/Parcel;)Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/whooplabs/data/domain/LegalDocument;

    invoke-virtual {v1, p1, p2}, Lcom/whoop/whooplabs/data/domain/LegalDocument;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    :cond_1
    return-void
.end method
