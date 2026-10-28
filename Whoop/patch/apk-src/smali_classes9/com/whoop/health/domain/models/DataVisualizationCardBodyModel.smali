.class public final Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel$$serializer;,
        Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0081\u0008\u0018\u0000 @2\u00020\u0001:\u0002A@B[\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fBa\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)Jd\u0010*\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00c6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u001a\u00102\u001a\u0002012\u0008\u00100\u001a\u0004\u0018\u00010/H\u00d6\u0003\u00a2\u0006\u0004\u00082\u00103R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00104\u001a\u0004\u00085\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00104\u001a\u0004\u00086\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00107\u001a\u0004\u00088\u0010\"R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00109\u001a\u0004\u0008:\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010;\u001a\u0004\u0008<\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010;\u001a\u0004\u0008=\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010>\u001a\u0004\u0008?\u0010)\u00a8\u0006B"
    }
    d2 = {
        "Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "heading",
        "title",
        "Lcom/whoop/design/models/items/ImpactModel;",
        "trend",
        "Lcom/whoop/design/models/items/graph/GraphModel;",
        "graph",
        "Lcom/whoop/design/models/items/CtaTileModel;",
        "prefixCta",
        "suffixCta",
        "Lcom/whoop/health/domain/models/CardSupplementalInfo;",
        "cardSupplementalInfo",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/health/domain/models/CardSupplementalInfo;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/health/domain/models/CardSupplementalInfo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$health_release",
        "(Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Lcom/whoop/design/models/items/ImpactModel;",
        "component4",
        "()Lcom/whoop/design/models/items/graph/GraphModel;",
        "component5",
        "()Lcom/whoop/design/models/items/CtaTileModel;",
        "component6",
        "component7",
        "()Lcom/whoop/health/domain/models/CardSupplementalInfo;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/health/domain/models/CardSupplementalInfo;)Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getHeading",
        "getTitle",
        "Lcom/whoop/design/models/items/ImpactModel;",
        "getTrend",
        "Lcom/whoop/design/models/items/graph/GraphModel;",
        "getGraph",
        "Lcom/whoop/design/models/items/CtaTileModel;",
        "getPrefixCta",
        "getSuffixCta",
        "Lcom/whoop/health/domain/models/CardSupplementalInfo;",
        "getCardSupplementalInfo",
        "Companion",
        "$serializer",
        "health_release"
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel$Companion;


# instance fields
.field private final cardSupplementalInfo:Lcom/whoop/health/domain/models/CardSupplementalInfo;

.field private final graph:Lcom/whoop/design/models/items/graph/GraphModel;

.field private final heading:Ljava/lang/String;

.field private final prefixCta:Lcom/whoop/design/models/items/CtaTileModel;

.field private final suffixCta:Lcom/whoop/design/models/items/CtaTileModel;

.field private final title:Ljava/lang/String;

.field private final trend:Lcom/whoop/design/models/items/ImpactModel;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->Companion:Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/health/domain/models/CardSupplementalInfo;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/health/domain/models/CardSupplementalInfo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p9, p1, 0x1

    const-string v0, ""

    if-nez p9, :cond_0

    iput-object v0, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->heading:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->heading:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->title:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->title:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->prefixCta:Lcom/whoop/design/models/items/CtaTileModel;

    goto :goto_4

    :cond_4
    iput-object p6, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->prefixCta:Lcom/whoop/design/models/items/CtaTileModel;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->suffixCta:Lcom/whoop/design/models/items/CtaTileModel;

    goto :goto_5

    :cond_5
    iput-object p7, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->suffixCta:Lcom/whoop/design/models/items/CtaTileModel;

    :goto_5
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_6

    iput-object p3, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->cardSupplementalInfo:Lcom/whoop/health/domain/models/CardSupplementalInfo;

    return-void

    :cond_6
    iput-object p8, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->cardSupplementalInfo:Lcom/whoop/health/domain/models/CardSupplementalInfo;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/health/domain/models/CardSupplementalInfo;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->heading:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->title:Ljava/lang/String;

    .line 6
    iput-object p3, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    .line 7
    iput-object p4, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    .line 8
    iput-object p5, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->prefixCta:Lcom/whoop/design/models/items/CtaTileModel;

    .line 9
    iput-object p6, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->suffixCta:Lcom/whoop/design/models/items/CtaTileModel;

    .line 10
    iput-object p7, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->cardSupplementalInfo:Lcom/whoop/health/domain/models/CardSupplementalInfo;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/health/domain/models/CardSupplementalInfo;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    .line 11
    const-string v0, ""

    if-eqz p9, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p9, p8, 0x4

    const/4 v0, 0x0

    if-eqz p9, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    move-object p8, v0

    :goto_0
    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_6
    move-object p8, p7

    goto :goto_0

    :goto_1
    invoke-direct/range {p1 .. p8}, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/health/domain/models/CardSupplementalInfo;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/health/domain/models/CardSupplementalInfo;ILjava/lang/Object;)Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->heading:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->prefixCta:Lcom/whoop/design/models/items/CtaTileModel;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->suffixCta:Lcom/whoop/design/models/items/CtaTileModel;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->cardSupplementalInfo:Lcom/whoop/health/domain/models/CardSupplementalInfo;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/health/domain/models/CardSupplementalInfo;)Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$health_release(Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    const-string v2, ""

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->heading:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :goto_0
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->heading:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->title:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :goto_1
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lcom/whoop/design/models/items/ImpactModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ImpactModel$$serializer;

    iget-object v2, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lcom/whoop/design/models/items/graph/GraphModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/GraphModel$$serializer;

    iget-object v2, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->prefixCta:Lcom/whoop/design/models/items/CtaTileModel;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lcom/whoop/design/models/items/CtaTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CtaTileModel$$serializer;

    iget-object v2, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->prefixCta:Lcom/whoop/design/models/items/CtaTileModel;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-object v1, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->suffixCta:Lcom/whoop/design/models/items/CtaTileModel;

    if-eqz v1, :cond_b

    :goto_5
    sget-object v1, Lcom/whoop/design/models/items/CtaTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CtaTileModel$$serializer;

    iget-object v2, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->suffixCta:Lcom/whoop/design/models/items/CtaTileModel;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    iget-object v1, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->cardSupplementalInfo:Lcom/whoop/health/domain/models/CardSupplementalInfo;

    if-eqz v1, :cond_d

    :goto_6
    sget-object v1, Lcom/whoop/health/domain/models/CardSupplementalInfo$$serializer;->INSTANCE:Lcom/whoop/health/domain/models/CardSupplementalInfo$$serializer;

    iget-object p0, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->cardSupplementalInfo:Lcom/whoop/health/domain/models/CardSupplementalInfo;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->heading:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/items/ImpactModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/graph/GraphModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/items/CtaTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->prefixCta:Lcom/whoop/design/models/items/CtaTileModel;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/items/CtaTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->suffixCta:Lcom/whoop/design/models/items/CtaTileModel;

    return-object v0
.end method

.method public final component7()Lcom/whoop/health/domain/models/CardSupplementalInfo;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->cardSupplementalInfo:Lcom/whoop/health/domain/models/CardSupplementalInfo;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/health/domain/models/CardSupplementalInfo;)Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;
    .locals 8

    new-instance v0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/health/domain/models/CardSupplementalInfo;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;

    iget-object v1, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->heading:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->heading:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    iget-object v3, p1, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    iget-object v3, p1, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->prefixCta:Lcom/whoop/design/models/items/CtaTileModel;

    iget-object v3, p1, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->prefixCta:Lcom/whoop/design/models/items/CtaTileModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->suffixCta:Lcom/whoop/design/models/items/CtaTileModel;

    iget-object v3, p1, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->suffixCta:Lcom/whoop/design/models/items/CtaTileModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->cardSupplementalInfo:Lcom/whoop/health/domain/models/CardSupplementalInfo;

    iget-object p1, p1, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->cardSupplementalInfo:Lcom/whoop/health/domain/models/CardSupplementalInfo;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getCardSupplementalInfo()Lcom/whoop/health/domain/models/CardSupplementalInfo;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->cardSupplementalInfo:Lcom/whoop/health/domain/models/CardSupplementalInfo;

    return-object v0
.end method

.method public final getGraph()Lcom/whoop/design/models/items/graph/GraphModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    return-object v0
.end method

.method public final getHeading()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->heading:Ljava/lang/String;

    return-object v0
.end method

.method public final getPrefixCta()Lcom/whoop/design/models/items/CtaTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->prefixCta:Lcom/whoop/design/models/items/CtaTileModel;

    return-object v0
.end method

.method public final getSuffixCta()Lcom/whoop/design/models/items/CtaTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->suffixCta:Lcom/whoop/design/models/items/CtaTileModel;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrend()Lcom/whoop/design/models/items/ImpactModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->heading:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->title:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/design/models/items/ImpactModel;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/GraphModel;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->prefixCta:Lcom/whoop/design/models/items/CtaTileModel;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lcom/whoop/design/models/items/CtaTileModel;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->suffixCta:Lcom/whoop/design/models/items/CtaTileModel;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Lcom/whoop/design/models/items/CtaTileModel;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->cardSupplementalInfo:Lcom/whoop/health/domain/models/CardSupplementalInfo;

    if-nez v2, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Lcom/whoop/health/domain/models/CardSupplementalInfo;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->heading:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    iget-object v3, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    iget-object v4, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->prefixCta:Lcom/whoop/design/models/items/CtaTileModel;

    iget-object v5, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->suffixCta:Lcom/whoop/design/models/items/CtaTileModel;

    iget-object v6, p0, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->cardSupplementalInfo:Lcom/whoop/health/domain/models/CardSupplementalInfo;

    const-string v7, ", title="

    const-string v8, ", trend="

    const-string v9, "DataVisualizationCardBodyModel(heading="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", graph="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", prefixCta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", suffixCta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cardSupplementalInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
