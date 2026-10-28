.class public final Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel$$serializer;,
        Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u001d\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001e\u0008\u0087\u0008\u0018\u0000 _2\u00020\u0001:\u0002`aB\u00a3\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u0012\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00010\r\u0012\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00010\r\u0012\u000e\u0008\u0002\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00010\r\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aB\u00b3\u0001\u0008\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0004\u0008\u0019\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\"J\u0010\u0010$\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010%J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010 J\u0010\u0010(\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0016\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0016\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010+J\u0016\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010+J\u0012\u0010.\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0004\u00080\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0004\u00082\u00103J\u0010\u00104\u001a\u00020\u0017H\u00c6\u0003\u00a2\u0006\u0004\u00084\u00105J\u00b8\u0001\u00106\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00010\r2\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00010\r2\u000e\u0008\u0002\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00010\r2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0017H\u00c6\u0001\u00a2\u0006\u0004\u00086\u00107J\u0010\u00108\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00088\u0010 J\u0010\u00109\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u00089\u0010\"J\u001a\u0010=\u001a\u00020<2\u0008\u0010;\u001a\u0004\u0018\u00010:H\u00d6\u0003\u00a2\u0006\u0004\u0008=\u0010>J\'\u0010G\u001a\u00020D2\u0006\u0010?\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020BH\u0001\u00a2\u0006\u0004\u0008E\u0010FR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010H\u001a\u0004\u0008I\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010J\u001a\u0004\u0008K\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010J\u001a\u0004\u0008L\u0010\"R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010M\u001a\u0004\u0008N\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010M\u001a\u0004\u0008O\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010H\u001a\u0004\u0008P\u0010 R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010Q\u001a\u0004\u0008R\u0010)R\u001d\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010S\u001a\u0004\u0008T\u0010+R\u001d\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010S\u001a\u0004\u0008U\u0010+R\u001d\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010S\u001a\u0004\u0008V\u0010+R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010W\u001a\u0004\u0008X\u0010/R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010Y\u001a\u0004\u0008Z\u00101R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010[\u001a\u0004\u0008\\\u00103R\u0017\u0010\u0018\u001a\u00020\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010]\u001a\u0004\u0008^\u00105\u00a8\u0006b"
    }
    d2 = {
        "Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "",
        "progressSegmentCount",
        "activeSegmentIndex",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "nextAction",
        "backAction",
        "backgroundImageUrl",
        "",
        "photoRevealFraction",
        "",
        "items",
        "headerOverlayItems",
        "footerOverlayItems",
        "Lcom/whoop/design/models/AchievementsBackgroundStyle;",
        "achievementBackgroundStyle",
        "Lcom/whoop/design/models/colortheme/ColorThemeModel;",
        "colors",
        "Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;",
        "securityPolicy",
        "Lxq0/a;",
        "borderStyle",
        "<init>",
        "(Ljava/lang/String;IILcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;FLjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Lcom/whoop/design/models/colortheme/ColorThemeModel;Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;Lxq0/a;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;IILcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;FLjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Lcom/whoop/design/models/colortheme/ColorThemeModel;Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;Lxq0/a;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()I",
        "component3",
        "component4",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "component5",
        "component6",
        "component7",
        "()F",
        "component8",
        "()Ljava/util/List;",
        "component9",
        "component10",
        "component11",
        "()Lcom/whoop/design/models/AchievementsBackgroundStyle;",
        "component12",
        "()Lcom/whoop/design/models/colortheme/ColorThemeModel;",
        "component13",
        "()Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;",
        "component14",
        "()Lxq0/a;",
        "copy",
        "(Ljava/lang/String;IILcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;FLjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Lcom/whoop/design/models/colortheme/ColorThemeModel;Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;Lxq0/a;)Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;",
        "toString",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$community_everyday_stats_release",
        "(Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "I",
        "getProgressSegmentCount",
        "getActiveSegmentIndex",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getNextAction",
        "getBackAction",
        "getBackgroundImageUrl",
        "F",
        "getPhotoRevealFraction",
        "Ljava/util/List;",
        "getItems",
        "getHeaderOverlayItems",
        "getFooterOverlayItems",
        "Lcom/whoop/design/models/AchievementsBackgroundStyle;",
        "getAchievementBackgroundStyle",
        "Lcom/whoop/design/models/colortheme/ColorThemeModel;",
        "getColors",
        "Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;",
        "getSecurityPolicy",
        "Lxq0/a;",
        "getBorderStyle",
        "Companion",
        "$serializer",
        "a",
        "community-everyday-stats_release"
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

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel$a;


# instance fields
.field private final achievementBackgroundStyle:Lcom/whoop/design/models/AchievementsBackgroundStyle;

.field private final activeSegmentIndex:I

.field private final backAction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final backgroundImageUrl:Ljava/lang/String;

.field private final borderStyle:Lxq0/a;

.field private final colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

.field private final footerOverlayItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final headerOverlayItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final id:Ljava/lang/String;

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final nextAction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final photoRevealFraction:F

.field private final progressSegmentCount:I

.field private final securityPolicy:Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->Companion:Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lxo1/a;

    const/4 v4, 0x3

    invoke-direct {v3, v4}, Lxo1/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lxo1/a;

    const/4 v6, 0x4

    invoke-direct {v5, v6}, Lxo1/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Lxo1/a;

    const/4 v8, 0x5

    invoke-direct {v7, v8}, Lxo1/a;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v7

    new-instance v9, Lxo1/a;

    const/4 v10, 0x6

    invoke-direct {v9, v10}, Lxo1/a;-><init>(I)V

    invoke-static {v2, v9}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v9, 0xe

    new-array v9, v9, [Ll83/h;

    const/4 v11, 0x0

    aput-object v1, v9, v11

    const/4 v11, 0x1

    aput-object v1, v9, v11

    const/4 v11, 0x2

    aput-object v1, v9, v11

    aput-object v1, v9, v4

    aput-object v1, v9, v6

    aput-object v1, v9, v8

    aput-object v1, v9, v10

    const/4 v4, 0x7

    aput-object v3, v9, v4

    aput-object v5, v9, v0

    const/16 v0, 0x9

    aput-object v7, v9, v0

    const/16 v0, 0xa

    aput-object v1, v9, v0

    const/16 v0, 0xb

    aput-object v1, v9, v0

    const/16 v0, 0xc

    aput-object v1, v9, v0

    const/16 v0, 0xd

    aput-object v2, v9, v0

    sput-object v9, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;IILcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;FLjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Lcom/whoop/design/models/colortheme/ColorThemeModel;Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;Lxq0/a;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit8 v0, p1, 0x3f

    const/16 v1, 0x3f

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel$$serializer;->INSTANCE:Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel$$serializer;

    invoke-virtual {v0}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->id:Ljava/lang/String;

    iput p3, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->progressSegmentCount:I

    iput p4, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->activeSegmentIndex:I

    iput-object p5, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->nextAction:Lcom/whoop/navigation/models/GenericInteraction;

    iput-object p6, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->backAction:Lcom/whoop/navigation/models/GenericInteraction;

    iput-object p7, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->backgroundImageUrl:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_1

    const/4 p2, 0x0

    iput p2, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->photoRevealFraction:F

    goto :goto_0

    :cond_1
    iput p8, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->photoRevealFraction:F

    :goto_0
    and-int/lit16 p2, p1, 0x80

    sget-object p3, Lm83/y;->w:Lm83/y;

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->items:Ljava/util/List;

    goto :goto_1

    :cond_2
    iput-object p9, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->items:Ljava/util/List;

    :goto_1
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->headerOverlayItems:Ljava/util/List;

    goto :goto_2

    :cond_3
    iput-object p10, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->headerOverlayItems:Ljava/util/List;

    :goto_2
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->footerOverlayItems:Ljava/util/List;

    goto :goto_3

    :cond_4
    iput-object p11, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->footerOverlayItems:Ljava/util/List;

    :goto_3
    and-int/lit16 p2, p1, 0x400

    const/4 p3, 0x0

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->achievementBackgroundStyle:Lcom/whoop/design/models/AchievementsBackgroundStyle;

    goto :goto_4

    :cond_5
    iput-object p12, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->achievementBackgroundStyle:Lcom/whoop/design/models/AchievementsBackgroundStyle;

    :goto_4
    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_6

    iput-object p3, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    goto :goto_5

    :cond_6
    iput-object p13, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    :goto_5
    and-int/lit16 p2, p1, 0x1000

    if-nez p2, :cond_7

    iput-object p3, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->securityPolicy:Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;

    goto :goto_6

    :cond_7
    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->securityPolicy:Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;

    :goto_6
    and-int/lit16 p1, p1, 0x2000

    if-nez p1, :cond_8

    .line 2
    sget-object p1, Lxq0/a;->SOLID:Lxq0/a;

    .line 3
    :goto_7
    iput-object p1, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->borderStyle:Lxq0/a;

    return-void

    :cond_8
    move-object/from16 p1, p15

    goto :goto_7
.end method

.method public constructor <init>(Ljava/lang/String;IILcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;FLjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Lcom/whoop/design/models/colortheme/ColorThemeModel;Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;Lxq0/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Ljava/lang/String;",
            "F",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/design/models/AchievementsBackgroundStyle;",
            "Lcom/whoop/design/models/colortheme/ColorThemeModel;",
            "Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;",
            "Lxq0/a;",
            ")V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextAction"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headerOverlayItems"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "footerOverlayItems"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "borderStyle"

    invoke-static {p14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->id:Ljava/lang/String;

    .line 6
    iput p2, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->progressSegmentCount:I

    .line 7
    iput p3, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->activeSegmentIndex:I

    .line 8
    iput-object p4, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->nextAction:Lcom/whoop/navigation/models/GenericInteraction;

    .line 9
    iput-object p5, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->backAction:Lcom/whoop/navigation/models/GenericInteraction;

    .line 10
    iput-object p6, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->backgroundImageUrl:Ljava/lang/String;

    .line 11
    iput p7, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->photoRevealFraction:F

    .line 12
    iput-object p8, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->items:Ljava/util/List;

    .line 13
    iput-object p9, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->headerOverlayItems:Ljava/util/List;

    .line 14
    iput-object p10, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->footerOverlayItems:Ljava/util/List;

    .line 15
    iput-object p11, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->achievementBackgroundStyle:Lcom/whoop/design/models/AchievementsBackgroundStyle;

    .line 16
    iput-object p12, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    .line 17
    iput-object p13, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->securityPolicy:Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;

    .line 18
    iput-object p14, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->borderStyle:Lxq0/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IILcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;FLjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Lcom/whoop/design/models/colortheme/ColorThemeModel;Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;Lxq0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 17

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    move v9, v1

    goto :goto_0

    :cond_0
    move/from16 v9, p7

    :goto_0
    and-int/lit16 v1, v0, 0x80

    .line 19
    sget-object v2, Lm83/y;->w:Lm83/y;

    if-eqz v1, :cond_1

    move-object v10, v2

    goto :goto_1

    :cond_1
    move-object/from16 v10, p8

    :goto_1
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_2

    move-object v11, v2

    goto :goto_2

    :cond_2
    move-object/from16 v11, p9

    :goto_2
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_3

    move-object v12, v2

    goto :goto_3

    :cond_3
    move-object/from16 v12, p10

    :goto_3
    and-int/lit16 v1, v0, 0x400

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    move-object v13, v2

    goto :goto_4

    :cond_4
    move-object/from16 v13, p11

    :goto_4
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_5

    move-object v14, v2

    goto :goto_5

    :cond_5
    move-object/from16 v14, p12

    :goto_5
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_6

    move-object v15, v2

    goto :goto_6

    :cond_6
    move-object/from16 v15, p13

    :goto_6
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_7

    .line 20
    sget-object v0, Lxq0/a;->SOLID:Lxq0/a;

    move-object/from16 v16, v0

    :goto_7
    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move/from16 v4, p2

    move/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    goto :goto_8

    :cond_7
    move-object/from16 v16, p14

    goto :goto_7

    .line 21
    :goto_8
    invoke-direct/range {v2 .. v16}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;-><init>(Ljava/lang/String;IILcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;FLjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Lcom/whoop/design/models/colortheme/ColorThemeModel;Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;Lxq0/a;)V

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 7

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    new-instance v1, Lwc3/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    new-instance v5, Lwc3/e;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    new-array v6, v3, [Ljava/lang/annotation/Annotation;

    invoke-direct {v5, v2, v6}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v2, v3, [Lwc3/c;

    invoke-direct {v1, v4, v5, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 7

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    new-instance v1, Lwc3/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    new-instance v5, Lwc3/e;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    new-array v6, v3, [Ljava/lang/annotation/Annotation;

    invoke-direct {v5, v2, v6}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v2, v3, [Lwc3/c;

    invoke-direct {v1, v4, v5, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 7

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    new-instance v1, Lwc3/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    new-instance v5, Lwc3/e;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    new-array v6, v3, [Ljava/lang/annotation/Annotation;

    invoke-direct {v5, v2, v6}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v2, v3, [Lwc3/c;

    invoke-direct {v1, v4, v5, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.communityeverydaystats.domain.models.SnapshotContainerBorderStyle"

    invoke-static {}, Lxq0/a;->values()[Lxq0/a;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;Ljava/lang/String;IILcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;FLjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Lcom/whoop/design/models/colortheme/ColorThemeModel;Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;Lxq0/a;ILjava/lang/Object;)Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;
    .locals 14

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    iget v2, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->progressSegmentCount:I

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    iget v3, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->activeSegmentIndex:I

    goto :goto_2

    :cond_2
    move/from16 v3, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    iget-object v4, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->nextAction:Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_3

    :cond_3
    move-object/from16 v4, p4

    :goto_3
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_4

    iget-object v5, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->backAction:Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_4

    :cond_4
    move-object/from16 v5, p5

    :goto_4
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    iget-object v6, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->backgroundImageUrl:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v6, p6

    :goto_5
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_6

    iget v7, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->photoRevealFraction:F

    goto :goto_6

    :cond_6
    move/from16 v7, p7

    :goto_6
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_7

    iget-object v8, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->items:Ljava/util/List;

    goto :goto_7

    :cond_7
    move-object/from16 v8, p8

    :goto_7
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_8

    iget-object v9, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->headerOverlayItems:Ljava/util/List;

    goto :goto_8

    :cond_8
    move-object/from16 v9, p9

    :goto_8
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    iget-object v10, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->footerOverlayItems:Ljava/util/List;

    goto :goto_9

    :cond_9
    move-object/from16 v10, p10

    :goto_9
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_a

    iget-object v11, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->achievementBackgroundStyle:Lcom/whoop/design/models/AchievementsBackgroundStyle;

    goto :goto_a

    :cond_a
    move-object/from16 v11, p11

    :goto_a
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_b

    iget-object v12, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    goto :goto_b

    :cond_b
    move-object/from16 v12, p12

    :goto_b
    and-int/lit16 v13, v0, 0x1000

    if-eqz v13, :cond_c

    iget-object v13, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->securityPolicy:Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;

    goto :goto_c

    :cond_c
    move-object/from16 v13, p13

    :goto_c
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->borderStyle:Lxq0/a;

    move-object/from16 p15, v0

    :goto_d
    move-object p1, p0

    move-object/from16 p2, v1

    move/from16 p3, v2

    move/from16 p4, v3

    move-object/from16 p5, v4

    move-object/from16 p6, v5

    move-object/from16 p7, v6

    move/from16 p8, v7

    move-object/from16 p9, v8

    move-object/from16 p10, v9

    move-object/from16 p11, v10

    move-object/from16 p12, v11

    move-object/from16 p13, v12

    move-object/from16 p14, v13

    goto :goto_e

    :cond_d
    move-object/from16 p15, p14

    goto :goto_d

    :goto_e
    invoke-virtual/range {p1 .. p15}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->copy(Ljava/lang/String;IILcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;FLjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Lcom/whoop/design/models/colortheme/ColorThemeModel;Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;Lxq0/a;)Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$community_everyday_stats_release(Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget v2, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->progressSegmentCount:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x2

    iget v2, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->activeSegmentIndex:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    sget-object v1, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object v2, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->nextAction:Lcom/whoop/navigation/models/GenericInteraction;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->backAction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->backgroundImageUrl:Ljava/lang/String;

    const/4 v3, 0x5

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget v2, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->photoRevealFraction:F

    const/4 v3, 0x0

    invoke-static {v2, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v2

    if-eqz v2, :cond_1

    :goto_0
    iget v2, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->photoRevealFraction:F

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    :cond_1
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    sget-object v3, Lm83/y;->w:Lm83/y;

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->items:Ljava/util/List;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->items:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->headerOverlayItems:Ljava/util/List;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :goto_2
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->headerOverlayItems:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->footerOverlayItems:Ljava/util/List;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :goto_3
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->footerOverlayItems:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/16 v1, 0xa

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->achievementBackgroundStyle:Lcom/whoop/design/models/AchievementsBackgroundStyle;

    if-eqz v2, :cond_9

    :goto_4
    sget-object v2, Lcom/whoop/design/models/AchievementsBackgroundStyleSerializer;->INSTANCE:Lcom/whoop/design/models/AchievementsBackgroundStyleSerializer;

    iget-object v3, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->achievementBackgroundStyle:Lcom/whoop/design/models/AchievementsBackgroundStyle;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/16 v1, 0xb

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    if-eqz v2, :cond_b

    :goto_5
    sget-object v2, Lcom/whoop/design/models/colortheme/ColorThemeModel$$serializer;->INSTANCE:Lcom/whoop/design/models/colortheme/ColorThemeModel$$serializer;

    iget-object v3, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/16 v1, 0xc

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->securityPolicy:Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;

    if-eqz v2, :cond_d

    :goto_6
    sget-object v2, Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel$$serializer;->INSTANCE:Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel$$serializer;

    iget-object v3, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->securityPolicy:Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/16 v1, 0xd

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_7

    :cond_e
    iget-object v2, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->borderStyle:Lxq0/a;

    sget-object v3, Lxq0/a;->SOLID:Lxq0/a;

    if-eq v2, v3, :cond_f

    :goto_7
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->borderStyle:Lxq0/a;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->footerOverlayItems:Ljava/util/List;

    return-object v0
.end method

.method public final component11()Lcom/whoop/design/models/AchievementsBackgroundStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->achievementBackgroundStyle:Lcom/whoop/design/models/AchievementsBackgroundStyle;

    return-object v0
.end method

.method public final component12()Lcom/whoop/design/models/colortheme/ColorThemeModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    return-object v0
.end method

.method public final component13()Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->securityPolicy:Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;

    return-object v0
.end method

.method public final component14()Lxq0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->borderStyle:Lxq0/a;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->progressSegmentCount:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->activeSegmentIndex:I

    return v0
.end method

.method public final component4()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->nextAction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final component5()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->backAction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->backgroundImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()F
    .locals 1

    iget v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->photoRevealFraction:F

    return v0
.end method

.method public final component8()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->items:Ljava/util/List;

    return-object v0
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->headerOverlayItems:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;IILcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;FLjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Lcom/whoop/design/models/colortheme/ColorThemeModel;Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;Lxq0/a;)Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Ljava/lang/String;",
            "F",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/design/models/AchievementsBackgroundStyle;",
            "Lcom/whoop/design/models/colortheme/ColorThemeModel;",
            "Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;",
            "Lxq0/a;",
            ")",
            "Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;"
        }
    .end annotation

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextAction"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headerOverlayItems"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "footerOverlayItems"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "borderStyle"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    invoke-direct/range {v1 .. v15}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;-><init>(Ljava/lang/String;IILcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;FLjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Lcom/whoop/design/models/colortheme/ColorThemeModel;Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;Lxq0/a;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;

    iget-object v1, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->progressSegmentCount:I

    iget v3, p1, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->progressSegmentCount:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->activeSegmentIndex:I

    iget v3, p1, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->activeSegmentIndex:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->nextAction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->nextAction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->backAction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->backAction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->backgroundImageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->backgroundImageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->photoRevealFraction:F

    iget v3, p1, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->photoRevealFraction:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->items:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->items:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->headerOverlayItems:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->headerOverlayItems:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->footerOverlayItems:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->footerOverlayItems:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->achievementBackgroundStyle:Lcom/whoop/design/models/AchievementsBackgroundStyle;

    iget-object v3, p1, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->achievementBackgroundStyle:Lcom/whoop/design/models/AchievementsBackgroundStyle;

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    iget-object v3, p1, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->securityPolicy:Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;

    iget-object v3, p1, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->securityPolicy:Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->borderStyle:Lxq0/a;

    iget-object p1, p1, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->borderStyle:Lxq0/a;

    if-eq v1, p1, :cond_f

    return v2

    :cond_f
    return v0
.end method

.method public final getAchievementBackgroundStyle()Lcom/whoop/design/models/AchievementsBackgroundStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->achievementBackgroundStyle:Lcom/whoop/design/models/AchievementsBackgroundStyle;

    return-object v0
.end method

.method public final getActiveSegmentIndex()I
    .locals 1

    iget v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->activeSegmentIndex:I

    return v0
.end method

.method public final getBackAction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->backAction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getBackgroundImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->backgroundImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getBorderStyle()Lxq0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->borderStyle:Lxq0/a;

    return-object v0
.end method

.method public final getColors()Lcom/whoop/design/models/colortheme/ColorThemeModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    return-object v0
.end method

.method public final getFooterOverlayItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->footerOverlayItems:Ljava/util/List;

    return-object v0
.end method

.method public final getHeaderOverlayItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->headerOverlayItems:Ljava/util/List;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getNextAction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->nextAction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getPhotoRevealFraction()F
    .locals 1

    iget v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->photoRevealFraction:F

    return v0
.end method

.method public final getProgressSegmentCount()I
    .locals 1

    iget v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->progressSegmentCount:I

    return v0
.end method

.method public final getSecurityPolicy()Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->securityPolicy:Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->progressSegmentCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->activeSegmentIndex:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->nextAction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-virtual {v2}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->backAction:Lcom/whoop/navigation/models/GenericInteraction;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->backgroundImageUrl:Ljava/lang/String;

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->photoRevealFraction:F

    invoke-static {v0, v2, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->items:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->headerOverlayItems:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->footerOverlayItems:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->achievementBackgroundStyle:Lcom/whoop/design/models/AchievementsBackgroundStyle;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/design/models/colortheme/ColorThemeModel;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->securityPolicy:Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->borderStyle:Lxq0/a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->id:Ljava/lang/String;

    iget v2, v0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->progressSegmentCount:I

    iget v3, v0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->activeSegmentIndex:I

    iget-object v4, v0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->nextAction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v5, v0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->backAction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v6, v0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->backgroundImageUrl:Ljava/lang/String;

    iget v7, v0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->photoRevealFraction:F

    iget-object v8, v0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->items:Ljava/util/List;

    iget-object v9, v0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->headerOverlayItems:Ljava/util/List;

    iget-object v10, v0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->footerOverlayItems:Ljava/util/List;

    iget-object v11, v0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->achievementBackgroundStyle:Lcom/whoop/design/models/AchievementsBackgroundStyle;

    iget-object v12, v0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    iget-object v13, v0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->securityPolicy:Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;

    iget-object v14, v0, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->borderStyle:Lxq0/a;

    const-string v15, ", progressSegmentCount="

    const-string v0, ", activeSegmentIndex="

    move-object/from16 v16, v14

    const-string v14, "CommunitySnapshotContainerModel(id="

    invoke-static {v2, v14, v1, v15, v0}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", nextAction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", backAction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", backgroundImageUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", photoRevealFraction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", items="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", headerOverlayItems="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", footerOverlayItems="

    const-string v2, ", achievementBackgroundStyle="

    invoke-static {v0, v9, v1, v10, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", colors="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", securityPolicy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", borderStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
