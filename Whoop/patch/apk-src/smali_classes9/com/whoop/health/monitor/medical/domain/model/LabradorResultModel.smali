.class public final Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel$$serializer;,
        Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\u0008\u0081\u0008\u0018\u0000 E2\u00020\u0001:\u0002FEBg\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\u0010\u0008\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b\u0012\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012Bw\u0008\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0016\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001eJp\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0010\u0008\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b2\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u000b2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u001eJ\u0010\u0010(\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010-\u001a\u00020,2\u0008\u0010+\u001a\u0004\u0018\u00010*H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001\u00a2\u0006\u0004\u00085\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00108\u001a\u0004\u00089\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00108\u001a\u0004\u0008:\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010;\u001a\u0004\u0008<\u0010\u001cR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010=\u001a\u0004\u0008>\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010?\u001a\u0004\u0008@\u0010 R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010A\u001a\u0004\u0008B\u0010\"R\u001d\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010A\u001a\u0004\u0008C\u0010\"R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010=\u001a\u0004\u0008D\u0010\u001e\u00a8\u0006G"
    }
    d2 = {
        "Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "subtitle",
        "Lhy0/b2;",
        "trendType",
        "",
        "icon",
        "Lcom/whoop/navigation/e;",
        "destination",
        "",
        "",
        "samples",
        "Lcom/whoop/health/monitor/medical/domain/model/ShepherdReadingModel;",
        "readings",
        "trailingTimestamp",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/b2;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/b2;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/design/util/TextResource;",
        "component2",
        "component3",
        "()Lhy0/b2;",
        "component4",
        "()Ljava/lang/String;",
        "component5",
        "()Lcom/whoop/navigation/e;",
        "component6",
        "()Ljava/util/List;",
        "component7",
        "component8",
        "copy",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/b2;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;",
        "toString",
        "hashCode",
        "()I",
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
        "write$Self$kennel_release",
        "(Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/design/util/TextResource;",
        "getTitle",
        "getSubtitle",
        "Lhy0/b2;",
        "getTrendType",
        "Ljava/lang/String;",
        "getIcon",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "Ljava/util/List;",
        "getSamples",
        "getReadings",
        "getTrailingTimestamp",
        "Companion",
        "$serializer",
        "kennel_release"
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

.field public static final Companion:Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel$Companion;


# instance fields
.field private final destination:Lcom/whoop/navigation/e;

.field private final icon:Ljava/lang/String;

.field private final readings:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/health/monitor/medical/domain/model/ShepherdReadingModel;",
            ">;"
        }
    .end annotation
.end field

.field private final samples:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private final subtitle:Lcom/whoop/design/util/TextResource;

.field private final title:Lcom/whoop/design/util/TextResource;

.field private final trailingTimestamp:Ljava/lang/String;

.field private final trendType:Lhy0/b2;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->Companion:Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lwi0/d;

    const/4 v4, 0x5

    invoke-direct {v3, v4}, Lwi0/d;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lwi0/d;

    const/4 v6, 0x6

    invoke-direct {v5, v6}, Lwi0/d;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Lwi0/d;

    const/4 v8, 0x7

    invoke-direct {v7, v8}, Lwi0/d;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v7

    new-instance v9, Lwi0/d;

    invoke-direct {v9, v0}, Lwi0/d;-><init>(I)V

    invoke-static {v2, v9}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v0, v0, [Ll83/h;

    const/4 v9, 0x0

    aput-object v1, v0, v9

    const/4 v9, 0x1

    aput-object v1, v0, v9

    const/4 v9, 0x2

    aput-object v3, v0, v9

    const/4 v3, 0x3

    aput-object v1, v0, v3

    const/4 v3, 0x4

    aput-object v5, v0, v3

    aput-object v7, v0, v4

    aput-object v2, v0, v6

    aput-object v1, v0, v8

    sput-object v0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 11

    .line 1
    const/16 v9, 0xff

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v10}, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/b2;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/b2;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 6

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    if-nez v0, :cond_0

    .line 3
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p2

    .line 4
    :cond_0
    iput-object p2, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->title:Lcom/whoop/design/util/TextResource;

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    .line 5
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p2

    .line 6
    iput-object p2, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->subtitle:Lcom/whoop/design/util/TextResource;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->subtitle:Lcom/whoop/design/util/TextResource;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    .line 7
    sget-object p2, Lhy0/b2;->NEUTRAL:Lhy0/b2;

    .line 8
    iput-object p2, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->trendType:Lhy0/b2;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->trendType:Lhy0/b2;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    .line 9
    const-string p2, ""

    .line 10
    iput-object p2, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->icon:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->icon:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    .line 11
    new-instance v0, Lcom/whoop/navigation/e;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    iput-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->destination:Lcom/whoop/navigation/e;

    goto :goto_3

    :cond_4
    iput-object p6, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->destination:Lcom/whoop/navigation/e;

    :goto_3
    and-int/lit8 p2, p1, 0x20

    const/4 p3, 0x0

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->samples:Ljava/util/List;

    goto :goto_4

    :cond_5
    iput-object p7, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->samples:Ljava/util/List;

    :goto_4
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    .line 13
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 14
    iput-object p2, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->readings:Ljava/util/List;

    goto :goto_5

    :cond_6
    iput-object p8, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->readings:Ljava/util/List;

    :goto_5
    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_7

    iput-object p3, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->trailingTimestamp:Ljava/lang/String;

    return-void

    :cond_7
    iput-object p9, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->trailingTimestamp:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/b2;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lhy0/b2;",
            "Ljava/lang/String;",
            "Lcom/whoop/navigation/e;",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/health/monitor/medical/domain/model/ShepherdReadingModel;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trendType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destination"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "readings"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->title:Lcom/whoop/design/util/TextResource;

    .line 17
    iput-object p2, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->subtitle:Lcom/whoop/design/util/TextResource;

    .line 18
    iput-object p3, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->trendType:Lhy0/b2;

    .line 19
    iput-object p4, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->icon:Ljava/lang/String;

    .line 20
    iput-object p5, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->destination:Lcom/whoop/navigation/e;

    .line 21
    iput-object p6, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->samples:Ljava/util/List;

    .line 22
    iput-object p7, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->readings:Ljava/util/List;

    .line 23
    iput-object p8, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->trailingTimestamp:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/b2;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 24
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    .line 25
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p2

    :cond_1
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_2

    .line 26
    sget-object p3, Lhy0/b2;->NEUTRAL:Lhy0/b2;

    :cond_2
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_3

    .line 27
    const-string v1, ""

    goto :goto_0

    :cond_3
    move-object v1, p4

    :goto_0
    and-int/lit8 v2, v0, 0x10

    if-eqz v2, :cond_4

    .line 28
    new-instance v3, Lcom/whoop/navigation/e;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_4
    move-object v3, p5

    :goto_1
    and-int/lit8 v2, v0, 0x20

    const/4 v4, 0x0

    if-eqz v2, :cond_5

    move-object v2, v4

    goto :goto_2

    :cond_5
    move-object v2, p6

    :goto_2
    and-int/lit8 v5, v0, 0x40

    if-eqz v5, :cond_6

    .line 29
    sget-object v5, Lm83/y;->w:Lm83/y;

    goto :goto_3

    :cond_6
    move-object/from16 v5, p7

    :goto_3
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_7

    move-object/from16 p10, v4

    :goto_4
    move-object p4, p2

    move-object p5, p3

    move-object p6, v1

    move-object/from16 p8, v2

    move-object/from16 p7, v3

    move-object/from16 p9, v5

    move-object p2, p0

    move-object p3, p1

    goto :goto_5

    :cond_7
    move-object/from16 p10, p8

    goto :goto_4

    .line 30
    :goto_5
    invoke-direct/range {p2 .. p10}, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/b2;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.atom.TrendTypeState"

    invoke-static {}, Lhy0/b2;->values()[Lhy0/b2;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
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

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/health/monitor/medical/domain/model/ShepherdReadingModel$$serializer;->INSTANCE:Lcom/whoop/health/monitor/medical/domain/model/ShepherdReadingModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/b2;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->title:Lcom/whoop/design/util/TextResource;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->subtitle:Lcom/whoop/design/util/TextResource;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->trendType:Lhy0/b2;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->icon:Ljava/lang/String;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->destination:Lcom/whoop/navigation/e;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->samples:Ljava/util/List;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->readings:Ljava/util/List;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->trailingTimestamp:Ljava/lang/String;

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

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/b2;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$kennel_release(Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;Lzc3/c;Lyc3/g;)V
    .locals 9

    sget-object v0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    sget-object v2, Lmd1/a;->a:Lmd1/a;

    iget-object v3, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->subtitle:Lcom/whoop/design/util/TextResource;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    sget-object v2, Lmd1/a;->a:Lmd1/a;

    iget-object v3, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->subtitle:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->trendType:Lhy0/b2;

    sget-object v3, Lhy0/b2;->NEUTRAL:Lhy0/b2;

    if-eq v2, v3, :cond_5

    :goto_2
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->trendType:Lhy0/b2;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->icon:Ljava/lang/String;

    const-string v3, ""

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :goto_3
    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->icon:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->destination:Lcom/whoop/navigation/e;

    new-instance v3, Lcom/whoop/navigation/e;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    :goto_4
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->samples:Ljava/util/List;

    if-eqz v2, :cond_b

    :goto_5
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->samples:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->readings:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    :goto_6
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->readings:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->trailingTimestamp:Ljava/lang/String;

    if-eqz v1, :cond_f

    :goto_7
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->trailingTimestamp:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->subtitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component3()Lhy0/b2;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->trendType:Lhy0/b2;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->samples:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/health/monitor/medical/domain/model/ShepherdReadingModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->readings:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->trailingTimestamp:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/b2;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lhy0/b2;",
            "Ljava/lang/String;",
            "Lcom/whoop/navigation/e;",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/health/monitor/medical/domain/model/ShepherdReadingModel;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trendType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destination"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "readings"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/b2;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;

    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->subtitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->subtitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->trendType:Lhy0/b2;

    iget-object v3, p1, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->trendType:Lhy0/b2;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->destination:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->samples:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->samples:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->readings:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->readings:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->trailingTimestamp:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->trailingTimestamp:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getReadings()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/health/monitor/medical/domain/model/ShepherdReadingModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->readings:Ljava/util/List;

    return-object v0
.end method

.method public final getSamples()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->samples:Ljava/util/List;

    return-object v0
.end method

.method public final getSubtitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->subtitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getTrailingTimestamp()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->trailingTimestamp:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrendType()Lhy0/b2;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->trendType:Lhy0/b2;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->subtitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->trendType:Lhy0/b2;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->icon:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v2, v0, v1}, Lvl/b;->a(Lcom/whoop/navigation/e;II)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->samples:Ljava/util/List;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->readings:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->trailingTimestamp:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->subtitle:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->trendType:Lhy0/b2;

    iget-object v3, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->icon:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->destination:Lcom/whoop/navigation/e;

    iget-object v5, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->samples:Ljava/util/List;

    iget-object v6, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->readings:Ljava/util/List;

    iget-object v7, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->trailingTimestamp:Ljava/lang/String;

    const-string v8, ", subtitle="

    const-string v9, ", trendType="

    const-string v10, "LabradorResultModel(title="

    invoke-static {v10, v0, v8, v1, v9}, Lte0/d;->q(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", icon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", destination="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", samples="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", readings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", trailingTimestamp="

    const-string v2, ")"

    invoke-static {v1, v7, v2, v0, v6}, Ly00/t7;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
