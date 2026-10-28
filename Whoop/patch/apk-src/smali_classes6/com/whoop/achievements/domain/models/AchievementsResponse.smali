.class public final Lcom/whoop/achievements/domain/models/AchievementsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/achievements/domain/models/AchievementsResponse$$serializer;,
        Lcom/whoop/achievements/domain/models/AchievementsResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u0000 @2\u00020\u0001:\u0002A@Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0016\u0008\u0002\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010Bs\u0008\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u000f\u0010\u0015J\'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u001e\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010 J\u0012\u0010\'\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0016\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*Jr\u0010+\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0016\u0008\u0002\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u00c6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010 J\u0010\u0010.\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u001a\u00102\u001a\u0002012\u0008\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00082\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00104\u001a\u0004\u00085\u0010 R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00104\u001a\u0004\u00086\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00107\u001a\u0004\u00088\u0010#R%\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00109\u001a\u0004\u0008:\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00104\u001a\u0004\u0008;\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010<\u001a\u0004\u0008=\u0010(R\u001d\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010>\u001a\u0004\u0008?\u0010*\u00a8\u0006B"
    }
    d2 = {
        "Lcom/whoop/achievements/domain/models/AchievementsResponse;",
        "",
        "",
        "navigationTitle",
        "navigationIcon",
        "Lcom/whoop/navigation/e;",
        "navigationDestination",
        "",
        "analyticProperties",
        "backgroundStyle",
        "Lcom/whoop/design/models/colortheme/ColorThemeModel;",
        "colors",
        "",
        "Lcom/whoop/achievements/domain/models/AchievementsSectionModel;",
        "sections",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/Map;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/Map;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$achievements_release",
        "(Lcom/whoop/achievements/domain/models/AchievementsResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Lcom/whoop/navigation/e;",
        "component4",
        "()Ljava/util/Map;",
        "component5",
        "component6",
        "()Lcom/whoop/design/models/colortheme/ColorThemeModel;",
        "component7",
        "()Ljava/util/List;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/Map;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/util/List;)Lcom/whoop/achievements/domain/models/AchievementsResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getNavigationTitle",
        "getNavigationIcon",
        "Lcom/whoop/navigation/e;",
        "getNavigationDestination",
        "Ljava/util/Map;",
        "getAnalyticProperties",
        "getBackgroundStyle",
        "Lcom/whoop/design/models/colortheme/ColorThemeModel;",
        "getColors",
        "Ljava/util/List;",
        "getSections",
        "Companion",
        "$serializer",
        "achievements_release"
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

.field public static final Companion:Lcom/whoop/achievements/domain/models/AchievementsResponse$Companion;


# instance fields
.field private final analyticProperties:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final backgroundStyle:Ljava/lang/String;

.field private final colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

.field private final navigationDestination:Lcom/whoop/navigation/e;

.field private final navigationIcon:Ljava/lang/String;

.field private final navigationTitle:Ljava/lang/String;

.field private final sections:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/achievements/domain/models/AchievementsSectionModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/whoop/achievements/domain/models/AchievementsResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/achievements/domain/models/AchievementsResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->Companion:Lcom/whoop/achievements/domain/models/AchievementsResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ls51/p;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Ls51/p;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v4, Ls51/p;

    const/4 v5, 0x3

    invoke-direct {v4, v5}, Ls51/p;-><init>(I)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v6, Ls51/p;

    const/4 v7, 0x4

    invoke-direct {v6, v7}, Ls51/p;-><init>(I)V

    invoke-static {v0, v6}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v6, 0x7

    new-array v6, v6, [Ll83/h;

    const/4 v8, 0x0

    aput-object v1, v6, v8

    const/4 v8, 0x1

    aput-object v1, v6, v8

    aput-object v2, v6, v3

    aput-object v4, v6, v5

    aput-object v1, v6, v7

    const/4 v2, 0x5

    aput-object v1, v6, v2

    const/4 v1, 0x6

    aput-object v0, v6, v1

    sput-object v6, Lcom/whoop/achievements/domain/models/AchievementsResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/Map;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/achievements/domain/models/AchievementsResponse$$serializer;->INSTANCE:Lcom/whoop/achievements/domain/models/AchievementsResponse$$serializer;

    invoke-virtual {p9}, Lcom/whoop/achievements/domain/models/AchievementsResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationTitle:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    const/4 p9, 0x0

    if-nez p2, :cond_1

    iput-object p9, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationIcon:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationIcon:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object p9, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationDestination:Lcom/whoop/navigation/e;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationDestination:Lcom/whoop/navigation/e;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object p9, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->analyticProperties:Ljava/util/Map;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->analyticProperties:Ljava/util/Map;

    :goto_2
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object p9, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->backgroundStyle:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p6, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->backgroundStyle:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object p9, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    goto :goto_4

    :cond_5
    iput-object p7, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    :goto_4
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_6

    .line 2
    sget-object p1, Lm83/y;->w:Lm83/y;

    .line 3
    iput-object p1, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->sections:Ljava/util/List;

    return-void

    :cond_6
    iput-object p8, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->sections:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/Map;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/navigation/e;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/colortheme/ColorThemeModel;",
            "Ljava/util/List<",
            "Lcom/whoop/achievements/domain/models/AchievementsSectionModel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "navigationTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sections"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationTitle:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationIcon:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationDestination:Lcom/whoop/navigation/e;

    .line 8
    iput-object p4, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->analyticProperties:Ljava/util/Map;

    .line 9
    iput-object p5, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->backgroundStyle:Ljava/lang/String;

    .line 10
    iput-object p6, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    .line 11
    iput-object p7, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->sections:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/Map;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x2

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_2

    move-object p4, v0

    :cond_2
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_3

    move-object p5, v0

    :cond_3
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_4

    move-object p6, v0

    :cond_4
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_5

    .line 12
    sget-object p7, Lm83/y;->w:Lm83/y;

    :cond_5
    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 13
    invoke-direct/range {p1 .. p8}, Lcom/whoop/achievements/domain/models/AchievementsResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/Map;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/util/List;)V

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 4

    new-instance v0, Lwc3/a;

    const-class v1, Lcom/whoop/navigation/e;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lwc3/c;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1, v1}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/achievements/domain/models/AchievementsSectionModel$$serializer;->INSTANCE:Lcom/whoop/achievements/domain/models/AchievementsSectionModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/achievements/domain/models/AchievementsResponse;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/achievements/domain/models/AchievementsResponse;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/achievements/domain/models/AchievementsResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/achievements/domain/models/AchievementsResponse;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/Map;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/achievements/domain/models/AchievementsResponse;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationTitle:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationIcon:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationDestination:Lcom/whoop/navigation/e;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->analyticProperties:Ljava/util/Map;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->backgroundStyle:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->sections:Ljava/util/List;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/achievements/domain/models/AchievementsResponse;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/Map;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/util/List;)Lcom/whoop/achievements/domain/models/AchievementsResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$achievements_release(Lcom/whoop/achievements/domain/models/AchievementsResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationIcon:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationDestination:Lcom/whoop/navigation/e;

    if-eqz v2, :cond_3

    :goto_1
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationDestination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->analyticProperties:Ljava/util/Map;

    if-eqz v2, :cond_5

    :goto_2
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->analyticProperties:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->backgroundStyle:Ljava/lang/String;

    if-eqz v2, :cond_7

    :goto_3
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->backgroundStyle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    if-eqz v2, :cond_9

    :goto_4
    sget-object v2, Lcom/whoop/design/models/colortheme/ColorThemeModel$$serializer;->INSTANCE:Lcom/whoop/design/models/colortheme/ColorThemeModel$$serializer;

    iget-object v3, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->sections:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    :goto_5
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->sections:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationDestination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component4()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->analyticProperties:Ljava/util/Map;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->backgroundStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/colortheme/ColorThemeModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/achievements/domain/models/AchievementsSectionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->sections:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/Map;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/util/List;)Lcom/whoop/achievements/domain/models/AchievementsResponse;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/navigation/e;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/colortheme/ColorThemeModel;",
            "Ljava/util/List<",
            "Lcom/whoop/achievements/domain/models/AchievementsSectionModel;",
            ">;)",
            "Lcom/whoop/achievements/domain/models/AchievementsResponse;"
        }
    .end annotation

    const-string v0, "navigationTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sections"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/achievements/domain/models/AchievementsResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/whoop/achievements/domain/models/AchievementsResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/Map;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/achievements/domain/models/AchievementsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/achievements/domain/models/AchievementsResponse;

    iget-object v1, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationDestination:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationDestination:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->analyticProperties:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/achievements/domain/models/AchievementsResponse;->analyticProperties:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->backgroundStyle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/achievements/domain/models/AchievementsResponse;->backgroundStyle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    iget-object v3, p1, Lcom/whoop/achievements/domain/models/AchievementsResponse;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->sections:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/achievements/domain/models/AchievementsResponse;->sections:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAnalyticProperties()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->analyticProperties:Ljava/util/Map;

    return-object v0
.end method

.method public final getBackgroundStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->backgroundStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final getColors()Lcom/whoop/design/models/colortheme/ColorThemeModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    return-object v0
.end method

.method public final getNavigationDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationDestination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getNavigationIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getNavigationTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSections()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/achievements/domain/models/AchievementsSectionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->sections:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationTitle:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationIcon:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationDestination:Lcom/whoop/navigation/e;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->analyticProperties:Ljava/util/Map;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->backgroundStyle:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lcom/whoop/design/models/colortheme/ColorThemeModel;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->sections:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationTitle:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationIcon:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->navigationDestination:Lcom/whoop/navigation/e;

    iget-object v3, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->analyticProperties:Ljava/util/Map;

    iget-object v4, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->backgroundStyle:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    iget-object v6, p0, Lcom/whoop/achievements/domain/models/AchievementsResponse;->sections:Ljava/util/List;

    const-string v7, ", navigationIcon="

    const-string v8, ", navigationDestination="

    const-string v9, "AchievementsResponse(navigationTitle="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", analyticProperties="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", backgroundStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", colors="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sections="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v6, v1}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
