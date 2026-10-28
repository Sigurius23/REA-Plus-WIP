.class public final Lcom/whoop/stress/domain/model/StressTrend;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/stress/domain/model/StressTrend$$serializer;,
        Lcom/whoop/stress/domain/model/StressTrend$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001d\u0008\u0087\u0008\u0018\u0000 N2\u00020\u0001:\u0002OPBg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013B\u0083\u0001\u0008\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0014\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0016\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u001c\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\rH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001aJ\u0080\u0001\u0010&\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0010\u0008\u0002\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0014\u0008\u0002\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u001aJ\u0010\u0010)\u001a\u00020\u0014H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010-\u001a\u00020,2\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001\u00a2\u0006\u0004\u00085\u00106R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u00108\u0012\u0004\u0008:\u0010;\u001a\u0004\u00089\u0010\u001aR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u00108\u0012\u0004\u0008=\u0010;\u001a\u0004\u0008<\u0010\u001aR&\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010>\u0012\u0004\u0008@\u0010;\u001a\u0004\u0008?\u0010\u001dR(\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010>\u0012\u0004\u0008B\u0010;\u001a\u0004\u0008A\u0010\u001dR,\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010C\u0012\u0004\u0008E\u0010;\u001a\u0004\u0008D\u0010 R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010F\u0012\u0004\u0008H\u0010;\u001a\u0004\u0008G\u0010\"R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010I\u0012\u0004\u0008K\u0010;\u001a\u0004\u0008J\u0010$R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0011\u00108\u0012\u0004\u0008M\u0010;\u001a\u0004\u0008L\u0010\u001a\u00a8\u0006Q"
    }
    d2 = {
        "Lcom/whoop/stress/domain/model/StressTrend;",
        "",
        "",
        "title",
        "suffix",
        "",
        "Lcom/whoop/stress/domain/model/StressTrendSegment;",
        "todaySegments",
        "previousSegments",
        "",
        "Lcom/whoop/stress/domain/model/StressTrendStatKey;",
        "Lcom/whoop/stress/domain/model/StressTrendStat;",
        "trendStats",
        "Lcom/whoop/stress/domain/model/StressCta;",
        "cta",
        "Lcom/whoop/stress/domain/model/StressTrendHeader;",
        "header",
        "vow",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/whoop/stress/domain/model/StressCta;Lcom/whoop/stress/domain/model/StressTrendHeader;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/whoop/stress/domain/model/StressCta;Lcom/whoop/stress/domain/model/StressTrendHeader;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Ljava/util/List;",
        "component4",
        "component5",
        "()Ljava/util/Map;",
        "component6",
        "()Lcom/whoop/stress/domain/model/StressCta;",
        "component7",
        "()Lcom/whoop/stress/domain/model/StressTrendHeader;",
        "component8",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/whoop/stress/domain/model/StressCta;Lcom/whoop/stress/domain/model/StressTrendHeader;Ljava/lang/String;)Lcom/whoop/stress/domain/model/StressTrend;",
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
        "write$Self$stress_release",
        "(Lcom/whoop/stress/domain/model/StressTrend;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getTitle",
        "getTitle$annotations",
        "()V",
        "getSuffix",
        "getSuffix$annotations",
        "Ljava/util/List;",
        "getTodaySegments",
        "getTodaySegments$annotations",
        "getPreviousSegments",
        "getPreviousSegments$annotations",
        "Ljava/util/Map;",
        "getTrendStats",
        "getTrendStats$annotations",
        "Lcom/whoop/stress/domain/model/StressCta;",
        "getCta",
        "getCta$annotations",
        "Lcom/whoop/stress/domain/model/StressTrendHeader;",
        "getHeader",
        "getHeader$annotations",
        "getVow",
        "getVow$annotations",
        "Companion",
        "$serializer",
        "a",
        "stress_release"
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

.field public static final Companion:Lcom/whoop/stress/domain/model/StressTrend$a;


# instance fields
.field private final cta:Lcom/whoop/stress/domain/model/StressCta;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "cta"
    .end annotation
.end field

.field private final header:Lcom/whoop/stress/domain/model/StressTrendHeader;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "header"
    .end annotation
.end field

.field private final previousSegments:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "previous_bar_segments"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/model/StressTrendSegment;",
            ">;"
        }
    .end annotation
.end field

.field private final suffix:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "title_suffix_display"
    .end annotation
.end field

.field private final title:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "title_display"
    .end annotation
.end field

.field private final todaySegments:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "today_bar_segments"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/model/StressTrendSegment;",
            ">;"
        }
    .end annotation
.end field

.field private final trendStats:Ljava/util/Map;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "trend_stats"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/whoop/stress/domain/model/StressTrendStatKey;",
            "Lcom/whoop/stress/domain/model/StressTrendStat;",
            ">;"
        }
    .end annotation
.end field

.field private final vow:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "vow"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/stress/domain/model/StressTrend$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/stress/domain/model/StressTrend$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/stress/domain/model/StressTrend;->Companion:Lcom/whoop/stress/domain/model/StressTrend$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/stress/domain/model/StressTrend;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lih1/b;

    const/16 v4, 0xf

    invoke-direct {v3, v4}, Lih1/b;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lih1/b;

    const/16 v5, 0x10

    invoke-direct {v4, v5}, Lih1/b;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v5, Lih1/b;

    const/16 v6, 0x11

    invoke-direct {v5, v6}, Lih1/b;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v0, v0, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v0, v5

    const/4 v5, 0x1

    aput-object v1, v0, v5

    const/4 v5, 0x2

    aput-object v3, v0, v5

    const/4 v3, 0x3

    aput-object v4, v0, v3

    const/4 v3, 0x4

    aput-object v2, v0, v3

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lcom/whoop/stress/domain/model/StressTrend;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/whoop/stress/domain/model/StressCta;Lcom/whoop/stress/domain/model/StressTrendHeader;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p10, p1, 0xff

    const/16 v0, 0xff

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/stress/domain/model/StressTrend$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressTrend$$serializer;

    invoke-virtual {p10}, Lcom/whoop/stress/domain/model/StressTrend$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/stress/domain/model/StressTrend;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/stress/domain/model/StressTrend;->suffix:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/stress/domain/model/StressTrend;->todaySegments:Ljava/util/List;

    iput-object p5, p0, Lcom/whoop/stress/domain/model/StressTrend;->previousSegments:Ljava/util/List;

    iput-object p6, p0, Lcom/whoop/stress/domain/model/StressTrend;->trendStats:Ljava/util/Map;

    iput-object p7, p0, Lcom/whoop/stress/domain/model/StressTrend;->cta:Lcom/whoop/stress/domain/model/StressCta;

    iput-object p8, p0, Lcom/whoop/stress/domain/model/StressTrend;->header:Lcom/whoop/stress/domain/model/StressTrendHeader;

    iput-object p9, p0, Lcom/whoop/stress/domain/model/StressTrend;->vow:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/whoop/stress/domain/model/StressCta;Lcom/whoop/stress/domain/model/StressTrendHeader;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/model/StressTrendSegment;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/model/StressTrendSegment;",
            ">;",
            "Ljava/util/Map<",
            "Lcom/whoop/stress/domain/model/StressTrendStatKey;",
            "Lcom/whoop/stress/domain/model/StressTrendStat;",
            ">;",
            "Lcom/whoop/stress/domain/model/StressCta;",
            "Lcom/whoop/stress/domain/model/StressTrendHeader;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "todaySegments"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trendStats"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cta"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/stress/domain/model/StressTrend;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/stress/domain/model/StressTrend;->suffix:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/stress/domain/model/StressTrend;->todaySegments:Ljava/util/List;

    .line 6
    iput-object p4, p0, Lcom/whoop/stress/domain/model/StressTrend;->previousSegments:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/stress/domain/model/StressTrend;->trendStats:Ljava/util/Map;

    .line 8
    iput-object p6, p0, Lcom/whoop/stress/domain/model/StressTrend;->cta:Lcom/whoop/stress/domain/model/StressCta;

    .line 9
    iput-object p7, p0, Lcom/whoop/stress/domain/model/StressTrend;->header:Lcom/whoop/stress/domain/model/StressTrendHeader;

    .line 10
    iput-object p8, p0, Lcom/whoop/stress/domain/model/StressTrend;->vow:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/stress/domain/model/StressTrendSegment$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressTrendSegment$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/stress/domain/model/StressTrendSegment$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressTrendSegment$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 3

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lcom/whoop/stress/domain/model/StressTrendStatKey;->Companion:Lcom/whoop/stress/domain/model/StressTrendStatKey$a;

    invoke-virtual {v1}, Lcom/whoop/stress/domain/model/StressTrendStatKey$a;->serializer()Lwc3/c;

    move-result-object v1

    sget-object v2, Lcom/whoop/stress/domain/model/StressTrendStat$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressTrendStat$$serializer;

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/stress/domain/model/StressTrend;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/stress/domain/model/StressTrend;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/stress/domain/model/StressTrend;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/stress/domain/model/StressTrend;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/stress/domain/model/StressTrend;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/whoop/stress/domain/model/StressCta;Lcom/whoop/stress/domain/model/StressTrendHeader;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/stress/domain/model/StressTrend;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/stress/domain/model/StressTrend;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/stress/domain/model/StressTrend;->suffix:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/stress/domain/model/StressTrend;->todaySegments:Ljava/util/List;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/stress/domain/model/StressTrend;->previousSegments:Ljava/util/List;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/stress/domain/model/StressTrend;->trendStats:Ljava/util/Map;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/stress/domain/model/StressTrend;->cta:Lcom/whoop/stress/domain/model/StressCta;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/stress/domain/model/StressTrend;->header:Lcom/whoop/stress/domain/model/StressTrendHeader;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/stress/domain/model/StressTrend;->vow:Ljava/lang/String;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/stress/domain/model/StressTrend;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/whoop/stress/domain/model/StressCta;Lcom/whoop/stress/domain/model/StressTrendHeader;Ljava/lang/String;)Lcom/whoop/stress/domain/model/StressTrend;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getCta$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "cta"
    .end annotation

    return-void
.end method

.method public static synthetic getHeader$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "header"
    .end annotation

    return-void
.end method

.method public static synthetic getPreviousSegments$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "previous_bar_segments"
    .end annotation

    return-void
.end method

.method public static synthetic getSuffix$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "title_suffix_display"
    .end annotation

    return-void
.end method

.method public static synthetic getTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "title_display"
    .end annotation

    return-void
.end method

.method public static synthetic getTodaySegments$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "today_bar_segments"
    .end annotation

    return-void
.end method

.method public static synthetic getTrendStats$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "trend_stats"
    .end annotation

    return-void
.end method

.method public static synthetic getVow$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "vow"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$stress_release(Lcom/whoop/stress/domain/model/StressTrend;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/stress/domain/model/StressTrend;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressTrend;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressTrend;->suffix:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/stress/domain/model/StressTrend;->todaySegments:Ljava/util/List;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/stress/domain/model/StressTrend;->previousSegments:Ljava/util/List;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/stress/domain/model/StressTrend;->trendStats:Ljava/util/Map;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/stress/domain/model/StressCta$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressCta$$serializer;

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressTrend;->cta:Lcom/whoop/stress/domain/model/StressCta;

    const/4 v3, 0x5

    invoke-interface {p1, p2, v3, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/stress/domain/model/StressTrendHeader$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressTrendHeader$$serializer;

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressTrend;->header:Lcom/whoop/stress/domain/model/StressTrendHeader;

    const/4 v3, 0x6

    invoke-interface {p1, p2, v3, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x7

    iget-object p0, p0, Lcom/whoop/stress/domain/model/StressTrend;->vow:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrend;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrend;->suffix:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/model/StressTrendSegment;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrend;->todaySegments:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/model/StressTrendSegment;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrend;->previousSegments:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/whoop/stress/domain/model/StressTrendStatKey;",
            "Lcom/whoop/stress/domain/model/StressTrendStat;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrend;->trendStats:Ljava/util/Map;

    return-object v0
.end method

.method public final component6()Lcom/whoop/stress/domain/model/StressCta;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrend;->cta:Lcom/whoop/stress/domain/model/StressCta;

    return-object v0
.end method

.method public final component7()Lcom/whoop/stress/domain/model/StressTrendHeader;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrend;->header:Lcom/whoop/stress/domain/model/StressTrendHeader;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrend;->vow:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/whoop/stress/domain/model/StressCta;Lcom/whoop/stress/domain/model/StressTrendHeader;Ljava/lang/String;)Lcom/whoop/stress/domain/model/StressTrend;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/model/StressTrendSegment;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/model/StressTrendSegment;",
            ">;",
            "Ljava/util/Map<",
            "Lcom/whoop/stress/domain/model/StressTrendStatKey;",
            "Lcom/whoop/stress/domain/model/StressTrendStat;",
            ">;",
            "Lcom/whoop/stress/domain/model/StressCta;",
            "Lcom/whoop/stress/domain/model/StressTrendHeader;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/stress/domain/model/StressTrend;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "todaySegments"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trendStats"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cta"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/stress/domain/model/StressTrend;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/stress/domain/model/StressTrend;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/whoop/stress/domain/model/StressCta;Lcom/whoop/stress/domain/model/StressTrendHeader;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/stress/domain/model/StressTrend;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/stress/domain/model/StressTrend;

    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressTrend;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressTrend;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressTrend;->suffix:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressTrend;->suffix:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressTrend;->todaySegments:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressTrend;->todaySegments:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressTrend;->previousSegments:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressTrend;->previousSegments:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressTrend;->trendStats:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressTrend;->trendStats:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressTrend;->cta:Lcom/whoop/stress/domain/model/StressCta;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressTrend;->cta:Lcom/whoop/stress/domain/model/StressCta;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressTrend;->header:Lcom/whoop/stress/domain/model/StressTrendHeader;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressTrend;->header:Lcom/whoop/stress/domain/model/StressTrendHeader;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressTrend;->vow:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/stress/domain/model/StressTrend;->vow:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getCta()Lcom/whoop/stress/domain/model/StressCta;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrend;->cta:Lcom/whoop/stress/domain/model/StressCta;

    return-object v0
.end method

.method public final getHeader()Lcom/whoop/stress/domain/model/StressTrendHeader;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrend;->header:Lcom/whoop/stress/domain/model/StressTrendHeader;

    return-object v0
.end method

.method public final getPreviousSegments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/model/StressTrendSegment;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrend;->previousSegments:Ljava/util/List;

    return-object v0
.end method

.method public final getSuffix()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrend;->suffix:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrend;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTodaySegments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/model/StressTrendSegment;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrend;->todaySegments:Ljava/util/List;

    return-object v0
.end method

.method public final getTrendStats()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/whoop/stress/domain/model/StressTrendStatKey;",
            "Lcom/whoop/stress/domain/model/StressTrendStat;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrend;->trendStats:Ljava/util/Map;

    return-object v0
.end method

.method public final getVow()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrend;->vow:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrend;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressTrend;->suffix:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressTrend;->todaySegments:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressTrend;->previousSegments:Ljava/util/List;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressTrend;->trendStats:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressTrend;->cta:Lcom/whoop/stress/domain/model/StressCta;

    invoke-virtual {v2}, Lcom/whoop/stress/domain/model/StressCta;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrend;->header:Lcom/whoop/stress/domain/model/StressTrendHeader;

    if-nez v0, :cond_2

    move v0, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lcom/whoop/stress/domain/model/StressTrendHeader;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrend;->vow:Ljava/lang/String;

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v2, v3

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrend;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressTrend;->suffix:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressTrend;->todaySegments:Ljava/util/List;

    iget-object v3, p0, Lcom/whoop/stress/domain/model/StressTrend;->previousSegments:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/stress/domain/model/StressTrend;->trendStats:Ljava/util/Map;

    iget-object v5, p0, Lcom/whoop/stress/domain/model/StressTrend;->cta:Lcom/whoop/stress/domain/model/StressCta;

    iget-object v6, p0, Lcom/whoop/stress/domain/model/StressTrend;->header:Lcom/whoop/stress/domain/model/StressTrendHeader;

    iget-object v7, p0, Lcom/whoop/stress/domain/model/StressTrend;->vow:Ljava/lang/String;

    const-string v8, ", suffix="

    const-string v9, ", todaySegments="

    const-string v10, "StressTrend(title="

    invoke-static {v10, v0, v8, v1, v9}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", previousSegments="

    const-string v8, ", trendStats="

    invoke-static {v0, v2, v1, v3, v8}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", header="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", vow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
