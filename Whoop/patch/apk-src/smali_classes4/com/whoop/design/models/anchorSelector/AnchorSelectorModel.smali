.class public final Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;
.implements Lcom/whoop/design/models/WithGeneratedBindings;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel$$serializer;,
        Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0018\u0008\u0087\u0008\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0002UTB\u0096\u0001\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0016\u0008\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0010\u0012+\u0008\u0002\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\t0\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019B\u0085\u0001\u0008\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0010\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0004\u0008\u0018\u0010\u001eJ#\u0010!\u001a\u00020\u00002\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u001f0\u0010H\u0016\u00a2\u0006\u0004\u0008!\u0010\"J\u0016\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0016\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010(\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u001e\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/J3\u00100\u001a%\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\t0\u0016H\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010/J\u00a3\u0001\u00101\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00032\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0016\u0008\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00102+\u0008\u0002\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\t0\u0016H\u00c6\u0001\u00a2\u0006\u0004\u00081\u00102J\u0010\u00103\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u00083\u0010\'J\u0010\u00104\u001a\u00020\u001aH\u00d6\u0001\u00a2\u0006\u0004\u00084\u00105J\u001a\u00107\u001a\u00020\u000e2\u0008\u00106\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003\u00a2\u0006\u0004\u00087\u00108J\'\u0010A\u001a\u00020>2\u0006\u00109\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0001\u00a2\u0006\u0004\u0008?\u0010@R\u001d\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010B\u001a\u0004\u0008C\u0010$R\u001d\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010B\u001a\u0004\u0008D\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010E\u001a\u0004\u0008F\u0010\'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010G\u001a\u0004\u0008H\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010I\u001a\u0004\u0008J\u0010+R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010K\u0012\u0004\u0008L\u0010M\u001a\u0004\u0008\u000f\u0010-R0\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00108\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010N\u001a\u0004\u0008O\u0010/\"\u0004\u0008P\u0010QRE\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013\u00a2\u0006\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\t0\u00168\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010N\u001a\u0004\u0008R\u0010/\"\u0004\u0008S\u0010Q\u00a8\u0006V"
    }
    d2 = {
        "Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "",
        "Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;",
        "tags",
        "Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;",
        "items",
        "",
        "stateUpdateSearchKey",
        "Lcom/whoop/design/models/tiles/EmptyTileModel;",
        "emptyTile",
        "",
        "tagsHorizontalInset",
        "",
        "isSearchActive",
        "",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "Lcom/whoop/design/models/binding/AggregateBindings;",
        "Lwc3/i;",
        "with",
        "Lj93/d;",
        "aggregateBindings",
        "<init>",
        "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/tiles/EmptyTileModel;Ljava/lang/Double;ZLjava/util/Map;Ljava/util/Map;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/tiles/EmptyTileModel;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;",
        "component1",
        "()Ljava/util/List;",
        "component2",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "()Lcom/whoop/design/models/tiles/EmptyTileModel;",
        "component5",
        "()Ljava/lang/Double;",
        "component6",
        "()Z",
        "component7",
        "()Ljava/util/Map;",
        "component8",
        "copy",
        "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/tiles/EmptyTileModel;Ljava/lang/Double;ZLjava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;",
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
        "(Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/util/List;",
        "getTags",
        "getItems",
        "Ljava/lang/String;",
        "getStateUpdateSearchKey",
        "Lcom/whoop/design/models/tiles/EmptyTileModel;",
        "getEmptyTile",
        "Ljava/lang/Double;",
        "getTagsHorizontalInset",
        "Z",
        "isSearchActive$annotations",
        "()V",
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

.field public static final Companion:Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel$Companion;


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

.field private final emptyTile:Lcom/whoop/design/models/tiles/EmptyTileModel;

.field private final isSearchActive:Z

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;",
            ">;"
        }
    .end annotation
.end field

.field private final stateUpdateSearchKey:Ljava/lang/String;

.field private final tags:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;",
            ">;"
        }
    .end annotation
.end field

.field private final tagsHorizontalInset:Ljava/lang/Double;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->Companion:Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lq70/a;

    const/16 v3, 0x1b

    invoke-direct {v2, v3}, Lq70/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lq70/a;

    const/16 v4, 0x1c

    invoke-direct {v3, v4}, Lq70/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lq70/a;

    const/16 v5, 0x1d

    invoke-direct {v4, v5}, Lq70/a;-><init>(I)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v4, 0x7

    new-array v4, v4, [Ll83/h;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    const/4 v2, 0x1

    aput-object v3, v4, v2

    const/4 v2, 0x2

    aput-object v1, v4, v2

    const/4 v2, 0x3

    aput-object v1, v4, v2

    const/4 v2, 0x4

    aput-object v1, v4, v2

    const/4 v2, 0x5

    aput-object v0, v4, v2

    const/4 v0, 0x6

    aput-object v1, v4, v0

    sput-object v4, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/tiles/EmptyTileModel;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel$$serializer;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel$$serializer;

    invoke-virtual {p9}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->tags:Ljava/util/List;

    iput-object p3, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->items:Ljava/util/List;

    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->stateUpdateSearchKey:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->stateUpdateSearchKey:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->emptyTile:Lcom/whoop/design/models/tiles/EmptyTileModel;

    goto :goto_1

    :cond_2
    iput-object p5, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->emptyTile:Lcom/whoop/design/models/tiles/EmptyTileModel;

    :goto_1
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->tagsHorizontalInset:Ljava/lang/Double;

    goto :goto_2

    :cond_3
    iput-object p6, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->tagsHorizontalInset:Ljava/lang/Double;

    :goto_2
    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->isSearchActive:Z

    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->bindings:Ljava/util/Map;

    goto :goto_3

    :cond_4
    iput-object p7, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->bindings:Ljava/util/Map;

    :goto_3
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_5

    iput-object p3, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->aggregateBindings:Ljava/util/Map;

    return-void

    :cond_5
    iput-object p8, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/tiles/EmptyTileModel;Ljava/lang/Double;ZLjava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/tiles/EmptyTileModel;",
            "Ljava/lang/Double;",
            "Z",
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

    const-string v0, "tags"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->tags:Ljava/util/List;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->items:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->stateUpdateSearchKey:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->emptyTile:Lcom/whoop/design/models/tiles/EmptyTileModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->tagsHorizontalInset:Ljava/lang/Double;

    .line 8
    iput-boolean p6, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->isSearchActive:Z

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->bindings:Ljava/util/Map;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/tiles/EmptyTileModel;Ljava/lang/Double;ZLjava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p9, 0x4

    const/4 v0, 0x0

    if-eqz p10, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_1

    move-object p4, v0

    :cond_1
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_2

    move-object p5, v0

    :cond_2
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_3

    const/4 p6, 0x0

    :cond_3
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_4

    move-object p7, v0

    :cond_4
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_5

    move-object p9, v0

    :goto_0
    move-object p8, p7

    move p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_5
    move-object p9, p8

    goto :goto_0

    .line 11
    :goto_1
    invoke-direct/range {p1 .. p9}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/tiles/EmptyTileModel;Ljava/lang/Double;ZLjava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel$$serializer;->INSTANCE:Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel$$serializer;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSectionModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1, v1}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/tiles/EmptyTileModel;Ljava/lang/Double;ZLjava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->tags:Ljava/util/List;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->items:Ljava/util/List;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->stateUpdateSearchKey:Ljava/lang/String;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->emptyTile:Lcom/whoop/design/models/tiles/EmptyTileModel;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->tagsHorizontalInset:Ljava/lang/Double;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-boolean p6, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->isSearchActive:Z

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->bindings:Ljava/util/Map;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->aggregateBindings:Ljava/util/Map;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->copy(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/tiles/EmptyTileModel;Ljava/lang/Double;ZLjava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic isSearchActive$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->tags:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->items:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->stateUpdateSearchKey:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->stateUpdateSearchKey:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->emptyTile:Lcom/whoop/design/models/tiles/EmptyTileModel;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lcom/whoop/design/models/tiles/EmptyTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/tiles/EmptyTileModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->emptyTile:Lcom/whoop/design/models/tiles/EmptyTileModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->tagsHorizontalInset:Ljava/lang/Double;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->tagsHorizontalInset:Ljava/lang/Double;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_7

    :goto_3
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {p0}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p0}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->bind(Ljava/util/Map;)Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    move-result-object p1

    return-object p1
.end method

.method public bind(Ljava/util/Map;)Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "accumulatedState"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v3

    invoke-static {v0, v2, v3, v1}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModelStateBindingKt;->generatedBind(Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    move-result-object v4

    .line 3
    iget-object v2, v0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->stateUpdateSearchKey:Ljava/lang/String;

    if-nez v2, :cond_0

    const/16 v13, 0xdf

    const/4 v14, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 4
    invoke-static/range {v4 .. v14}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->copy$default(Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/tiles/EmptyTileModel;Ljava/lang/Double;ZLjava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    move-result-object v1

    return-object v1

    .line 5
    :cond_0
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    if-nez v1, :cond_2

    const-string v1, ""

    :cond_2
    invoke-static {v1}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_3

    const/16 v13, 0xdf

    const/4 v14, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 7
    invoke-static/range {v4 .. v14}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->copy$default(Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/tiles/EmptyTileModel;Ljava/lang/Double;ZLjava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    move-result-object v1

    return-object v1

    .line 8
    :cond_3
    iget-object v3, v4, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->items:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    .line 9
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 10
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 11
    move-object v7, v5

    check-cast v7, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;

    .line 12
    invoke-virtual {v7}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getType()Ljava/lang/String;

    move-result-object v5

    const-string v8, "suggested"

    const/4 v9, 0x1

    invoke-static {v5, v8, v9}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_6

    :cond_5
    :goto_2
    move-object v5, v2

    goto :goto_4

    .line 13
    :cond_6
    invoke-virtual {v7}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getItems()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    .line 14
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 15
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_7
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 16
    check-cast v8, Lcom/whoop/design/models/DesignSystemModel;

    .line 17
    invoke-static {v8, v1}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModelKt;->access$withFilteredSearchResults(Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v8

    if-eqz v8, :cond_7

    .line 18
    invoke-interface {v10, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 19
    :cond_8
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_9

    goto :goto_2

    .line 20
    :cond_9
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/design/models/DesignSystemModel;

    .line 21
    invoke-static {v8}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModelKt;->access$isSearchResult(Lcom/whoop/design/models/DesignSystemModel;)Z

    move-result v8

    if-eqz v8, :cond_a

    const/16 v18, 0x3fb

    const/16 v19, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    .line 22
    invoke-static/range {v7 .. v19}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->copy$default(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;

    move-result-object v5

    :goto_4
    if-eqz v5, :cond_4

    .line 23
    invoke-interface {v6, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_b
    const/16 v13, 0xdc

    const/4 v14, 0x0

    .line 24
    sget-object v5, Lm83/y;->w:Lm83/y;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v4 .. v14}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->copy$default(Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/tiles/EmptyTileModel;Ljava/lang/Double;ZLjava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    move-result-object v1

    return-object v1
.end method

.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->tags:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->items:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->stateUpdateSearchKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/tiles/EmptyTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->emptyTile:Lcom/whoop/design/models/tiles/EmptyTileModel;

    return-object v0
.end method

.method public final component5()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->tagsHorizontalInset:Ljava/lang/Double;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->isSearchActive:Z

    return v0
.end method

.method public final component7()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final component8()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/tiles/EmptyTileModel;Ljava/lang/Double;ZLjava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/tiles/EmptyTileModel;",
            "Ljava/lang/Double;",
            "Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)",
            "Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;"
        }
    .end annotation

    const-string v0, "tags"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/tiles/EmptyTileModel;Ljava/lang/Double;ZLjava/util/Map;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    iget-object v1, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->tags:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->tags:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->items:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->items:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->stateUpdateSearchKey:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->stateUpdateSearchKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->emptyTile:Lcom/whoop/design/models/tiles/EmptyTileModel;

    iget-object v3, p1, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->emptyTile:Lcom/whoop/design/models/tiles/EmptyTileModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->tagsHorizontalInset:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->tagsHorizontalInset:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->isSearchActive:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->isSearchActive:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->bindings:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->bindings:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->aggregateBindings:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->aggregateBindings:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
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

    iget-object v0, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->aggregateBindings:Ljava/util/Map;

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

    iget-object v0, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getEmptyTile()Lcom/whoop/design/models/tiles/EmptyTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->emptyTile:Lcom/whoop/design/models/tiles/EmptyTileModel;

    return-object v0
.end method

.method public final getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getStateUpdateSearchKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->stateUpdateSearchKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getTags()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->tags:Ljava/util/List;

    return-object v0
.end method

.method public final getTagsHorizontalInset()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->tagsHorizontalInset:Ljava/lang/Double;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->tags:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->items:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->stateUpdateSearchKey:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->emptyTile:Lcom/whoop/design/models/tiles/EmptyTileModel;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/design/models/tiles/EmptyTileModel;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->tagsHorizontalInset:Ljava/lang/Double;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->isSearchActive:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->bindings:Ljava/util/Map;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->aggregateBindings:Ljava/util/Map;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    return v0
.end method

.method public final isSearchActive()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->isSearchActive:Z

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

    iput-object p1, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->aggregateBindings:Ljava/util/Map;

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

    iput-object p1, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->tags:Ljava/util/List;

    iget-object v1, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->items:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->stateUpdateSearchKey:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->emptyTile:Lcom/whoop/design/models/tiles/EmptyTileModel;

    iget-object v4, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->tagsHorizontalInset:Ljava/lang/Double;

    iget-boolean v5, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->isSearchActive:Z

    iget-object v6, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->bindings:Ljava/util/Map;

    iget-object v7, p0, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->aggregateBindings:Ljava/util/Map;

    const-string v8, ", items="

    const-string v9, ", stateUpdateSearchKey="

    const-string v10, "AnchorSelectorModel(tags="

    invoke-static {v10, v8, v0, v9, v1}, Ly00/t7;->j(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", emptyTile="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tagsHorizontalInset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isSearchActive="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", bindings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", aggregateBindings="

    const-string v2, ")"

    invoke-static {v0, v6, v1, v7, v2}, Lr;->n(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
