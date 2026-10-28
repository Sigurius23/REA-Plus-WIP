.class public final Lcom/whoop/design/models/items/graph/GraphingCardModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/graph/GraphingCardModel$$serializer;,
        Lcom/whoop/design/models/items/graph/GraphingCardModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008#\u0008\u0087\u0008\u0018\u0000 p2\u00020\u0001:\u0002qpB\u00d9\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0010\u0008\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0010\u0008\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010\u0012\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0004\u0008\u001e\u0010\u001fB\u00d1\u0001\u0008\u0010\u0012\u0006\u0010!\u001a\u00020 \u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0008\u0010#\u001a\u0004\u0018\u00010\"\u00a2\u0006\u0004\u0008\u001e\u0010$J\u0010\u0010%\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010(J\u0012\u0010+\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010(J\u0012\u0010.\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010(J\u0012\u0010/\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010(J\u0012\u00100\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010(J\u0012\u00101\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u00081\u00102J\u0018\u00103\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u00083\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0004\u00085\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0004\u00087\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003\u00a2\u0006\u0004\u00089\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003\u00a2\u0006\u0004\u0008;\u0010<J\u0018\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008=\u00104J\u0012\u0010>\u001a\u0004\u0018\u00010\u001cH\u00c6\u0003\u00a2\u0006\u0004\u0008>\u0010?J\u00e4\u0001\u0010@\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\u0008\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0010\u0008\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00102\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u00c6\u0001\u00a2\u0006\u0004\u0008@\u0010AJ\u0010\u0010B\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008B\u0010(J\u0010\u0010C\u001a\u00020 H\u00d6\u0001\u00a2\u0006\u0004\u0008C\u0010DJ\u001a\u0010H\u001a\u00020G2\u0008\u0010F\u001a\u0004\u0018\u00010EH\u00d6\u0003\u00a2\u0006\u0004\u0008H\u0010IJ\'\u0010R\u001a\u00020O2\u0006\u0010J\u001a\u00020\u00002\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020MH\u0001\u00a2\u0006\u0004\u0008P\u0010QR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010S\u001a\u0004\u0008T\u0010&R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010U\u001a\u0004\u0008V\u0010(R\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010U\u001a\u0004\u0008W\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010U\u001a\u0004\u0008X\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010Y\u001a\u0004\u0008Z\u0010,R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010U\u001a\u0004\u0008[\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010U\u001a\u0004\u0008\\\u0010(R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010U\u001a\u0004\u0008]\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010U\u001a\u0004\u0008^\u0010(R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010_\u001a\u0004\u0008`\u00102R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010a\u001a\u0004\u0008b\u00104R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010c\u0012\u0004\u0008e\u0010f\u001a\u0004\u0008d\u00106R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010g\u001a\u0004\u0008h\u00108R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010i\u001a\u0004\u0008j\u0010:R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010k\u001a\u0004\u0008l\u0010<R\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010a\u001a\u0004\u0008m\u00104R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010n\u001a\u0004\u0008o\u0010?\u00a8\u0006r"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/GraphingCardModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/items/graph/GraphModel;",
        "graph",
        "",
        "id",
        "title",
        "icon",
        "Lgz0/m0;",
        "endIcon",
        "trendsCta",
        "trendCtaText",
        "progressDisplay",
        "sevenDayVow",
        "Lcom/whoop/design/models/items/CheckmarkStyle;",
        "checkmarkStyle",
        "",
        "Lcom/whoop/design/models/items/graph/GraphLegendModel;",
        "graphLegends",
        "Lcom/whoop/navigation/e;",
        "destination",
        "Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;",
        "planProgressStatus",
        "Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;",
        "circularProgressIndicator",
        "Lcom/whoop/design/models/items/UnlockTrendsCardModel;",
        "unlockTrendsCard",
        "subItems",
        "Lcom/whoop/design/models/items/graph/GraphingCardTheme;",
        "theme",
        "<init>",
        "(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CheckmarkStyle;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Lcom/whoop/design/models/items/UnlockTrendsCardModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphingCardTheme;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CheckmarkStyle;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Lcom/whoop/design/models/items/UnlockTrendsCardModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphingCardTheme;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/design/models/items/graph/GraphModel;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "()Lgz0/m0;",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "()Lcom/whoop/design/models/items/CheckmarkStyle;",
        "component11",
        "()Ljava/util/List;",
        "component12",
        "()Lcom/whoop/navigation/e;",
        "component13",
        "()Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;",
        "component14",
        "()Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;",
        "component15",
        "()Lcom/whoop/design/models/items/UnlockTrendsCardModel;",
        "component16",
        "component17",
        "()Lcom/whoop/design/models/items/graph/GraphingCardTheme;",
        "copy",
        "(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CheckmarkStyle;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Lcom/whoop/design/models/items/UnlockTrendsCardModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphingCardTheme;)Lcom/whoop/design/models/items/graph/GraphingCardModel;",
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
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/graph/GraphingCardModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/design/models/items/graph/GraphModel;",
        "getGraph",
        "Ljava/lang/String;",
        "getId",
        "getTitle",
        "getIcon",
        "Lgz0/m0;",
        "getEndIcon",
        "getTrendsCta",
        "getTrendCtaText",
        "getProgressDisplay",
        "getSevenDayVow",
        "Lcom/whoop/design/models/items/CheckmarkStyle;",
        "getCheckmarkStyle",
        "Ljava/util/List;",
        "getGraphLegends",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "getDestination$annotations",
        "()V",
        "Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;",
        "getPlanProgressStatus",
        "Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;",
        "getCircularProgressIndicator",
        "Lcom/whoop/design/models/items/UnlockTrendsCardModel;",
        "getUnlockTrendsCard",
        "getSubItems",
        "Lcom/whoop/design/models/items/graph/GraphingCardTheme;",
        "getTheme",
        "Companion",
        "$serializer",
        "design-models_release"
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

.field public static final Companion:Lcom/whoop/design/models/items/graph/GraphingCardModel$Companion;


# instance fields
.field private final checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

.field private final circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

.field private final destination:Lcom/whoop/navigation/e;

.field private final endIcon:Lgz0/m0;

.field private final graph:Lcom/whoop/design/models/items/graph/GraphModel;

.field private final graphLegends:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/GraphLegendModel;",
            ">;"
        }
    .end annotation
.end field

.field private final icon:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final planProgressStatus:Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;

.field private final progressDisplay:Ljava/lang/String;

.field private final sevenDayVow:Ljava/lang/String;

.field private final subItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final theme:Lcom/whoop/design/models/items/graph/GraphingCardTheme;

.field private final title:Ljava/lang/String;

.field private final trendCtaText:Ljava/lang/String;

.field private final trendsCta:Ljava/lang/String;

.field private final unlockTrendsCard:Lcom/whoop/design/models/items/UnlockTrendsCardModel;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/whoop/design/models/items/graph/GraphingCardModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/graph/GraphingCardModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->Companion:Lcom/whoop/design/models/items/graph/GraphingCardModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lep0/a;

    const/16 v4, 0x17

    invoke-direct {v3, v4}, Lep0/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lep0/a;

    const/16 v5, 0x18

    invoke-direct {v4, v5}, Lep0/a;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v5, Lep0/a;

    const/16 v6, 0x19

    invoke-direct {v5, v6}, Lep0/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v6, Lep0/a;

    const/16 v7, 0x1a

    invoke-direct {v6, v7}, Lep0/a;-><init>(I)V

    invoke-static {v2, v6}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v6

    new-instance v7, Lep0/a;

    const/16 v8, 0x1b

    invoke-direct {v7, v8}, Lep0/a;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v7, 0x11

    new-array v7, v7, [Ll83/h;

    const/4 v8, 0x0

    aput-object v1, v7, v8

    const/4 v8, 0x1

    aput-object v1, v7, v8

    const/4 v8, 0x2

    aput-object v1, v7, v8

    const/4 v8, 0x3

    aput-object v1, v7, v8

    const/4 v8, 0x4

    aput-object v3, v7, v8

    const/4 v3, 0x5

    aput-object v1, v7, v3

    const/4 v3, 0x6

    aput-object v1, v7, v3

    const/4 v3, 0x7

    aput-object v1, v7, v3

    aput-object v1, v7, v0

    const/16 v0, 0x9

    aput-object v4, v7, v0

    const/16 v0, 0xa

    aput-object v5, v7, v0

    const/16 v0, 0xb

    aput-object v6, v7, v0

    const/16 v0, 0xc

    aput-object v1, v7, v0

    const/16 v0, 0xd

    aput-object v1, v7, v0

    const/16 v0, 0xe

    aput-object v1, v7, v0

    const/16 v0, 0xf

    aput-object v2, v7, v0

    const/16 v0, 0x10

    aput-object v1, v7, v0

    sput-object v7, Lcom/whoop/design/models/items/graph/GraphingCardModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CheckmarkStyle;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Lcom/whoop/design/models/items/UnlockTrendsCardModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphingCardTheme;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x1

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/design/models/items/graph/GraphingCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/GraphingCardModel$$serializer;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/graph/GraphingCardModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    and-int/lit8 p2, p1, 0x2

    const/4 v0, 0x0

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->id:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->id:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    .line 2
    const-string p2, ""

    .line 3
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->title:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->title:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->icon:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->icon:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->endIcon:Lgz0/m0;

    goto :goto_3

    :cond_4
    iput-object p6, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->endIcon:Lgz0/m0;

    :goto_3
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->trendsCta:Ljava/lang/String;

    goto :goto_4

    :cond_5
    iput-object p7, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->trendsCta:Ljava/lang/String;

    :goto_4
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->trendCtaText:Ljava/lang/String;

    goto :goto_5

    :cond_6
    iput-object p8, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->trendCtaText:Ljava/lang/String;

    :goto_5
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->progressDisplay:Ljava/lang/String;

    goto :goto_6

    :cond_7
    iput-object p9, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->progressDisplay:Ljava/lang/String;

    :goto_6
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_8

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->sevenDayVow:Ljava/lang/String;

    goto :goto_7

    :cond_8
    iput-object p10, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->sevenDayVow:Ljava/lang/String;

    :goto_7
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_9

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

    goto :goto_8

    :cond_9
    iput-object p11, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

    :goto_8
    and-int/lit16 p2, p1, 0x400

    if-nez p2, :cond_a

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->graphLegends:Ljava/util/List;

    goto :goto_9

    :cond_a
    iput-object p12, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->graphLegends:Ljava/util/List;

    :goto_9
    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_b

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->destination:Lcom/whoop/navigation/e;

    goto :goto_a

    :cond_b
    iput-object p13, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->destination:Lcom/whoop/navigation/e;

    :goto_a
    and-int/lit16 p2, p1, 0x1000

    if-nez p2, :cond_c

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->planProgressStatus:Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;

    goto :goto_b

    :cond_c
    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->planProgressStatus:Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;

    :goto_b
    and-int/lit16 p2, p1, 0x2000

    if-nez p2, :cond_d

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    goto :goto_c

    :cond_d
    move-object/from16 p2, p15

    iput-object p2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    :goto_c
    and-int/lit16 p2, p1, 0x4000

    if-nez p2, :cond_e

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->unlockTrendsCard:Lcom/whoop/design/models/items/UnlockTrendsCardModel;

    goto :goto_d

    :cond_e
    move-object/from16 p2, p16

    iput-object p2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->unlockTrendsCard:Lcom/whoop/design/models/items/UnlockTrendsCardModel;

    :goto_d
    const p2, 0x8000

    and-int/2addr p2, p1

    if-nez p2, :cond_f

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->subItems:Ljava/util/List;

    goto :goto_e

    :cond_f
    move-object/from16 p2, p17

    iput-object p2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->subItems:Ljava/util/List;

    :goto_e
    const/high16 p2, 0x10000

    and-int/2addr p1, p2

    if-nez p1, :cond_10

    iput-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->theme:Lcom/whoop/design/models/items/graph/GraphingCardTheme;

    return-void

    :cond_10
    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->theme:Lcom/whoop/design/models/items/graph/GraphingCardTheme;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CheckmarkStyle;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Lcom/whoop/design/models/items/UnlockTrendsCardModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphingCardTheme;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/graph/GraphModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lgz0/m0;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/CheckmarkStyle;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/GraphLegendModel;",
            ">;",
            "Lcom/whoop/navigation/e;",
            "Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;",
            "Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;",
            "Lcom/whoop/design/models/items/UnlockTrendsCardModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/design/models/items/graph/GraphingCardTheme;",
            ")V"
        }
    .end annotation

    const-string v0, "graph"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    .line 6
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->id:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->title:Ljava/lang/String;

    .line 8
    iput-object p4, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->icon:Ljava/lang/String;

    .line 9
    iput-object p5, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->endIcon:Lgz0/m0;

    .line 10
    iput-object p6, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->trendsCta:Ljava/lang/String;

    .line 11
    iput-object p7, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->trendCtaText:Ljava/lang/String;

    .line 12
    iput-object p8, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->progressDisplay:Ljava/lang/String;

    .line 13
    iput-object p9, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->sevenDayVow:Ljava/lang/String;

    .line 14
    iput-object p10, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

    .line 15
    iput-object p11, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->graphLegends:Ljava/util/List;

    .line 16
    iput-object p12, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->destination:Lcom/whoop/navigation/e;

    .line 17
    iput-object p13, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->planProgressStatus:Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;

    .line 18
    iput-object p14, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    move-object/from16 p1, p15

    .line 19
    iput-object p1, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->unlockTrendsCard:Lcom/whoop/design/models/items/UnlockTrendsCardModel;

    move-object/from16 p1, p16

    .line 20
    iput-object p1, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->subItems:Ljava/util/List;

    move-object/from16 p1, p17

    .line 21
    iput-object p1, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->theme:Lcom/whoop/design/models/items/graph/GraphingCardTheme;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CheckmarkStyle;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Lcom/whoop/design/models/items/UnlockTrendsCardModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphingCardTheme;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 18

    move/from16 v0, p18

    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    move-object/from16 v1, p2

    :goto_0
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_1

    .line 22
    const-string v3, ""

    goto :goto_1

    :cond_1
    move-object/from16 v3, p3

    :goto_1
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_2

    move-object v4, v2

    goto :goto_2

    :cond_2
    move-object/from16 v4, p4

    :goto_2
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_3

    move-object v5, v2

    goto :goto_3

    :cond_3
    move-object/from16 v5, p5

    :goto_3
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_4

    move-object v6, v2

    goto :goto_4

    :cond_4
    move-object/from16 v6, p6

    :goto_4
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_5

    move-object v7, v2

    goto :goto_5

    :cond_5
    move-object/from16 v7, p7

    :goto_5
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_6

    move-object v8, v2

    goto :goto_6

    :cond_6
    move-object/from16 v8, p8

    :goto_6
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_7

    move-object v9, v2

    goto :goto_7

    :cond_7
    move-object/from16 v9, p9

    :goto_7
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_8

    move-object v10, v2

    goto :goto_8

    :cond_8
    move-object/from16 v10, p10

    :goto_8
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_9

    move-object v11, v2

    goto :goto_9

    :cond_9
    move-object/from16 v11, p11

    :goto_9
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_a

    move-object v12, v2

    goto :goto_a

    :cond_a
    move-object/from16 v12, p12

    :goto_a
    and-int/lit16 v13, v0, 0x1000

    if-eqz v13, :cond_b

    move-object v13, v2

    goto :goto_b

    :cond_b
    move-object/from16 v13, p13

    :goto_b
    and-int/lit16 v14, v0, 0x2000

    if-eqz v14, :cond_c

    move-object v14, v2

    goto :goto_c

    :cond_c
    move-object/from16 v14, p14

    :goto_c
    and-int/lit16 v15, v0, 0x4000

    if-eqz v15, :cond_d

    move-object v15, v2

    goto :goto_d

    :cond_d
    move-object/from16 v15, p15

    :goto_d
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_e

    move-object/from16 v16, v2

    goto :goto_e

    :cond_e
    move-object/from16 v16, p16

    :goto_e
    const/high16 v17, 0x10000

    and-int v0, v0, v17

    if-eqz v0, :cond_f

    move-object/from16 p19, v2

    :goto_f
    move-object/from16 p2, p0

    move-object/from16 p3, p1

    move-object/from16 p4, v1

    move-object/from16 p5, v3

    move-object/from16 p6, v4

    move-object/from16 p7, v5

    move-object/from16 p8, v6

    move-object/from16 p9, v7

    move-object/from16 p10, v8

    move-object/from16 p11, v9

    move-object/from16 p12, v10

    move-object/from16 p13, v11

    move-object/from16 p14, v12

    move-object/from16 p15, v13

    move-object/from16 p16, v14

    move-object/from16 p17, v15

    move-object/from16 p18, v16

    goto :goto_10

    :cond_f
    move-object/from16 p19, p17

    goto :goto_f

    .line 23
    :goto_10
    invoke-direct/range {p2 .. p19}, Lcom/whoop/design/models/items/graph/GraphingCardModel;-><init>(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CheckmarkStyle;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Lcom/whoop/design/models/items/UnlockTrendsCardModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphingCardTheme;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.atom.icon.WhoopIconMapper"

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.CheckmarkStyle"

    invoke-static {}, Lcom/whoop/design/models/items/CheckmarkStyle;->values()[Lcom/whoop/design/models/items/CheckmarkStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/graph/GraphLegendModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/GraphLegendModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$2()Lwc3/c;
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

.method private static final _childSerializers$_anonymous_$3()Lwc3/c;
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

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/GraphingCardModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/GraphingCardModel;->_childSerializers$_anonymous_$3()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/GraphingCardModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/graph/GraphingCardModel;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CheckmarkStyle;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Lcom/whoop/design/models/items/UnlockTrendsCardModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphingCardTheme;ILjava/lang/Object;)Lcom/whoop/design/models/items/graph/GraphingCardModel;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p18

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->id:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->title:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->icon:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->endIcon:Lgz0/m0;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->trendsCta:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->trendCtaText:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->progressDisplay:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->sevenDayVow:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->graphLegends:Ljava/util/List;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->destination:Lcom/whoop/navigation/e;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->planProgressStatus:Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->unlockTrendsCard:Lcom/whoop/design/models/items/UnlockTrendsCardModel;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->subItems:Ljava/util/List;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p18, v16

    if-eqz v16, :cond_10

    move-object/from16 p2, v1

    iget-object v1, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->theme:Lcom/whoop/design/models/items/graph/GraphingCardTheme;

    move-object/from16 p17, p2

    move-object/from16 p18, v1

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_10

    :cond_10
    move-object/from16 p18, p17

    move-object/from16 p17, v1

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    :goto_10
    invoke-virtual/range {p1 .. p18}, Lcom/whoop/design/models/items/graph/GraphingCardModel;->copy(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CheckmarkStyle;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Lcom/whoop/design/models/items/UnlockTrendsCardModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphingCardTheme;)Lcom/whoop/design/models/items/graph/GraphingCardModel;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/GraphingCardModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/GraphingCardModel;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getDestination$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/graph/GraphingCardModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/design/models/items/graph/GraphModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/GraphModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->id:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->title:Ljava/lang/String;

    const-string v3, ""

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_3
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->icon:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->icon:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->endIcon:Lgz0/m0;

    if-eqz v2, :cond_7

    :goto_3
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->endIcon:Lgz0/m0;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->trendsCta:Ljava/lang/String;

    if-eqz v2, :cond_9

    :goto_4
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->trendsCta:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->trendCtaText:Ljava/lang/String;

    if-eqz v2, :cond_b

    :goto_5
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->trendCtaText:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->progressDisplay:Ljava/lang/String;

    if-eqz v2, :cond_d

    :goto_6
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->progressDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_7

    :cond_e
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->sevenDayVow:Ljava/lang/String;

    if-eqz v2, :cond_f

    :goto_7
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->sevenDayVow:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_10

    goto :goto_8

    :cond_10
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

    if-eqz v2, :cond_11

    :goto_8
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_11
    const/16 v1, 0xa

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_12

    goto :goto_9

    :cond_12
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->graphLegends:Ljava/util/List;

    if-eqz v2, :cond_13

    :goto_9
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->graphLegends:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_13
    const/16 v1, 0xb

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_14

    goto :goto_a

    :cond_14
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->destination:Lcom/whoop/navigation/e;

    if-eqz v2, :cond_15

    :goto_a
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_15
    const/16 v1, 0xc

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_16

    goto :goto_b

    :cond_16
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->planProgressStatus:Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;

    if-eqz v2, :cond_17

    :goto_b
    sget-object v2, Lcom/whoop/design/models/items/graph/PlanProgressStatusModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/PlanProgressStatusModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->planProgressStatus:Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_17
    const/16 v1, 0xd

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_18

    goto :goto_c

    :cond_18
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    if-eqz v2, :cond_19

    :goto_c
    sget-object v2, Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_19
    const/16 v1, 0xe

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_1a

    goto :goto_d

    :cond_1a
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->unlockTrendsCard:Lcom/whoop/design/models/items/UnlockTrendsCardModel;

    if-eqz v2, :cond_1b

    :goto_d
    sget-object v2, Lcom/whoop/design/models/items/UnlockTrendsCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/UnlockTrendsCardModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->unlockTrendsCard:Lcom/whoop/design/models/items/UnlockTrendsCardModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1b
    const/16 v1, 0xf

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_1c

    goto :goto_e

    :cond_1c
    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->subItems:Ljava/util/List;

    if-eqz v2, :cond_1d

    :goto_e
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->subItems:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1d
    const/16 v0, 0x10

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_1e

    goto :goto_f

    :cond_1e
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->theme:Lcom/whoop/design/models/items/graph/GraphingCardTheme;

    if-eqz v1, :cond_1f

    :goto_f
    sget-object v1, Lcom/whoop/design/models/items/graph/GraphingCardTheme$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/GraphingCardTheme$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->theme:Lcom/whoop/design/models/items/graph/GraphingCardTheme;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1f
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/models/items/graph/GraphModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    return-object v0
.end method

.method public final component10()Lcom/whoop/design/models/items/CheckmarkStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

    return-object v0
.end method

.method public final component11()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/GraphLegendModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->graphLegends:Ljava/util/List;

    return-object v0
.end method

.method public final component12()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component13()Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->planProgressStatus:Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;

    return-object v0
.end method

.method public final component14()Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    return-object v0
.end method

.method public final component15()Lcom/whoop/design/models/items/UnlockTrendsCardModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->unlockTrendsCard:Lcom/whoop/design/models/items/UnlockTrendsCardModel;

    return-object v0
.end method

.method public final component16()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->subItems:Ljava/util/List;

    return-object v0
.end method

.method public final component17()Lcom/whoop/design/models/items/graph/GraphingCardTheme;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->theme:Lcom/whoop/design/models/items/graph/GraphingCardTheme;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->endIcon:Lgz0/m0;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->trendsCta:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->trendCtaText:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->progressDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->sevenDayVow:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CheckmarkStyle;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Lcom/whoop/design/models/items/UnlockTrendsCardModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphingCardTheme;)Lcom/whoop/design/models/items/graph/GraphingCardModel;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/graph/GraphModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lgz0/m0;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/CheckmarkStyle;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/GraphLegendModel;",
            ">;",
            "Lcom/whoop/navigation/e;",
            "Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;",
            "Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;",
            "Lcom/whoop/design/models/items/UnlockTrendsCardModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/design/models/items/graph/GraphingCardTheme;",
            ")",
            "Lcom/whoop/design/models/items/graph/GraphingCardModel;"
        }
    .end annotation

    const-string v0, "graph"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/graph/GraphingCardModel;

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    invoke-direct/range {v1 .. v18}, Lcom/whoop/design/models/items/graph/GraphingCardModel;-><init>(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CheckmarkStyle;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Lcom/whoop/design/models/items/UnlockTrendsCardModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphingCardTheme;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/graph/GraphingCardModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/graph/GraphingCardModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/GraphingCardModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/GraphingCardModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/GraphingCardModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/GraphingCardModel;->icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->endIcon:Lgz0/m0;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/GraphingCardModel;->endIcon:Lgz0/m0;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->trendsCta:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/GraphingCardModel;->trendsCta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->trendCtaText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/GraphingCardModel;->trendCtaText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->progressDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/GraphingCardModel;->progressDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->sevenDayVow:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/GraphingCardModel;->sevenDayVow:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/GraphingCardModel;->checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->graphLegends:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/GraphingCardModel;->graphLegends:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->destination:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/GraphingCardModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->planProgressStatus:Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/GraphingCardModel;->planProgressStatus:Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/GraphingCardModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->unlockTrendsCard:Lcom/whoop/design/models/items/UnlockTrendsCardModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/GraphingCardModel;->unlockTrendsCard:Lcom/whoop/design/models/items/UnlockTrendsCardModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->subItems:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/GraphingCardModel;->subItems:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->theme:Lcom/whoop/design/models/items/graph/GraphingCardTheme;

    iget-object p1, p1, Lcom/whoop/design/models/items/graph/GraphingCardModel;->theme:Lcom/whoop/design/models/items/graph/GraphingCardTheme;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_12

    return v2

    :cond_12
    return v0
.end method

.method public final getCheckmarkStyle()Lcom/whoop/design/models/items/CheckmarkStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

    return-object v0
.end method

.method public final getCircularProgressIndicator()Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    return-object v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getEndIcon()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->endIcon:Lgz0/m0;

    return-object v0
.end method

.method public final getGraph()Lcom/whoop/design/models/items/graph/GraphModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    return-object v0
.end method

.method public final getGraphLegends()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/GraphLegendModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->graphLegends:Ljava/util/List;

    return-object v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getPlanProgressStatus()Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->planProgressStatus:Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;

    return-object v0
.end method

.method public final getProgressDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->progressDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getSevenDayVow()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->sevenDayVow:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->subItems:Ljava/util/List;

    return-object v0
.end method

.method public final getTheme()Lcom/whoop/design/models/items/graph/GraphingCardTheme;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->theme:Lcom/whoop/design/models/items/graph/GraphingCardTheme;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrendCtaText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->trendCtaText:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrendsCta()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->trendsCta:Ljava/lang/String;

    return-object v0
.end method

.method public final getUnlockTrendsCard()Lcom/whoop/design/models/items/UnlockTrendsCardModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->unlockTrendsCard:Lcom/whoop/design/models/items/UnlockTrendsCardModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/graph/GraphModel;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->id:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->icon:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->endIcon:Lgz0/m0;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->trendsCta:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->trendCtaText:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->progressDisplay:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->sevenDayVow:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->graphLegends:Ljava/util/List;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->destination:Lcom/whoop/navigation/e;

    if-nez v2, :cond_9

    move v2, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->planProgressStatus:Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;

    if-nez v2, :cond_a

    move v2, v3

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    if-nez v2, :cond_b

    move v2, v3

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;->hashCode()I

    move-result v2

    :goto_b
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->unlockTrendsCard:Lcom/whoop/design/models/items/UnlockTrendsCardModel;

    if-nez v2, :cond_c

    move v2, v3

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Lcom/whoop/design/models/items/UnlockTrendsCardModel;->hashCode()I

    move-result v2

    :goto_c
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->subItems:Ljava/util/List;

    if-nez v2, :cond_d

    move v2, v3

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_d
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->theme:Lcom/whoop/design/models/items/graph/GraphingCardTheme;

    if-nez v1, :cond_e

    goto :goto_e

    :cond_e
    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/GraphingCardTheme;->hashCode()I

    move-result v3

    :goto_e
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->graph:Lcom/whoop/design/models/items/graph/GraphModel;

    iget-object v2, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->id:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->title:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->icon:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->endIcon:Lgz0/m0;

    iget-object v6, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->trendsCta:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->trendCtaText:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->progressDisplay:Ljava/lang/String;

    iget-object v9, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->sevenDayVow:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

    iget-object v11, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->graphLegends:Ljava/util/List;

    iget-object v12, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->destination:Lcom/whoop/navigation/e;

    iget-object v13, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->planProgressStatus:Lcom/whoop/design/models/items/graph/PlanProgressStatusModel;

    iget-object v14, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    iget-object v15, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->unlockTrendsCard:Lcom/whoop/design/models/items/UnlockTrendsCardModel;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->subItems:Ljava/util/List;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/graph/GraphingCardModel;->theme:Lcom/whoop/design/models/items/graph/GraphingCardTheme;

    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v18, v15

    const-string v15, "GraphingCardModel(graph="

    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", icon="

    const-string v2, ", endIcon="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", trendsCta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", trendCtaText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", progressDisplay="

    const-string v2, ", sevenDayVow="

    invoke-static {v0, v7, v1, v8, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", checkmarkStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", graphLegends="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", destination="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", planProgressStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", circularProgressIndicator="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", unlockTrendsCard="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", subItems="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", theme="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
