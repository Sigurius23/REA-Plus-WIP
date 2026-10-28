.class public final Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;
.implements Lcom/whoop/design/models/WithGeneratedBindings;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel$$serializer;,
        Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0018\u0008\u0087\u0008\u0018\u0000 W2\u00020\u00012\u00020\u0002:\u0002XWB\u00a0\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000b\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0016\u0008\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012+\u0008\u0002\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\t0\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019B\u0099\u0001\u0008\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0004\u0008\u0018\u0010\u001eJ#\u0010!\u001a\u00020\u00022\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001f0\u0010H\u0016\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0016\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010(J\u0010\u0010,\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010-J\u0012\u0010/\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008/\u00100J\u001e\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u00081\u00102J3\u00103\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\t0\u0016H\u00c6\u0003\u00a2\u0006\u0004\u00083\u00102J\u00b1\u0001\u00104\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000b2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0016\u0008\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102+\u0008\u0002\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\t0\u0016H\u00c6\u0001\u00a2\u0006\u0004\u00084\u00105J\u0010\u00106\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u00086\u0010$J\u0010\u00107\u001a\u00020\u001aH\u00d6\u0001\u00a2\u0006\u0004\u00087\u00108J\u001a\u0010:\u001a\u00020\u000b2\u0008\u00109\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003\u00a2\u0006\u0004\u0008:\u0010;J\'\u0010D\u001a\u00020A2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0001\u00a2\u0006\u0004\u0008B\u0010CR\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010E\u001a\u0004\u0008F\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010G\u001a\u0004\u0008H\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010I\u001a\u0004\u0008J\u0010(R\u001d\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010K\u001a\u0004\u0008L\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010I\u001a\u0004\u0008M\u0010(R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010N\u001a\u0004\u0008\u000c\u0010-R\u0017\u0010\r\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010N\u001a\u0004\u0008\r\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010O\u001a\u0004\u0008P\u00100R0\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00108\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010Q\u001a\u0004\u0008R\u00102\"\u0004\u0008S\u0010TRE\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\t0\u00168\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010Q\u001a\u0004\u0008U\u00102\"\u0004\u0008V\u0010T\u00a8\u0006Y"
    }
    d2 = {
        "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "",
        "recommendationId",
        "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;",
        "status",
        "header",
        "",
        "body",
        "cta",
        "",
        "isExpanded",
        "isSelected",
        "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;",
        "style",
        "",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "Lcom/whoop/design/models/binding/AggregateBindings;",
        "Lwc3/i;",
        "with",
        "Lj93/d;",
        "aggregateBindings",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;ZZLcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;Ljava/util/Map;Ljava/util/Map;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;ZZLcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;",
        "component3",
        "()Lcom/whoop/design/models/DesignSystemModel;",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "component6",
        "()Z",
        "component7",
        "component8",
        "()Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;",
        "component9",
        "()Ljava/util/Map;",
        "component10",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;ZZLcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getRecommendationId",
        "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;",
        "getStatus",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "getHeader",
        "Ljava/util/List;",
        "getBody",
        "getCta",
        "Z",
        "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;",
        "getStyle",
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

.field public static final Companion:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel$Companion;


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

.field private final body:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final cta:Lcom/whoop/design/models/DesignSystemModel;

.field private final header:Lcom/whoop/design/models/DesignSystemModel;

.field private final isExpanded:Z

.field private final isSelected:Z

.field private final recommendationId:Ljava/lang/String;

.field private final status:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

.field private final style:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->Companion:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lz91/a;

    const/16 v4, 0xb

    invoke-direct {v3, v4}, Lz91/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lz91/a;

    const/16 v5, 0xc

    invoke-direct {v4, v5}, Lz91/a;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v5, Lz91/a;

    const/16 v6, 0xd

    invoke-direct {v5, v6}, Lz91/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v6, Lz91/a;

    const/16 v7, 0xe

    invoke-direct {v6, v7}, Lz91/a;-><init>(I)V

    invoke-static {v2, v6}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v6

    new-instance v7, Lz91/a;

    const/16 v8, 0xf

    invoke-direct {v7, v8}, Lz91/a;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v7

    new-instance v8, Lz91/a;

    const/16 v9, 0x10

    invoke-direct {v8, v9}, Lz91/a;-><init>(I)V

    invoke-static {v2, v8}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v8, 0xa

    new-array v8, v8, [Ll83/h;

    const/4 v9, 0x0

    aput-object v1, v8, v9

    const/4 v9, 0x1

    aput-object v3, v8, v9

    const/4 v3, 0x2

    aput-object v4, v8, v3

    const/4 v3, 0x3

    aput-object v5, v8, v3

    const/4 v3, 0x4

    aput-object v6, v8, v3

    const/4 v3, 0x5

    aput-object v1, v8, v3

    const/4 v3, 0x6

    aput-object v1, v8, v3

    const/4 v3, 0x7

    aput-object v7, v8, v3

    aput-object v2, v8, v0

    const/16 v0, 0x9

    aput-object v1, v8, v0

    sput-object v8, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;ZZLcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p12, p1, 0x17

    const/16 v0, 0x17

    if-eq v0, p12, :cond_0

    .line 1
    sget-object p12, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel$$serializer;

    invoke-virtual {p12}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p12

    invoke-static {p1, v0, p12}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->recommendationId:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->status:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    iput-object p4, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->header:Lcom/whoop/design/models/DesignSystemModel;

    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_1

    .line 2
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 3
    iput-object p2, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->body:Ljava/util/List;

    goto :goto_0

    :cond_1
    iput-object p5, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->body:Ljava/util/List;

    :goto_0
    iput-object p6, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->cta:Lcom/whoop/design/models/DesignSystemModel;

    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_2

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->isExpanded:Z

    goto :goto_1

    :cond_2
    iput-boolean p7, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->isExpanded:Z

    :goto_1
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_3

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->isSelected:Z

    goto :goto_2

    :cond_3
    iput-boolean p8, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->isSelected:Z

    :goto_2
    and-int/lit16 p2, p1, 0x80

    const/4 p3, 0x0

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->style:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;

    goto :goto_3

    :cond_4
    iput-object p9, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->style:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;

    :goto_3
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->bindings:Ljava/util/Map;

    goto :goto_4

    :cond_5
    iput-object p10, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->bindings:Ljava/util/Map;

    :goto_4
    and-int/lit16 p1, p1, 0x200

    if-nez p1, :cond_6

    iput-object p3, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->aggregateBindings:Ljava/util/Map;

    return-void

    :cond_6
    iput-object p11, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;ZZLcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "ZZ",
            "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;",
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

    const-string v0, "recommendationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->recommendationId:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->status:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    .line 7
    iput-object p3, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->header:Lcom/whoop/design/models/DesignSystemModel;

    .line 8
    iput-object p4, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->body:Ljava/util/List;

    .line 9
    iput-object p5, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->cta:Lcom/whoop/design/models/DesignSystemModel;

    .line 10
    iput-boolean p6, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->isExpanded:Z

    .line 11
    iput-boolean p7, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->isSelected:Z

    .line 12
    iput-object p8, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->style:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;

    .line 13
    iput-object p9, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->bindings:Ljava/util/Map;

    .line 14
    iput-object p10, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;ZZLcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_0

    .line 15
    sget-object v1, Lm83/y;->w:Lm83/y;

    move-object v6, v1

    goto :goto_0

    :cond_0
    move-object/from16 v6, p4

    :goto_0
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    move v8, v1

    goto :goto_1

    :cond_1
    move/from16 v8, p6

    :goto_1
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    move v9, v1

    goto :goto_2

    :cond_2
    move/from16 v9, p7

    :goto_2
    and-int/lit16 v1, v0, 0x80

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    move-object v10, v2

    goto :goto_3

    :cond_3
    move-object/from16 v10, p8

    :goto_3
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_4

    move-object v11, v2

    goto :goto_4

    :cond_4
    move-object/from16 v11, p9

    :goto_4
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_5

    move-object v12, v2

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v5, p3

    move-object/from16 v7, p5

    move-object v2, p0

    goto :goto_5

    :cond_5
    move-object/from16 v12, p10

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v5, p3

    move-object/from16 v7, p5

    .line 16
    :goto_5
    invoke-direct/range {v2 .. v12}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;-><init>(Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;ZZLcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;->Companion:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus$Companion;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 6

    new-instance v0, Lwc3/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lwc3/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v5, v2, [Ljava/lang/annotation/Annotation;

    invoke-direct {v4, v1, v5}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    new-array v2, v2, [Lwc3/c;

    invoke-direct {v0, v3, v1, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

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

.method private static final _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 6

    new-instance v0, Lwc3/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lwc3/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v5, v2, [Ljava/lang/annotation/Annotation;

    invoke-direct {v4, v1, v5}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    new-array v2, v2, [Lwc3/c;

    invoke-direct {v0, v3, v1, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$3()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;->Companion:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle$Companion;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$4()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1, v1}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->_childSerializers$_anonymous_$3()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->_childSerializers$_anonymous_$4()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;ZZLcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->recommendationId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->status:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->header:Lcom/whoop/design/models/DesignSystemModel;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->body:Ljava/util/List;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->cta:Lcom/whoop/design/models/DesignSystemModel;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-boolean p6, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->isExpanded:Z

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-boolean p7, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->isSelected:Z

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->style:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->bindings:Ljava/util/Map;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->aggregateBindings:Ljava/util/Map;

    :cond_9
    move-object p11, p9

    move-object p12, p10

    move p9, p7

    move-object p10, p8

    move-object p7, p5

    move p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->copy(Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;ZZLcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->recommendationId:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->status:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->header:Lcom/whoop/design/models/DesignSystemModel;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->body:Ljava/util/List;

    sget-object v4, Lm83/y;->w:Lm83/y;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    :goto_0
    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->body:Ljava/util/List;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v2, 0x4

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->cta:Lcom/whoop/design/models/DesignSystemModel;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x5

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    iget-boolean v3, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->isExpanded:Z

    if-eq v3, v1, :cond_3

    :goto_1
    iget-boolean v1, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->isExpanded:Z

    invoke-interface {p1, p2, v2, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_3
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-boolean v2, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->isSelected:Z

    if-eqz v2, :cond_5

    :goto_2
    iget-boolean v2, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->isSelected:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_5
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->style:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;

    if-eqz v2, :cond_7

    :goto_3
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->style:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_9

    :goto_4
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/16 v0, 0x9

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_b

    :goto_5
    sget-object v1, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    return-void
.end method


# virtual methods
.method public bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/design/models/WithGeneratedBindings;"
        }
    .end annotation

    const-string v0, "accumulatedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->getBindings()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    invoke-static {p0, v0, v1, p1}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModelStateBindingKt;->generatedBind(Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;

    move-result-object p1

    return-object p1
.end method

.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->recommendationId:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->status:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->header:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->body:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->cta:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->isExpanded:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->isSelected:Z

    return v0
.end method

.method public final component8()Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->style:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;

    return-object v0
.end method

.method public final component9()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;ZZLcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "ZZ",
            "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)",
            "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;"
        }
    .end annotation

    const-string v0, "recommendationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;-><init>(Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;ZZLcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;Ljava/util/Map;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->recommendationId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->recommendationId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->status:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    iget-object v3, p1, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->status:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->header:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->header:Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->body:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->body:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->cta:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->cta:Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->isExpanded:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->isExpanded:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->isSelected:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->isSelected:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->style:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;

    iget-object v3, p1, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->style:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->bindings:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->bindings:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->aggregateBindings:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->aggregateBindings:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
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

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->aggregateBindings:Ljava/util/Map;

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

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getBody()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->body:Ljava/util/List;

    return-object v0
.end method

.method public final getCta()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->cta:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final getHeader()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->header:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final getRecommendationId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->recommendationId:Ljava/lang/String;

    return-object v0
.end method

.method public final getStatus()Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->status:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    return-object v0
.end method

.method public final getStyle()Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->style:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->recommendationId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->status:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->header:Lcom/whoop/design/models/DesignSystemModel;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->body:Ljava/util/List;

    invoke-static {v2, v1, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->cta:Lcom/whoop/design/models/DesignSystemModel;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->isExpanded:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->isSelected:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->style:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->bindings:Ljava/util/Map;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->aggregateBindings:Ljava/util/Map;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    return v0
.end method

.method public final isExpanded()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->isExpanded:Z

    return v0
.end method

.method public final isSelected()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->isSelected:Z

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

    iput-object p1, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->aggregateBindings:Ljava/util/Map;

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

    iput-object p1, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->recommendationId:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->status:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    iget-object v2, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->header:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v3, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->body:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->cta:Lcom/whoop/design/models/DesignSystemModel;

    iget-boolean v5, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->isExpanded:Z

    iget-boolean v6, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->isSelected:Z

    iget-object v7, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->style:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileLayoutStyle;

    iget-object v8, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->bindings:Ljava/util/Map;

    iget-object v9, p0, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileModel;->aggregateBindings:Ljava/util/Map;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "RecommendationTileModel(recommendationId="

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", status="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", header="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", body="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", cta="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isExpanded="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isSelected="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", style="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bindings="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", aggregateBindings="

    const-string v1, ")"

    invoke-static {v10, v8, v0, v9, v1}, Lr;->n(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
