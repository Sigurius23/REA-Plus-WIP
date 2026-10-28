.class public final Lcom/whoop/domain/model/teams/FeatureCommunityDto;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/domain/model/teams/FeatureCommunityDto$$serializer;,
        Lcom/whoop/domain/model/teams/FeatureCommunityDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008#\u0008\u0007\u0018\u0000 K2\u00020\u0001:\u0002LKB\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017B\u0099\u0001\u0008\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008\u0016\u0010\u001bJ\'\u0010$\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\r\u0010&\u001a\u00020%\u00a2\u0006\u0004\u0008&\u0010\'J\r\u0010(\u001a\u00020\u0002\u00a2\u0006\u0004\u0008(\u0010)J\u001d\u0010-\u001a\u00020!2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0002\u00a2\u0006\u0004\u0008-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010/\u001a\u0004\u00080\u0010)R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00101\u001a\u0004\u00082\u00103R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00104\u001a\u0004\u00085\u00106R\u001a\u0010\u0008\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010/\u001a\u0004\u00087\u0010)R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u00101\u001a\u0004\u00088\u00103R\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u00101\u001a\u0004\u00089\u00103R\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00101\u001a\u0004\u0008:\u00103R\u001c\u0010\u000c\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00104\u001a\u0004\u0008;\u00106R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u00104\u001a\u0004\u0008<\u00106R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u00104\u001a\u0004\u0008=\u00106R\u001a\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u00101\u001a\u0004\u0008>\u00103R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010?\u001a\u0004\u0008@\u0010AR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010B\u0012\u0004\u0008E\u0010F\u001a\u0004\u0008C\u0010DR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010G\u0012\u0004\u0008J\u0010F\u001a\u0004\u0008H\u0010I\u00a8\u0006M"
    }
    d2 = {
        "Lcom/whoop/domain/model/teams/FeatureCommunityDto;",
        "Landroid/os/Parcelable;",
        "",
        "id",
        "",
        "deleted",
        "",
        "name",
        "ownerId",
        "shareStrain",
        "shareRecovery",
        "shareSleep",
        "about",
        "banner",
        "avatar",
        "private",
        "Lcom/whoop/domain/model/teams/TeamType;",
        "teamType",
        "Lcom/whoop/domain/model/teams/InviteCodeDto;",
        "inviteCodeDto",
        "Lcom/whoop/domain/model/teams/MetaDataDto;",
        "metaDataDto",
        "<init>",
        "(IZLjava/lang/String;IZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/domain/model/teams/TeamType;Lcom/whoop/domain/model/teams/InviteCodeDto;Lcom/whoop/domain/model/teams/MetaDataDto;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IIZLjava/lang/String;IZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/domain/model/teams/TeamType;Lcom/whoop/domain/model/teams/InviteCodeDto;Lcom/whoop/domain/model/teams/MetaDataDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/domain/model/teams/FeatureCommunityDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/domain/model/teams/FeatureTeam;",
        "toFeatureTeam",
        "()Lcom/whoop/domain/model/teams/FeatureTeam;",
        "describeContents",
        "()I",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "I",
        "getId",
        "Z",
        "getDeleted",
        "()Z",
        "Ljava/lang/String;",
        "getName",
        "()Ljava/lang/String;",
        "getOwnerId",
        "getShareStrain",
        "getShareRecovery",
        "getShareSleep",
        "getAbout",
        "getBanner",
        "getAvatar",
        "getPrivate",
        "Lcom/whoop/domain/model/teams/TeamType;",
        "getTeamType",
        "()Lcom/whoop/domain/model/teams/TeamType;",
        "Lcom/whoop/domain/model/teams/InviteCodeDto;",
        "getInviteCodeDto",
        "()Lcom/whoop/domain/model/teams/InviteCodeDto;",
        "getInviteCodeDto$annotations",
        "()V",
        "Lcom/whoop/domain/model/teams/MetaDataDto;",
        "getMetaDataDto",
        "()Lcom/whoop/domain/model/teams/MetaDataDto;",
        "getMetaDataDto$annotations",
        "Companion",
        "$serializer",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/whoop/domain/model/teams/FeatureCommunityDto;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/whoop/domain/model/teams/FeatureCommunityDto$Companion;


# instance fields
.field private final about:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "about"
    .end annotation
.end field

.field private final avatar:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "avatar"
    .end annotation
.end field

.field private final banner:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "banner"
    .end annotation
.end field

.field private final deleted:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "deleted"
    .end annotation
.end field

.field private final id:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "id"
    .end annotation
.end field

.field private final inviteCodeDto:Lcom/whoop/domain/model/teams/InviteCodeDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "invite_code"
    .end annotation
.end field

.field private final metaDataDto:Lcom/whoop/domain/model/teams/MetaDataDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "metadata"
    .end annotation
.end field

.field private final name:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "name"
    .end annotation
.end field

.field private final ownerId:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "owner_id"
    .end annotation
.end field

.field private final private:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "private"
    .end annotation
.end field

.field private final shareRecovery:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "share_recovery"
    .end annotation
.end field

.field private final shareSleep:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "share_sleep"
    .end annotation
.end field

.field private final shareStrain:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "share_strain"
    .end annotation
.end field

.field private final teamType:Lcom/whoop/domain/model/teams/TeamType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "team_type"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/domain/model/teams/FeatureCommunityDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/domain/model/teams/FeatureCommunityDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->Companion:Lcom/whoop/domain/model/teams/FeatureCommunityDto$Companion;

    new-instance v0, Lcom/whoop/domain/model/teams/FeatureCommunityDto$Creator;

    invoke-direct {v0}, Lcom/whoop/domain/model/teams/FeatureCommunityDto$Creator;-><init>()V

    sput-object v0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->CREATOR:Landroid/os/Parcelable$Creator;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ls51/p;

    const/16 v3, 0x16

    invoke-direct {v2, v3}, Ls51/p;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/16 v2, 0xe

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v1, v2, v3

    const/4 v3, 0x4

    aput-object v1, v2, v3

    const/4 v3, 0x5

    aput-object v1, v2, v3

    const/4 v3, 0x6

    aput-object v1, v2, v3

    const/4 v3, 0x7

    aput-object v1, v2, v3

    const/16 v3, 0x8

    aput-object v1, v2, v3

    const/16 v3, 0x9

    aput-object v1, v2, v3

    const/16 v3, 0xa

    aput-object v1, v2, v3

    const/16 v3, 0xb

    aput-object v0, v2, v3

    const/16 v0, 0xc

    aput-object v1, v2, v0

    const/16 v0, 0xd

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(IIZLjava/lang/String;IZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/domain/model/teams/TeamType;Lcom/whoop/domain/model/teams/InviteCodeDto;Lcom/whoop/domain/model/teams/MetaDataDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit16 v0, p1, 0x3fff

    const/16 v1, 0x3fff

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/domain/model/teams/FeatureCommunityDto$$serializer;->INSTANCE:Lcom/whoop/domain/model/teams/FeatureCommunityDto$$serializer;

    invoke-virtual {v0}, Lcom/whoop/domain/model/teams/FeatureCommunityDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->id:I

    iput-boolean p3, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->deleted:Z

    iput-object p4, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->name:Ljava/lang/String;

    iput p5, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->ownerId:I

    iput-boolean p6, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->shareStrain:Z

    iput-boolean p7, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->shareRecovery:Z

    iput-boolean p8, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->shareSleep:Z

    iput-object p9, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->about:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->banner:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->avatar:Ljava/lang/String;

    iput-boolean p12, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->private:Z

    iput-object p13, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    move-object/from16 p1, p14

    iput-object p1, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->inviteCodeDto:Lcom/whoop/domain/model/teams/InviteCodeDto;

    move-object/from16 p1, p15

    iput-object p1, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->metaDataDto:Lcom/whoop/domain/model/teams/MetaDataDto;

    return-void
.end method

.method public constructor <init>(IZLjava/lang/String;IZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/domain/model/teams/TeamType;Lcom/whoop/domain/model/teams/InviteCodeDto;Lcom/whoop/domain/model/teams/MetaDataDto;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->id:I

    .line 4
    iput-boolean p2, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->deleted:Z

    .line 5
    iput-object p3, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->name:Ljava/lang/String;

    .line 6
    iput p4, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->ownerId:I

    .line 7
    iput-boolean p5, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->shareStrain:Z

    .line 8
    iput-boolean p6, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->shareRecovery:Z

    .line 9
    iput-boolean p7, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->shareSleep:Z

    .line 10
    iput-object p8, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->about:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->banner:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->avatar:Ljava/lang/String;

    .line 13
    iput-boolean p11, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->private:Z

    .line 14
    iput-object p12, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    .line 15
    iput-object p13, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->inviteCodeDto:Lcom/whoop/domain/model/teams/InviteCodeDto;

    .line 16
    iput-object p14, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->metaDataDto:Lcom/whoop/domain/model/teams/MetaDataDto;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.domain.model.teams.TeamType"

    invoke-static {}, Lcom/whoop/domain/model/teams/TeamType;->values()[Lcom/whoop/domain/model/teams/TeamType;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getInviteCodeDto$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "invite_code"
    .end annotation

    return-void
.end method

.method public static synthetic getMetaDataDto$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "metadata"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/domain/model/teams/FeatureCommunityDto;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget v2, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->id:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x1

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->deleted:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->name:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget v2, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->ownerId:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x4

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->shareStrain:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x5

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->shareRecovery:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x6

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->shareSleep:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->about:Ljava/lang/String;

    const/4 v3, 0x7

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x8

    iget-object v3, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->banner:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x9

    iget-object v3, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->avatar:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xa

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->private:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/16 v1, 0xb

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/domain/model/teams/InviteCodeDto$$serializer;->INSTANCE:Lcom/whoop/domain/model/teams/InviteCodeDto$$serializer;

    iget-object v1, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->inviteCodeDto:Lcom/whoop/domain/model/teams/InviteCodeDto;

    const/16 v2, 0xc

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/domain/model/teams/MetaDataDto$$serializer;->INSTANCE:Lcom/whoop/domain/model/teams/MetaDataDto$$serializer;

    iget-object p0, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->metaDataDto:Lcom/whoop/domain/model/teams/MetaDataDto;

    const/16 v1, 0xd

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getAbout()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->about:Ljava/lang/String;

    return-object v0
.end method

.method public final getAvatar()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->avatar:Ljava/lang/String;

    return-object v0
.end method

.method public final getBanner()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->banner:Ljava/lang/String;

    return-object v0
.end method

.method public final getDeleted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->deleted:Z

    return v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->id:I

    return v0
.end method

.method public final getInviteCodeDto()Lcom/whoop/domain/model/teams/InviteCodeDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->inviteCodeDto:Lcom/whoop/domain/model/teams/InviteCodeDto;

    return-object v0
.end method

.method public final getMetaDataDto()Lcom/whoop/domain/model/teams/MetaDataDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->metaDataDto:Lcom/whoop/domain/model/teams/MetaDataDto;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getOwnerId()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->ownerId:I

    return v0
.end method

.method public final getPrivate()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->private:Z

    return v0
.end method

.method public final getShareRecovery()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->shareRecovery:Z

    return v0
.end method

.method public final getShareSleep()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->shareSleep:Z

    return v0
.end method

.method public final getShareStrain()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->shareStrain:Z

    return v0
.end method

.method public final getTeamType()Lcom/whoop/domain/model/teams/TeamType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    return-object v0
.end method

.method public final toFeatureTeam()Lcom/whoop/domain/model/teams/FeatureTeam;
    .locals 13

    new-instance v0, Lcom/whoop/domain/model/teams/FeatureTeam;

    iget-object v1, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->name:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->about:Ljava/lang/String;

    const-string v3, ""

    if-nez v2, :cond_0

    move-object v2, v3

    :cond_0
    iget-object v4, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->avatar:Ljava/lang/String;

    if-nez v4, :cond_1

    move-object v4, v3

    :cond_1
    iget-object v5, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->banner:Ljava/lang/String;

    if-nez v5, :cond_2

    move-object v5, v3

    :cond_2
    iget-object v6, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->metaDataDto:Lcom/whoop/domain/model/teams/MetaDataDto;

    const/4 v7, 0x0

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Lcom/whoop/domain/model/teams/MetaDataDto;->getMemberCount()I

    move-result v6

    goto :goto_0

    :cond_3
    move v6, v7

    :goto_0
    iget-object v8, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->inviteCodeDto:Lcom/whoop/domain/model/teams/InviteCodeDto;

    if-eqz v8, :cond_5

    invoke-virtual {v8}, Lcom/whoop/domain/model/teams/InviteCodeDto;->getInviteCode()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_4

    goto :goto_1

    :cond_4
    move-object v3, v8

    :cond_5
    :goto_1
    iget-object v8, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    if-nez v8, :cond_6

    sget-object v8, Lcom/whoop/domain/model/teams/TeamType;->COMMUNITY:Lcom/whoop/domain/model/teams/TeamType;

    :cond_6
    iget-object v9, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->metaDataDto:Lcom/whoop/domain/model/teams/MetaDataDto;

    if-eqz v9, :cond_7

    invoke-virtual {v9}, Lcom/whoop/domain/model/teams/MetaDataDto;->getCommunityId()I

    move-result v7

    :cond_7
    move v9, v7

    const/16 v11, 0x200

    const/4 v12, 0x0

    move-object v7, v3

    move-object v3, v4

    move-object v4, v5

    const/4 v5, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v0 .. v12}, Lcom/whoop/domain/model/teams/FeatureTeam;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lcom/whoop/domain/model/teams/TeamType;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->id:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->deleted:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->ownerId:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->shareStrain:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->shareRecovery:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->shareSleep:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->about:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->banner:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->avatar:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->private:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->teamType:Lcom/whoop/domain/model/teams/TeamType;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/whoop/domain/model/teams/TeamType;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->inviteCodeDto:Lcom/whoop/domain/model/teams/InviteCodeDto;

    if-nez v0, :cond_1

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/whoop/domain/model/teams/InviteCodeDto;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-object v0, p0, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->metaDataDto:Lcom/whoop/domain/model/teams/MetaDataDto;

    if-nez v0, :cond_2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_2
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/whoop/domain/model/teams/MetaDataDto;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
