.class public final Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse$$serializer;,
        Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\u0008\u0087\u0008\u0018\u0000 C2\u00020\u0001:\u0002DCBU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010B{\u0008\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0016\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!Jp\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\t2\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u0017J\u0010\u0010%\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010)\u001a\u00020(2\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\'\u00103\u001a\u0002002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001\u00a2\u0006\u0004\u00081\u00102R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00104\u001a\u0004\u00085\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00104\u001a\u0004\u00086\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00104\u001a\u0004\u00087\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00104\u001a\u0004\u00088\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00104\u001a\u0004\u00089\u0010\u0017R\u001a\u0010\u0008\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00104\u001a\u0004\u0008:\u0010\u0017R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010;\u0012\u0004\u0008=\u0010>\u001a\u0004\u0008<\u0010\u001eR \u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010;\u0012\u0004\u0008@\u0010>\u001a\u0004\u0008?\u0010\u001eR \u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010A\u001a\u0004\u0008B\u0010!\u00a8\u0006E"
    }
    d2 = {
        "Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;",
        "",
        "",
        "defaultStatLeftName",
        "defaultStatRightName",
        "description",
        "errorMessage",
        "pinnedKeyStatsHeader",
        "unpinnedKeyStatsHeader",
        "Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;",
        "pinnedKeyStats",
        "unpinnedKeyStats",
        "",
        "Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;",
        "toggleKeyStats",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "()Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;",
        "component8",
        "component9",
        "()Ljava/util/List;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;Ljava/util/List;)Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;",
        "toString",
        "hashCode",
        "()I",
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
        "write$Self$home_customization_release",
        "(Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getDefaultStatLeftName",
        "getDefaultStatRightName",
        "getDescription",
        "getErrorMessage",
        "getPinnedKeyStatsHeader",
        "getUnpinnedKeyStatsHeader",
        "Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;",
        "getPinnedKeyStats",
        "getPinnedKeyStats$annotations",
        "()V",
        "getUnpinnedKeyStats",
        "getUnpinnedKeyStats$annotations",
        "Ljava/util/List;",
        "getToggleKeyStats",
        "Companion",
        "$serializer",
        "home-customization_release"
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

.field public static final Companion:Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse$Companion;


# instance fields
.field private final defaultStatLeftName:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "default_stat_left_name"
    .end annotation
.end field

.field private final defaultStatRightName:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "default_stat_right_name"
    .end annotation
.end field

.field private final description:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "description"
    .end annotation
.end field

.field private final errorMessage:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "error_message"
    .end annotation
.end field

.field private final pinnedKeyStats:Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "pinned_key_stats_section"
    .end annotation
.end field

.field private final pinnedKeyStatsHeader:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "pinned_key_stats_header"
    .end annotation
.end field

.field private final toggleKeyStats:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "toggle_key_stats"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;",
            ">;"
        }
    .end annotation
.end field

.field private final unpinnedKeyStats:Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "unpinned_key_stats_section"
    .end annotation
.end field

.field private final unpinnedKeyStatsHeader:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "unpinned_key_stats_header"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->Companion:Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lf1/z1;

    const/16 v4, 0x18

    invoke-direct {v3, v4}, Lf1/z1;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v3, 0x9

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v1, v3, v4

    const/4 v4, 0x3

    aput-object v1, v3, v4

    const/4 v4, 0x4

    aput-object v1, v3, v4

    const/4 v4, 0x5

    aput-object v1, v3, v4

    const/4 v4, 0x6

    aput-object v1, v3, v4

    const/4 v4, 0x7

    aput-object v1, v3, v4

    aput-object v2, v3, v0

    sput-object v3, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p11, p1, 0x1ff

    const/16 v0, 0x1ff

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse$$serializer;->INSTANCE:Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse$$serializer;

    invoke-virtual {p11}, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->defaultStatLeftName:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->defaultStatRightName:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->description:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->errorMessage:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->pinnedKeyStatsHeader:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->unpinnedKeyStatsHeader:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->pinnedKeyStats:Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;

    iput-object p9, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->unpinnedKeyStats:Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;

    iput-object p10, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->toggleKeyStats:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;",
            "Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;",
            "Ljava/util/List<",
            "Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "defaultStatLeftName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultStatRightName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorMessage"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pinnedKeyStatsHeader"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unpinnedKeyStatsHeader"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pinnedKeyStats"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unpinnedKeyStats"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "toggleKeyStats"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->defaultStatLeftName:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->defaultStatRightName:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->description:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->errorMessage:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->pinnedKeyStatsHeader:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->unpinnedKeyStatsHeader:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->pinnedKeyStats:Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;

    .line 10
    iput-object p8, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->unpinnedKeyStats:Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;

    .line 11
    iput-object p9, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->toggleKeyStats:Ljava/util/List;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel$$serializer;->INSTANCE:Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->defaultStatLeftName:Ljava/lang/String;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->defaultStatRightName:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->description:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->errorMessage:Ljava/lang/String;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->pinnedKeyStatsHeader:Ljava/lang/String;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->unpinnedKeyStatsHeader:Ljava/lang/String;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->pinnedKeyStats:Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->unpinnedKeyStats:Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->toggleKeyStats:Ljava/util/List;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;Ljava/util/List;)Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getPinnedKeyStats$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "pinned_key_stats_section"
    .end annotation

    return-void
.end method

.method public static synthetic getUnpinnedKeyStats$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "unpinned_key_stats_section"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$home_customization_release(Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->defaultStatLeftName:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->defaultStatRightName:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->description:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->errorMessage:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->pinnedKeyStatsHeader:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->unpinnedKeyStatsHeader:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection$$serializer;->INSTANCE:Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection$$serializer;

    iget-object v2, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->pinnedKeyStats:Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;

    const/4 v3, 0x6

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x7

    iget-object v3, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->unpinnedKeyStats:Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x8

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->toggleKeyStats:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->defaultStatLeftName:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->defaultStatRightName:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->errorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->pinnedKeyStatsHeader:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->unpinnedKeyStatsHeader:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->pinnedKeyStats:Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;

    return-object v0
.end method

.method public final component8()Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->unpinnedKeyStats:Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;

    return-object v0
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->toggleKeyStats:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;Ljava/util/List;)Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;",
            "Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;",
            "Ljava/util/List<",
            "Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;",
            ">;)",
            "Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;"
        }
    .end annotation

    const-string v0, "defaultStatLeftName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultStatRightName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorMessage"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pinnedKeyStatsHeader"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unpinnedKeyStatsHeader"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pinnedKeyStats"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unpinnedKeyStats"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "toggleKeyStats"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v10}, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;

    iget-object v1, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->defaultStatLeftName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->defaultStatLeftName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->defaultStatRightName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->defaultStatRightName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->errorMessage:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->errorMessage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->pinnedKeyStatsHeader:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->pinnedKeyStatsHeader:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->unpinnedKeyStatsHeader:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->unpinnedKeyStatsHeader:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->pinnedKeyStats:Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;

    iget-object v3, p1, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->pinnedKeyStats:Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->unpinnedKeyStats:Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;

    iget-object v3, p1, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->unpinnedKeyStats:Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->toggleKeyStats:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->toggleKeyStats:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getDefaultStatLeftName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->defaultStatLeftName:Ljava/lang/String;

    return-object v0
.end method

.method public final getDefaultStatRightName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->defaultStatRightName:Ljava/lang/String;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getErrorMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->errorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final getPinnedKeyStats()Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->pinnedKeyStats:Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;

    return-object v0
.end method

.method public final getPinnedKeyStatsHeader()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->pinnedKeyStatsHeader:Ljava/lang/String;

    return-object v0
.end method

.method public final getToggleKeyStats()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->toggleKeyStats:Ljava/util/List;

    return-object v0
.end method

.method public final getUnpinnedKeyStats()Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->unpinnedKeyStats:Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;

    return-object v0
.end method

.method public final getUnpinnedKeyStatsHeader()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->unpinnedKeyStatsHeader:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->defaultStatLeftName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->defaultStatRightName:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->description:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->errorMessage:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->pinnedKeyStatsHeader:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->unpinnedKeyStatsHeader:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->pinnedKeyStats:Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;

    invoke-virtual {v2}, Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->unpinnedKeyStats:Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;

    invoke-virtual {v0}, Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->toggleKeyStats:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->defaultStatLeftName:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->defaultStatRightName:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->description:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->errorMessage:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->pinnedKeyStatsHeader:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->unpinnedKeyStatsHeader:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->pinnedKeyStats:Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;

    iget-object v7, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->unpinnedKeyStats:Lcom/whoop/homecustomization/domain/legacy/models/KeyStatSection;

    iget-object v8, p0, Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;->toggleKeyStats:Ljava/util/List;

    const-string v9, ", defaultStatRightName="

    const-string v10, ", description="

    const-string v11, "HomeCustomizationResponse(defaultStatLeftName="

    invoke-static {v11, v0, v9, v1, v10}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", errorMessage="

    const-string v9, ", pinnedKeyStatsHeader="

    invoke-static {v0, v2, v1, v3, v9}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", unpinnedKeyStatsHeader="

    const-string v2, ", pinnedKeyStats="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", unpinnedKeyStats="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", toggleKeyStats="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v8, v1}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
