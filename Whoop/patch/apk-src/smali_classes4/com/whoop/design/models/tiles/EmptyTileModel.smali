.class public final Lcom/whoop/design/models/tiles/EmptyTileModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;
.implements Lcom/whoop/design/models/WithGeneratedBindings;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/tiles/EmptyTileModel$$serializer;,
        Lcom/whoop/design/models/tiles/EmptyTileModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u001a\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\u0008\u0087\u0008\u0018\u0000 [2\u00020\u00012\u00020\u0002:\u0002\\[B\u00a6\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0016\u0008\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011\u0012+\u0008\u0002\u0010\u0018\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0004\u0018\u0001`\u0014\u00a2\u0006\u000c\u0008\u0015\u0012\u0008\u0008\u0016\u0012\u0004\u0008\t0\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aB\u00a1\u0001\u0008\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011\u0012\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\u0004\u0008\u0019\u0010\u001fJ#\u0010\"\u001a\u00020\u00002\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020 0\u0011H\u0016\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010%J\u0010\u0010\'\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010%J\u0010\u0010(\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010%J\u0012\u0010)\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010,J\u0012\u0010.\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u00080\u00101J\u001e\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0004\u00082\u00103J3\u00104\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0004\u0018\u0001`\u0014\u00a2\u0006\u000c\u0008\u0015\u0012\u0008\u0008\u0016\u0012\u0004\u0008\t0\u0017H\u00c6\u0003\u00a2\u0006\u0004\u00084\u00103J\u00b9\u0001\u00105\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0016\u0008\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00112+\u0008\u0002\u0010\u0018\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0004\u0018\u0001`\u0014\u00a2\u0006\u000c\u0008\u0015\u0012\u0008\u0008\u0016\u0012\u0004\u0008\t0\u0017H\u00c6\u0001\u00a2\u0006\u0004\u00085\u00106J\u0010\u00107\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u00087\u0010%J\u0010\u00108\u001a\u00020\u001bH\u00d6\u0001\u00a2\u0006\u0004\u00088\u00109J\u001a\u0010<\u001a\u00020;2\u0008\u0010:\u001a\u0004\u0018\u00010 H\u00d6\u0003\u00a2\u0006\u0004\u0008<\u0010=J\'\u0010F\u001a\u00020C2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AH\u0001\u00a2\u0006\u0004\u0008D\u0010ER\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010G\u001a\u0004\u0008H\u0010%R\u0017\u0010\u0005\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010G\u001a\u0004\u0008I\u0010%R\u0017\u0010\u0006\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010G\u001a\u0004\u0008J\u0010%R\u0017\u0010\u0007\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010G\u001a\u0004\u0008K\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010L\u001a\u0004\u0008M\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010N\u001a\u0004\u0008O\u0010,R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010N\u001a\u0004\u0008P\u0010,R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010Q\u001a\u0004\u0008R\u0010/R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010S\u001a\u0004\u0008T\u00101R0\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00118\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010U\u001a\u0004\u0008V\u00103\"\u0004\u0008W\u0010XRE\u0010\u0018\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0004\u0018\u0001`\u0014\u00a2\u0006\u000c\u0008\u0015\u0012\u0008\u0008\u0016\u0012\u0004\u0008\t0\u00178\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010U\u001a\u0004\u0008Y\u00103\"\u0004\u0008Z\u0010X\u00a8\u0006]"
    }
    d2 = {
        "Lcom/whoop/design/models/tiles/EmptyTileModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "",
        "id",
        "title",
        "body",
        "imageUrl",
        "Lcom/whoop/design/models/items/TagModel;",
        "tag",
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "primaryButton",
        "secondaryButton",
        "Lk11/a;",
        "buttonConfiguration",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "viewedAnalyticEvent",
        "",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "Lcom/whoop/design/models/binding/AggregateBindings;",
        "Lwc3/i;",
        "with",
        "Lj93/d;",
        "aggregateBindings",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lk11/a;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lk11/a;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/design/models/tiles/EmptyTileModel;",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "()Lcom/whoop/design/models/items/TagModel;",
        "component6",
        "()Lcom/whoop/design/models/items/CardButtonModel;",
        "component7",
        "component8",
        "()Lk11/a;",
        "component9",
        "()Lcom/whoop/analytics/AnalyticEventModel;",
        "component10",
        "()Ljava/util/Map;",
        "component11",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lk11/a;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/tiles/EmptyTileModel;",
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
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/tiles/EmptyTileModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "getTitle",
        "getBody",
        "getImageUrl",
        "Lcom/whoop/design/models/items/TagModel;",
        "getTag",
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "getPrimaryButton",
        "getSecondaryButton",
        "Lk11/a;",
        "getButtonConfiguration",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "getViewedAnalyticEvent",
        "Ljava/util/Map;",
        "getBindings",
        "setBindings",
        "(Ljava/util/Map;)V",
        "getAggregateBindings",
        "setAggregateBindings",
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

.field public static final Companion:Lcom/whoop/design/models/tiles/EmptyTileModel$Companion;


# instance fields
.field private aggregateBindings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;"
        }
    .end annotation
.end field

.field private bindings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final body:Ljava/lang/String;

.field private final buttonConfiguration:Lk11/a;

.field private final id:Ljava/lang/String;

.field private final imageUrl:Ljava/lang/String;

.field private final primaryButton:Lcom/whoop/design/models/items/CardButtonModel;

.field private final secondaryButton:Lcom/whoop/design/models/items/CardButtonModel;

.field private final tag:Lcom/whoop/design/models/items/TagModel;

.field private final title:Ljava/lang/String;

.field private final viewedAnalyticEvent:Lcom/whoop/analytics/AnalyticEventModel;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/whoop/design/models/tiles/EmptyTileModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/tiles/EmptyTileModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/tiles/EmptyTileModel;->Companion:Lcom/whoop/design/models/tiles/EmptyTileModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/tiles/EmptyTileModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lf1/z1;

    const/4 v4, 0x3

    invoke-direct {v3, v4}, Lf1/z1;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lf1/z1;

    const/4 v6, 0x4

    invoke-direct {v5, v6}, Lf1/z1;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v5, 0xb

    new-array v5, v5, [Ll83/h;

    const/4 v7, 0x0

    aput-object v1, v5, v7

    const/4 v7, 0x1

    aput-object v1, v5, v7

    const/4 v7, 0x2

    aput-object v1, v5, v7

    aput-object v1, v5, v4

    aput-object v1, v5, v6

    const/4 v4, 0x5

    aput-object v1, v5, v4

    const/4 v4, 0x6

    aput-object v1, v5, v4

    const/4 v4, 0x7

    aput-object v3, v5, v4

    aput-object v1, v5, v0

    const/16 v0, 0x9

    aput-object v2, v5, v0

    const/16 v0, 0xa

    aput-object v1, v5, v0

    sput-object v5, Lcom/whoop/design/models/tiles/EmptyTileModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lk11/a;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p13, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p13, :cond_0

    .line 1
    sget-object p13, Lcom/whoop/design/models/tiles/EmptyTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/tiles/EmptyTileModel$$serializer;

    invoke-virtual {p13}, Lcom/whoop/design/models/tiles/EmptyTileModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p13

    invoke-static {p1, v0, p13}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->title:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->body:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->imageUrl:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->tag:Lcom/whoop/design/models/items/TagModel;

    and-int/lit8 p2, p1, 0x20

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->primaryButton:Lcom/whoop/design/models/items/CardButtonModel;

    goto :goto_0

    :cond_1
    iput-object p7, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->primaryButton:Lcom/whoop/design/models/items/CardButtonModel;

    :goto_0
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->secondaryButton:Lcom/whoop/design/models/items/CardButtonModel;

    goto :goto_1

    :cond_2
    iput-object p8, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->secondaryButton:Lcom/whoop/design/models/items/CardButtonModel;

    :goto_1
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->buttonConfiguration:Lk11/a;

    goto :goto_2

    :cond_3
    iput-object p9, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->buttonConfiguration:Lk11/a;

    :goto_2
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->viewedAnalyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    goto :goto_3

    :cond_4
    iput-object p10, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->viewedAnalyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    :goto_3
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->bindings:Ljava/util/Map;

    goto :goto_4

    :cond_5
    iput-object p11, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->bindings:Ljava/util/Map;

    :goto_4
    and-int/lit16 p1, p1, 0x400

    if-nez p1, :cond_6

    iput-object p3, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->aggregateBindings:Ljava/util/Map;

    return-void

    :cond_6
    iput-object p12, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lk11/a;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/TagModel;",
            "Lcom/whoop/design/models/items/CardButtonModel;",
            "Lcom/whoop/design/models/items/CardButtonModel;",
            "Lk11/a;",
            "Lcom/whoop/analytics/AnalyticEventModel;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageUrl"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->title:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->body:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->imageUrl:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->tag:Lcom/whoop/design/models/items/TagModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->primaryButton:Lcom/whoop/design/models/items/CardButtonModel;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->secondaryButton:Lcom/whoop/design/models/items/CardButtonModel;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->buttonConfiguration:Lk11/a;

    .line 11
    iput-object p9, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->viewedAnalyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    .line 12
    iput-object p10, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->bindings:Ljava/util/Map;

    .line 13
    iput-object p11, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lk11/a;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p13, p12, 0x20

    const/4 v0, 0x0

    if-eqz p13, :cond_0

    move-object p6, v0

    :cond_0
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_1

    move-object p7, v0

    :cond_1
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_2

    move-object p8, v0

    :cond_2
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_3

    move-object p9, v0

    :cond_3
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_4

    move-object p10, v0

    :cond_4
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_5

    move-object p12, v0

    :goto_0
    move-object p11, p10

    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_5
    move-object p12, p11

    goto :goto_0

    .line 14
    :goto_1
    invoke-direct/range {p1 .. p12}, Lcom/whoop/design/models/tiles/EmptyTileModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lk11/a;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.molecule.emptytile.ButtonConfiguration"

    invoke-static {}, Lk11/a;->values()[Lk11/a;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1, v1}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/tiles/EmptyTileModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/tiles/EmptyTileModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/tiles/EmptyTileModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/tiles/EmptyTileModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lk11/a;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/tiles/EmptyTileModel;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->body:Ljava/lang/String;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->imageUrl:Ljava/lang/String;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->tag:Lcom/whoop/design/models/items/TagModel;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->primaryButton:Lcom/whoop/design/models/items/CardButtonModel;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->secondaryButton:Lcom/whoop/design/models/items/CardButtonModel;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->buttonConfiguration:Lk11/a;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->viewedAnalyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->bindings:Ljava/util/Map;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->aggregateBindings:Ljava/util/Map;

    :cond_a
    move-object p12, p10

    move-object p13, p11

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

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/design/models/tiles/EmptyTileModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lk11/a;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/tiles/EmptyTileModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/tiles/EmptyTileModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/tiles/EmptyTileModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->body:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->imageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/design/models/items/TagModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TagModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->tag:Lcom/whoop/design/models/items/TagModel;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->primaryButton:Lcom/whoop/design/models/items/CardButtonModel;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lcom/whoop/design/models/items/CardButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CardButtonModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->primaryButton:Lcom/whoop/design/models/items/CardButtonModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->secondaryButton:Lcom/whoop/design/models/items/CardButtonModel;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lcom/whoop/design/models/items/CardButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CardButtonModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->secondaryButton:Lcom/whoop/design/models/items/CardButtonModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->buttonConfiguration:Lk11/a;

    if-eqz v2, :cond_5

    :goto_2
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->buttonConfiguration:Lk11/a;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->viewedAnalyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    if-eqz v2, :cond_7

    :goto_3
    sget-object v2, Lcom/whoop/analytics/AnalyticEventModel$$serializer;->INSTANCE:Lcom/whoop/analytics/AnalyticEventModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->viewedAnalyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {p0}, Lcom/whoop/design/models/tiles/EmptyTileModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_9

    :goto_4
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/design/models/tiles/EmptyTileModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/16 v0, 0xa

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    invoke-virtual {p0}, Lcom/whoop/design/models/tiles/EmptyTileModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_b

    :goto_5
    sget-object v1, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p0}, Lcom/whoop/design/models/tiles/EmptyTileModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/whoop/design/models/tiles/EmptyTileModel;->bind(Ljava/util/Map;)Lcom/whoop/design/models/tiles/EmptyTileModel;

    move-result-object p1

    return-object p1
.end method

.method public bind(Ljava/util/Map;)Lcom/whoop/design/models/tiles/EmptyTileModel;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/design/models/tiles/EmptyTileModel;"
        }
    .end annotation

    const-string v0, "accumulatedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/whoop/design/models/tiles/EmptyTileModel;->getBindings()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/tiles/EmptyTileModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    invoke-static {p0, v0, v1, p1}, Lcom/whoop/design/models/tiles/EmptyTileModelStateBindingKt;->generatedBind(Lcom/whoop/design/models/tiles/EmptyTileModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/tiles/EmptyTileModel;

    move-result-object p1

    return-object p1
.end method

.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final component11()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->body:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/items/TagModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->tag:Lcom/whoop/design/models/items/TagModel;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/items/CardButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->primaryButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/models/items/CardButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->secondaryButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-object v0
.end method

.method public final component8()Lk11/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->buttonConfiguration:Lk11/a;

    return-object v0
.end method

.method public final component9()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->viewedAnalyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lk11/a;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/tiles/EmptyTileModel;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/TagModel;",
            "Lcom/whoop/design/models/items/CardButtonModel;",
            "Lcom/whoop/design/models/items/CardButtonModel;",
            "Lk11/a;",
            "Lcom/whoop/analytics/AnalyticEventModel;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)",
            "Lcom/whoop/design/models/tiles/EmptyTileModel;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageUrl"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/tiles/EmptyTileModel;

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/whoop/design/models/tiles/EmptyTileModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lk11/a;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/tiles/EmptyTileModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/tiles/EmptyTileModel;

    iget-object v1, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/tiles/EmptyTileModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/tiles/EmptyTileModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->body:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/tiles/EmptyTileModel;->body:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/tiles/EmptyTileModel;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->tag:Lcom/whoop/design/models/items/TagModel;

    iget-object v3, p1, Lcom/whoop/design/models/tiles/EmptyTileModel;->tag:Lcom/whoop/design/models/items/TagModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->primaryButton:Lcom/whoop/design/models/items/CardButtonModel;

    iget-object v3, p1, Lcom/whoop/design/models/tiles/EmptyTileModel;->primaryButton:Lcom/whoop/design/models/items/CardButtonModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->secondaryButton:Lcom/whoop/design/models/items/CardButtonModel;

    iget-object v3, p1, Lcom/whoop/design/models/tiles/EmptyTileModel;->secondaryButton:Lcom/whoop/design/models/items/CardButtonModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->buttonConfiguration:Lk11/a;

    iget-object v3, p1, Lcom/whoop/design/models/tiles/EmptyTileModel;->buttonConfiguration:Lk11/a;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->viewedAnalyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    iget-object v3, p1, Lcom/whoop/design/models/tiles/EmptyTileModel;->viewedAnalyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->bindings:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/design/models/tiles/EmptyTileModel;->bindings:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->aggregateBindings:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/design/models/tiles/EmptyTileModel;->aggregateBindings:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public getAggregateBindings()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public getBindings()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->body:Ljava/lang/String;

    return-object v0
.end method

.method public final getButtonConfiguration()Lk11/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->buttonConfiguration:Lk11/a;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getPrimaryButton()Lcom/whoop/design/models/items/CardButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->primaryButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-object v0
.end method

.method public final getSecondaryButton()Lcom/whoop/design/models/items/CardButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->secondaryButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-object v0
.end method

.method public final getTag()Lcom/whoop/design/models/items/TagModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->tag:Lcom/whoop/design/models/items/TagModel;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getViewedAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->viewedAnalyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->body:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->imageUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->tag:Lcom/whoop/design/models/items/TagModel;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/design/models/items/TagModel;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->primaryButton:Lcom/whoop/design/models/items/CardButtonModel;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/design/models/items/CardButtonModel;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->secondaryButton:Lcom/whoop/design/models/items/CardButtonModel;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/design/models/items/CardButtonModel;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->buttonConfiguration:Lk11/a;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->viewedAnalyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lcom/whoop/analytics/AnalyticEventModel;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->bindings:Ljava/util/Map;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->aggregateBindings:Ljava/util/Map;

    if-nez v1, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    return v0
.end method

.method public setAggregateBindings(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public setBindings(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->body:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->imageUrl:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->tag:Lcom/whoop/design/models/items/TagModel;

    iget-object v5, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->primaryButton:Lcom/whoop/design/models/items/CardButtonModel;

    iget-object v6, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->secondaryButton:Lcom/whoop/design/models/items/CardButtonModel;

    iget-object v7, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->buttonConfiguration:Lk11/a;

    iget-object v8, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->viewedAnalyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    iget-object v9, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->bindings:Ljava/util/Map;

    iget-object v10, p0, Lcom/whoop/design/models/tiles/EmptyTileModel;->aggregateBindings:Ljava/util/Map;

    const-string v11, ", title="

    const-string v12, ", body="

    const-string v13, "EmptyTileModel(id="

    invoke-static {v13, v0, v11, v1, v12}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imageUrl="

    const-string v11, ", tag="

    invoke-static {v0, v2, v1, v3, v11}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", primaryButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", secondaryButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", buttonConfiguration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", viewedAnalyticEvent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bindings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", aggregateBindings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v10, v1}, Lev/n;->l(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
