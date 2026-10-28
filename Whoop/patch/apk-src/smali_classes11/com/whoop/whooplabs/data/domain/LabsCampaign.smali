.class public final Lcom/whoop/whooplabs/data/domain/LabsCampaign;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whooplabs/data/domain/LabsCampaign$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u0000\n\u0002\u0008\u0016\u0008\u0087\u0008\u0018\u0000 K2\u00020\u0001:\u0001KBw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0008\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0019\u0010\u0016J\r\u0010\u001a\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0002\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001bJ\u0010\u0010#\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010$J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010,J\u0018\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u00080\u00101J\u0088\u0001\u00102\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\u0010\u0008\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001\u00a2\u0006\u0004\u00082\u00103J\u0010\u00104\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u00084\u0010$J\u0010\u00105\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00085\u0010\u001bJ\u001a\u00108\u001a\u00020\u00142\u0008\u00107\u001a\u0004\u0018\u000106H\u00d6\u0003\u00a2\u0006\u0004\u00088\u00109R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010:\u001a\u0004\u0008;\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010<\u001a\u0004\u0008=\u0010$R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010<\u001a\u0004\u0008>\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010<\u001a\u0004\u0008?\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010@\u001a\u0004\u0008A\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010B\u001a\u0004\u0008C\u0010*R\u001c\u0010\u000c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010D\u001a\u0004\u0008E\u0010,R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010D\u001a\u0004\u0008F\u0010,R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010G\u001a\u0004\u0008H\u0010/R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010I\u001a\u0004\u0008J\u00101\u00a8\u0006L"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/domain/LabsCampaign;",
        "Landroid/os/Parcelable;",
        "",
        "campaignId",
        "",
        "description",
        "name",
        "subtitle",
        "Lorg/joda/time/LocalDateTime;",
        "participationCooldownDate",
        "Lcom/whoop/whooplabs/data/domain/LabsProtocol;",
        "protocol",
        "additionalCollectionLength",
        "bthrAdditionalCollectionLength",
        "",
        "dataTypes",
        "Lcom/whoop/whooplabs/data/domain/LabsSession;",
        "session",
        "<init>",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalDateTime;Lcom/whoop/whooplabs/data/domain/LabsProtocol;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/whoop/whooplabs/data/domain/LabsSession;)V",
        "",
        "containsRawData",
        "()Ljava/lang/Boolean;",
        "containsPpg",
        "containsLabrador",
        "containsImuData",
        "describeContents",
        "()I",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "Ll83/a0;",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "component1",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "()Lorg/joda/time/LocalDateTime;",
        "component6",
        "()Lcom/whoop/whooplabs/data/domain/LabsProtocol;",
        "component7",
        "()Ljava/lang/Integer;",
        "component8",
        "component9",
        "()Ljava/util/List;",
        "component10",
        "()Lcom/whoop/whooplabs/data/domain/LabsSession;",
        "copy",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalDateTime;Lcom/whoop/whooplabs/data/domain/LabsProtocol;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/whoop/whooplabs/data/domain/LabsSession;)Lcom/whoop/whooplabs/data/domain/LabsCampaign;",
        "toString",
        "hashCode",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getCampaignId",
        "Ljava/lang/String;",
        "getDescription",
        "getName",
        "getSubtitle",
        "Lorg/joda/time/LocalDateTime;",
        "getParticipationCooldownDate",
        "Lcom/whoop/whooplabs/data/domain/LabsProtocol;",
        "getProtocol",
        "Ljava/lang/Integer;",
        "getAdditionalCollectionLength",
        "getBthrAdditionalCollectionLength",
        "Ljava/util/List;",
        "getDataTypes",
        "Lcom/whoop/whooplabs/data/domain/LabsSession;",
        "getSession",
        "Companion",
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
            "Lcom/whoop/whooplabs/data/domain/LabsCampaign;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/whoop/whooplabs/data/domain/LabsCampaign$Companion;

.field public static final IMU_ENTRY:Ljava/lang/String; = "imu_data"

.field public static final LABRADOR_ENTRY:Ljava/lang/String; = "labrador"

.field public static final PPG_ENTRY:Ljava/lang/String; = "ppg_data"

.field public static final RAW_ENTRY:Ljava/lang/String; = "raw_data"


# instance fields
.field private final additionalCollectionLength:Ljava/lang/Integer;

.field private final bthrAdditionalCollectionLength:Ljava/lang/Integer;

.field private final campaignId:I

.field private final dataTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final description:Ljava/lang/String;

.field private final name:Ljava/lang/String;

.field private final participationCooldownDate:Lorg/joda/time/LocalDateTime;

.field private final protocol:Lcom/whoop/whooplabs/data/domain/LabsProtocol;

.field private final session:Lcom/whoop/whooplabs/data/domain/LabsSession;

.field private final subtitle:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/whooplabs/data/domain/LabsCampaign$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whooplabs/data/domain/LabsCampaign$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->Companion:Lcom/whoop/whooplabs/data/domain/LabsCampaign$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->$stable:I

    new-instance v0, Lcom/whoop/whooplabs/data/domain/LabsCampaign$Creator;

    invoke-direct {v0}, Lcom/whoop/whooplabs/data/domain/LabsCampaign$Creator;-><init>()V

    sput-object v0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalDateTime;Lcom/whoop/whooplabs/data/domain/LabsProtocol;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/whoop/whooplabs/data/domain/LabsSession;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lorg/joda/time/LocalDateTime;",
            "Lcom/whoop/whooplabs/data/domain/LabsProtocol;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/whoop/whooplabs/data/domain/LabsSession;",
            ")V"
        }
    .end annotation

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->campaignId:I

    .line 3
    iput-object p2, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->description:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->name:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->subtitle:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->participationCooldownDate:Lorg/joda/time/LocalDateTime;

    .line 7
    iput-object p6, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->protocol:Lcom/whoop/whooplabs/data/domain/LabsProtocol;

    .line 8
    iput-object p7, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->additionalCollectionLength:Ljava/lang/Integer;

    .line 9
    iput-object p8, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->bthrAdditionalCollectionLength:Ljava/lang/Integer;

    .line 10
    iput-object p9, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->dataTypes:Ljava/util/List;

    .line 11
    iput-object p10, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->session:Lcom/whoop/whooplabs/data/domain/LabsSession;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalDateTime;Lcom/whoop/whooplabs/data/domain/LabsProtocol;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/whoop/whooplabs/data/domain/LabsSession;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p12, p11, 0x8

    const/4 v0, 0x0

    if-eqz p12, :cond_0

    move-object p4, v0

    :cond_0
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_1

    move-object p5, v0

    :cond_1
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_2

    move-object p7, v0

    :cond_2
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_3

    move-object p8, v0

    :cond_3
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_4

    .line 12
    sget-object p9, Lm83/y;->w:Lm83/y;

    :cond_4
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_5

    move-object p11, v0

    :goto_0
    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_5
    move-object p11, p10

    goto :goto_0

    .line 13
    :goto_1
    invoke-direct/range {p1 .. p11}, Lcom/whoop/whooplabs/data/domain/LabsCampaign;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalDateTime;Lcom/whoop/whooplabs/data/domain/LabsProtocol;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/whoop/whooplabs/data/domain/LabsSession;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/whooplabs/data/domain/LabsCampaign;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalDateTime;Lcom/whoop/whooplabs/data/domain/LabsProtocol;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/whoop/whooplabs/data/domain/LabsSession;ILjava/lang/Object;)Lcom/whoop/whooplabs/data/domain/LabsCampaign;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget p1, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->campaignId:I

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->description:Ljava/lang/String;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->name:Ljava/lang/String;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->subtitle:Ljava/lang/String;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->participationCooldownDate:Lorg/joda/time/LocalDateTime;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->protocol:Lcom/whoop/whooplabs/data/domain/LabsProtocol;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->additionalCollectionLength:Ljava/lang/Integer;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->bthrAdditionalCollectionLength:Ljava/lang/Integer;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->dataTypes:Ljava/util/List;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->session:Lcom/whoop/whooplabs/data/domain/LabsSession;

    :cond_9
    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalDateTime;Lcom/whoop/whooplabs/data/domain/LabsProtocol;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/whoop/whooplabs/data/domain/LabsSession;)Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->campaignId:I

    return v0
.end method

.method public final component10()Lcom/whoop/whooplabs/data/domain/LabsSession;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->session:Lcom/whoop/whooplabs/data/domain/LabsSession;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lorg/joda/time/LocalDateTime;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->participationCooldownDate:Lorg/joda/time/LocalDateTime;

    return-object v0
.end method

.method public final component6()Lcom/whoop/whooplabs/data/domain/LabsProtocol;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->protocol:Lcom/whoop/whooplabs/data/domain/LabsProtocol;

    return-object v0
.end method

.method public final component7()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->additionalCollectionLength:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component8()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->bthrAdditionalCollectionLength:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->dataTypes:Ljava/util/List;

    return-object v0
.end method

.method public final containsImuData()Ljava/lang/Boolean;
    .locals 2

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->dataTypes:Ljava/util/List;

    if-eqz v0, :cond_0

    const-string v1, "imu_data"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final containsLabrador()Ljava/lang/Boolean;
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->dataTypes:Ljava/util/List;

    if-eqz v0, :cond_3

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v3, "labrador"

    invoke-static {v1, v3, v2}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    :cond_2
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method public final containsPpg()Ljava/lang/Boolean;
    .locals 2

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->dataTypes:Ljava/util/List;

    if-eqz v0, :cond_0

    const-string v1, "ppg_data"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final containsRawData()Ljava/lang/Boolean;
    .locals 2

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->dataTypes:Ljava/util/List;

    if-eqz v0, :cond_0

    const-string v1, "raw_data"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalDateTime;Lcom/whoop/whooplabs/data/domain/LabsProtocol;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/whoop/whooplabs/data/domain/LabsSession;)Lcom/whoop/whooplabs/data/domain/LabsCampaign;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lorg/joda/time/LocalDateTime;",
            "Lcom/whoop/whooplabs/data/domain/LabsProtocol;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/whoop/whooplabs/data/domain/LabsSession;",
            ")",
            "Lcom/whoop/whooplabs/data/domain/LabsCampaign;"
        }
    .end annotation

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lcom/whoop/whooplabs/data/domain/LabsCampaign;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalDateTime;Lcom/whoop/whooplabs/data/domain/LabsProtocol;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/whoop/whooplabs/data/domain/LabsSession;)V

    return-object v1
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
    instance-of v1, p1, Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    iget v1, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->campaignId:I

    iget v3, p1, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->campaignId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->participationCooldownDate:Lorg/joda/time/LocalDateTime;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->participationCooldownDate:Lorg/joda/time/LocalDateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->protocol:Lcom/whoop/whooplabs/data/domain/LabsProtocol;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->protocol:Lcom/whoop/whooplabs/data/domain/LabsProtocol;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->additionalCollectionLength:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->additionalCollectionLength:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->bthrAdditionalCollectionLength:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->bthrAdditionalCollectionLength:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->dataTypes:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->dataTypes:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->session:Lcom/whoop/whooplabs/data/domain/LabsSession;

    iget-object p1, p1, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->session:Lcom/whoop/whooplabs/data/domain/LabsSession;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getAdditionalCollectionLength()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->additionalCollectionLength:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getBthrAdditionalCollectionLength()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->bthrAdditionalCollectionLength:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getCampaignId()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->campaignId:I

    return v0
.end method

.method public final getDataTypes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->dataTypes:Ljava/util/List;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getParticipationCooldownDate()Lorg/joda/time/LocalDateTime;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->participationCooldownDate:Lorg/joda/time/LocalDateTime;

    return-object v0
.end method

.method public final getProtocol()Lcom/whoop/whooplabs/data/domain/LabsProtocol;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->protocol:Lcom/whoop/whooplabs/data/domain/LabsProtocol;

    return-object v0
.end method

.method public final getSession()Lcom/whoop/whooplabs/data/domain/LabsSession;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->session:Lcom/whoop/whooplabs/data/domain/LabsSession;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->campaignId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->description:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->name:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->subtitle:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->participationCooldownDate:Lorg/joda/time/LocalDateTime;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lorg/joda/time/LocalDateTime;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->protocol:Lcom/whoop/whooplabs/data/domain/LabsProtocol;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/whooplabs/data/domain/LabsProtocol;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->additionalCollectionLength:Ljava/lang/Integer;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->bthrAdditionalCollectionLength:Ljava/lang/Integer;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->dataTypes:Ljava/util/List;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->session:Lcom/whoop/whooplabs/data/domain/LabsSession;

    if-nez v1, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Lcom/whoop/whooplabs/data/domain/LabsSession;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->campaignId:I

    iget-object v1, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->description:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->name:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->subtitle:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->participationCooldownDate:Lorg/joda/time/LocalDateTime;

    iget-object v5, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->protocol:Lcom/whoop/whooplabs/data/domain/LabsProtocol;

    iget-object v6, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->additionalCollectionLength:Ljava/lang/Integer;

    iget-object v7, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->bthrAdditionalCollectionLength:Ljava/lang/Integer;

    iget-object v8, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->dataTypes:Ljava/util/List;

    iget-object v9, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->session:Lcom/whoop/whooplabs/data/domain/LabsSession;

    const-string v10, ", description="

    const-string v11, ", name="

    const-string v12, "LabsCampaign(campaignId="

    invoke-static {v0, v12, v10, v1, v11}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", subtitle="

    const-string v10, ", participationCooldownDate="

    invoke-static {v0, v2, v1, v3, v10}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", additionalCollectionLength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", bthrAdditionalCollectionLength="

    const-string v2, ", dataTypes="

    invoke-static {v0, v6, v1, v7, v2}, Lr80/c;->A(Ljava/lang/StringBuilder;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", session="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->campaignId:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->description:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->subtitle:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->participationCooldownDate:Lorg/joda/time/LocalDateTime;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->protocol:Lcom/whoop/whooplabs/data/domain/LabsProtocol;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/whoop/whooplabs/data/domain/LabsProtocol;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->additionalCollectionLength:Ljava/lang/Integer;

    if-nez v0, :cond_1

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-static {p1, v1, v0}, Lc13/a;->u(Landroid/os/Parcel;ILjava/lang/Integer;)V

    :goto_1
    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->bthrAdditionalCollectionLength:Ljava/lang/Integer;

    if-nez v0, :cond_2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-static {p1, v1, v0}, Lc13/a;->u(Landroid/os/Parcel;ILjava/lang/Integer;)V

    :goto_2
    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->dataTypes:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object v0, p0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->session:Lcom/whoop/whooplabs/data/domain/LabsSession;

    if-nez v0, :cond_3

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_3
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/whoop/whooplabs/data/domain/LabsSession;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
