.class public final Lcom/whoop/design/models/modal/BottomSheet;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/modal/Modal;
.implements Lcom/whoop/design/models/WithGeneratedBindings;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/modal/BottomSheet$$serializer;,
        Lcom/whoop/design/models/modal/BottomSheet$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0002UTBK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011B\u0089\u0001\u0008\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0004\u0008\u0010\u0010\u001aJ#\u0010\u001d\u001a\u00020\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u0014H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0016\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*JX\u0010+\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010 J\u0010\u0010.\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u001a\u00102\u001a\u0002012\u0008\u00100\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003\u00a2\u0006\u0004\u00082\u00103J\'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001\u00a2\u0006\u0004\u0008:\u0010;R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010=\u001a\u0004\u0008>\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010?\u001a\u0004\u0008@\u0010\"R\u001d\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010A\u001a\u0004\u0008B\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010C\u001a\u0004\u0008D\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010E\u001a\u0004\u0008F\u0010(R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010G\u001a\u0004\u0008H\u0010*R0\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00148\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010I\u001a\u0004\u0008J\u0010K\"\u0004\u0008L\u0010MRE\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014j\u0004\u0018\u0001`N\u00a2\u0006\u000c\u0008O\u0012\u0008\u0008P\u0012\u0004\u0008\t0Q8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010I\u001a\u0004\u0008R\u0010K\"\u0004\u0008S\u0010M\u00a8\u0006V"
    }
    d2 = {
        "Lcom/whoop/design/models/modal/BottomSheet;",
        "Lcom/whoop/design/models/modal/Modal;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "",
        "id",
        "Lcom/whoop/design/models/items/NavigationBarModel;",
        "navigationBar",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "items",
        "Lcom/whoop/design/models/modal/BottomSheetHeight;",
        "height",
        "Lcom/whoop/design/models/modal/BottomSheetFixedHeader;",
        "fixedHeader",
        "Lcom/whoop/design/models/modal/BottomSheetFixedFooter;",
        "fixedFooter",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/modal/BottomSheetHeight;Lcom/whoop/design/models/modal/BottomSheetFixedHeader;Lcom/whoop/design/models/modal/BottomSheetFixedFooter;)V",
        "",
        "seen0",
        "",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "aggregateBindings",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/modal/BottomSheetHeight;Lcom/whoop/design/models/modal/BottomSheetFixedHeader;Lcom/whoop/design/models/modal/BottomSheetFixedFooter;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/design/models/modal/BottomSheet;",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/design/models/items/NavigationBarModel;",
        "component3",
        "()Ljava/util/List;",
        "component4",
        "()Lcom/whoop/design/models/modal/BottomSheetHeight;",
        "component5",
        "()Lcom/whoop/design/models/modal/BottomSheetFixedHeader;",
        "component6",
        "()Lcom/whoop/design/models/modal/BottomSheetFixedFooter;",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/modal/BottomSheetHeight;Lcom/whoop/design/models/modal/BottomSheetFixedHeader;Lcom/whoop/design/models/modal/BottomSheetFixedFooter;)Lcom/whoop/design/models/modal/BottomSheet;",
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
        "(Lcom/whoop/design/models/modal/BottomSheet;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "Lcom/whoop/design/models/items/NavigationBarModel;",
        "getNavigationBar",
        "Ljava/util/List;",
        "getItems",
        "Lcom/whoop/design/models/modal/BottomSheetHeight;",
        "getHeight",
        "Lcom/whoop/design/models/modal/BottomSheetFixedHeader;",
        "getFixedHeader",
        "Lcom/whoop/design/models/modal/BottomSheetFixedFooter;",
        "getFixedFooter",
        "Ljava/util/Map;",
        "getBindings",
        "()Ljava/util/Map;",
        "setBindings",
        "(Ljava/util/Map;)V",
        "Lcom/whoop/design/models/binding/AggregateBindings;",
        "Lwc3/i;",
        "with",
        "Lj93/d;",
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

.field public static final Companion:Lcom/whoop/design/models/modal/BottomSheet$Companion;


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

.field private final fixedFooter:Lcom/whoop/design/models/modal/BottomSheetFixedFooter;

.field private final fixedHeader:Lcom/whoop/design/models/modal/BottomSheetFixedHeader;

.field private final height:Lcom/whoop/design/models/modal/BottomSheetHeight;

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

.field private final navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/design/models/modal/BottomSheet$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/modal/BottomSheet$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/modal/BottomSheet;->Companion:Lcom/whoop/design/models/modal/BottomSheet$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/modal/BottomSheet;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lcom/whoop/design/models/calendar/archmini/a;

    const/16 v4, 0x9

    invoke-direct {v3, v4}, Lcom/whoop/design/models/calendar/archmini/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lcom/whoop/design/models/calendar/archmini/a;

    const/16 v5, 0xa

    invoke-direct {v4, v5}, Lcom/whoop/design/models/calendar/archmini/a;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v5, Lcom/whoop/design/models/calendar/archmini/a;

    const/16 v6, 0xb

    invoke-direct {v5, v6}, Lcom/whoop/design/models/calendar/archmini/a;-><init>(I)V

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

    aput-object v1, v0, v3

    const/4 v3, 0x5

    aput-object v1, v0, v3

    const/4 v3, 0x6

    aput-object v2, v0, v3

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lcom/whoop/design/models/modal/BottomSheet;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/modal/BottomSheetHeight;Lcom/whoop/design/models/modal/BottomSheetFixedHeader;Lcom/whoop/design/models/modal/BottomSheetFixedFooter;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/design/models/modal/BottomSheet$$serializer;->INSTANCE:Lcom/whoop/design/models/modal/BottomSheet$$serializer;

    invoke-virtual {p10}, Lcom/whoop/design/models/modal/BottomSheet$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/modal/BottomSheet;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/modal/BottomSheet;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_1

    .line 2
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 3
    iput-object p2, p0, Lcom/whoop/design/models/modal/BottomSheet;->items:Ljava/util/List;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lcom/whoop/design/models/modal/BottomSheet;->items:Ljava/util/List;

    :goto_0
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_2

    .line 4
    sget-object p2, Lcom/whoop/design/models/modal/BottomSheetHeight;->PARTIAL:Lcom/whoop/design/models/modal/BottomSheetHeight;

    .line 5
    iput-object p2, p0, Lcom/whoop/design/models/modal/BottomSheet;->height:Lcom/whoop/design/models/modal/BottomSheetHeight;

    goto :goto_1

    :cond_2
    iput-object p5, p0, Lcom/whoop/design/models/modal/BottomSheet;->height:Lcom/whoop/design/models/modal/BottomSheetHeight;

    :goto_1
    and-int/lit8 p2, p1, 0x10

    const/4 p3, 0x0

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/design/models/modal/BottomSheet;->fixedHeader:Lcom/whoop/design/models/modal/BottomSheetFixedHeader;

    goto :goto_2

    :cond_3
    iput-object p6, p0, Lcom/whoop/design/models/modal/BottomSheet;->fixedHeader:Lcom/whoop/design/models/modal/BottomSheetFixedHeader;

    :goto_2
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/modal/BottomSheet;->fixedFooter:Lcom/whoop/design/models/modal/BottomSheetFixedFooter;

    goto :goto_3

    :cond_4
    iput-object p7, p0, Lcom/whoop/design/models/modal/BottomSheet;->fixedFooter:Lcom/whoop/design/models/modal/BottomSheetFixedFooter;

    :goto_3
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/design/models/modal/BottomSheet;->bindings:Ljava/util/Map;

    goto :goto_4

    :cond_5
    iput-object p8, p0, Lcom/whoop/design/models/modal/BottomSheet;->bindings:Ljava/util/Map;

    :goto_4
    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_6

    iput-object p3, p0, Lcom/whoop/design/models/modal/BottomSheet;->aggregateBindings:Ljava/util/Map;

    return-void

    :cond_6
    iput-object p9, p0, Lcom/whoop/design/models/modal/BottomSheet;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/modal/BottomSheetHeight;Lcom/whoop/design/models/modal/BottomSheetFixedHeader;Lcom/whoop/design/models/modal/BottomSheetFixedFooter;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/NavigationBarModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/design/models/modal/BottomSheetHeight;",
            "Lcom/whoop/design/models/modal/BottomSheetFixedHeader;",
            "Lcom/whoop/design/models/modal/BottomSheetFixedFooter;",
            ")V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "height"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lcom/whoop/design/models/modal/BottomSheet;->id:Ljava/lang/String;

    .line 8
    iput-object p2, p0, Lcom/whoop/design/models/modal/BottomSheet;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    .line 9
    iput-object p3, p0, Lcom/whoop/design/models/modal/BottomSheet;->items:Ljava/util/List;

    .line 10
    iput-object p4, p0, Lcom/whoop/design/models/modal/BottomSheet;->height:Lcom/whoop/design/models/modal/BottomSheetHeight;

    .line 11
    iput-object p5, p0, Lcom/whoop/design/models/modal/BottomSheet;->fixedHeader:Lcom/whoop/design/models/modal/BottomSheetFixedHeader;

    .line 12
    iput-object p6, p0, Lcom/whoop/design/models/modal/BottomSheet;->fixedFooter:Lcom/whoop/design/models/modal/BottomSheetFixedFooter;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/modal/BottomSheetHeight;Lcom/whoop/design/models/modal/BottomSheetFixedHeader;Lcom/whoop/design/models/modal/BottomSheetFixedFooter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    .line 13
    sget-object p3, Lm83/y;->w:Lm83/y;

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p7, 0x8

    if-eqz p3, :cond_1

    .line 14
    sget-object p4, Lcom/whoop/design/models/modal/BottomSheetHeight;->PARTIAL:Lcom/whoop/design/models/modal/BottomSheetHeight;

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p7, 0x10

    const/4 p4, 0x0

    if-eqz p3, :cond_2

    move-object v5, p4

    goto :goto_0

    :cond_2
    move-object v5, p5

    :goto_0
    and-int/lit8 p3, p7, 0x20

    if-eqz p3, :cond_3

    move-object v6, p4

    :goto_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    goto :goto_2

    :cond_3
    move-object v6, p6

    goto :goto_1

    .line 15
    :goto_2
    invoke-direct/range {v0 .. v6}, Lcom/whoop/design/models/modal/BottomSheet;-><init>(Ljava/lang/String;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/modal/BottomSheetHeight;Lcom/whoop/design/models/modal/BottomSheetFixedHeader;Lcom/whoop/design/models/modal/BottomSheetFixedFooter;)V

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

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/modal/BottomSheetHeight;->Companion:Lcom/whoop/design/models/modal/BottomSheetHeight$Companion;

    invoke-virtual {v0}, Lcom/whoop/design/models/modal/BottomSheetHeight$Companion;->serializer()Lwc3/c;

    move-result-object v0

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

    invoke-static {}, Lcom/whoop/design/models/modal/BottomSheet;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/modal/BottomSheet;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/modal/BottomSheet;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/modal/BottomSheet;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/modal/BottomSheet;Ljava/lang/String;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/modal/BottomSheetHeight;Lcom/whoop/design/models/modal/BottomSheetFixedHeader;Lcom/whoop/design/models/modal/BottomSheetFixedFooter;ILjava/lang/Object;)Lcom/whoop/design/models/modal/BottomSheet;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/modal/BottomSheet;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/modal/BottomSheet;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/modal/BottomSheet;->items:Ljava/util/List;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/modal/BottomSheet;->height:Lcom/whoop/design/models/modal/BottomSheetHeight;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/modal/BottomSheet;->fixedHeader:Lcom/whoop/design/models/modal/BottomSheetFixedHeader;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/modal/BottomSheet;->fixedFooter:Lcom/whoop/design/models/modal/BottomSheetFixedFooter;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/design/models/modal/BottomSheet;->copy(Ljava/lang/String;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/modal/BottomSheetHeight;Lcom/whoop/design/models/modal/BottomSheetFixedHeader;Lcom/whoop/design/models/modal/BottomSheetFixedFooter;)Lcom/whoop/design/models/modal/BottomSheet;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/modal/BottomSheet;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/modal/BottomSheet;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/design/models/modal/BottomSheet;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/design/models/items/NavigationBarModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/NavigationBarModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/modal/BottomSheet;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/modal/BottomSheet;->items:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/modal/BottomSheet;->items:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/modal/BottomSheet;->height:Lcom/whoop/design/models/modal/BottomSheetHeight;

    sget-object v3, Lcom/whoop/design/models/modal/BottomSheetHeight;->PARTIAL:Lcom/whoop/design/models/modal/BottomSheetHeight;

    if-eq v2, v3, :cond_3

    :goto_1
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/modal/BottomSheet;->height:Lcom/whoop/design/models/modal/BottomSheetHeight;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/modal/BottomSheet;->fixedHeader:Lcom/whoop/design/models/modal/BottomSheetFixedHeader;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lcom/whoop/design/models/modal/BottomSheetFixedHeader$$serializer;->INSTANCE:Lcom/whoop/design/models/modal/BottomSheetFixedHeader$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/modal/BottomSheet;->fixedHeader:Lcom/whoop/design/models/modal/BottomSheetFixedHeader;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/modal/BottomSheet;->fixedFooter:Lcom/whoop/design/models/modal/BottomSheetFixedFooter;

    if-eqz v2, :cond_7

    :goto_3
    sget-object v2, Lcom/whoop/design/models/modal/BottomSheetFixedFooter$$serializer;->INSTANCE:Lcom/whoop/design/models/modal/BottomSheetFixedFooter$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/modal/BottomSheet;->fixedFooter:Lcom/whoop/design/models/modal/BottomSheetFixedFooter;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {p0}, Lcom/whoop/design/models/modal/BottomSheet;->getBindings()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_9

    :goto_4
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/design/models/modal/BottomSheet;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    invoke-virtual {p0}, Lcom/whoop/design/models/modal/BottomSheet;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_b

    :goto_5
    sget-object v1, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p0}, Lcom/whoop/design/models/modal/BottomSheet;->getAggregateBindings()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/whoop/design/models/modal/BottomSheet;->bind(Ljava/util/Map;)Lcom/whoop/design/models/modal/BottomSheet;

    move-result-object p1

    return-object p1
.end method

.method public bind(Ljava/util/Map;)Lcom/whoop/design/models/modal/BottomSheet;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/design/models/modal/BottomSheet;"
        }
    .end annotation

    const-string v0, "accumulatedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/whoop/design/models/modal/BottomSheet;->getBindings()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/modal/BottomSheet;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    invoke-static {p0, v0, v1, p1}, Lcom/whoop/design/models/modal/BottomSheetStateBindingKt;->generatedBind(Lcom/whoop/design/models/modal/BottomSheet;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/modal/BottomSheet;

    move-result-object p1

    return-object p1
.end method

.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/modal/BottomSheet;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/items/NavigationBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/modal/BottomSheet;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/modal/BottomSheet;->items:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/modal/BottomSheetHeight;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/modal/BottomSheet;->height:Lcom/whoop/design/models/modal/BottomSheetHeight;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/modal/BottomSheetFixedHeader;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/modal/BottomSheet;->fixedHeader:Lcom/whoop/design/models/modal/BottomSheetFixedHeader;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/modal/BottomSheetFixedFooter;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/modal/BottomSheet;->fixedFooter:Lcom/whoop/design/models/modal/BottomSheetFixedFooter;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/modal/BottomSheetHeight;Lcom/whoop/design/models/modal/BottomSheetFixedHeader;Lcom/whoop/design/models/modal/BottomSheetFixedFooter;)Lcom/whoop/design/models/modal/BottomSheet;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/NavigationBarModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/design/models/modal/BottomSheetHeight;",
            "Lcom/whoop/design/models/modal/BottomSheetFixedHeader;",
            "Lcom/whoop/design/models/modal/BottomSheetFixedFooter;",
            ")",
            "Lcom/whoop/design/models/modal/BottomSheet;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "height"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/modal/BottomSheet;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/design/models/modal/BottomSheet;-><init>(Ljava/lang/String;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/modal/BottomSheetHeight;Lcom/whoop/design/models/modal/BottomSheetFixedHeader;Lcom/whoop/design/models/modal/BottomSheetFixedFooter;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/modal/BottomSheet;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/modal/BottomSheet;

    iget-object v1, p0, Lcom/whoop/design/models/modal/BottomSheet;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/modal/BottomSheet;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/modal/BottomSheet;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    iget-object v3, p1, Lcom/whoop/design/models/modal/BottomSheet;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/modal/BottomSheet;->items:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/modal/BottomSheet;->items:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/modal/BottomSheet;->height:Lcom/whoop/design/models/modal/BottomSheetHeight;

    iget-object v3, p1, Lcom/whoop/design/models/modal/BottomSheet;->height:Lcom/whoop/design/models/modal/BottomSheetHeight;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/modal/BottomSheet;->fixedHeader:Lcom/whoop/design/models/modal/BottomSheetFixedHeader;

    iget-object v3, p1, Lcom/whoop/design/models/modal/BottomSheet;->fixedHeader:Lcom/whoop/design/models/modal/BottomSheetFixedHeader;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/modal/BottomSheet;->fixedFooter:Lcom/whoop/design/models/modal/BottomSheetFixedFooter;

    iget-object p1, p1, Lcom/whoop/design/models/modal/BottomSheet;->fixedFooter:Lcom/whoop/design/models/modal/BottomSheetFixedFooter;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
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

    iget-object v0, p0, Lcom/whoop/design/models/modal/BottomSheet;->aggregateBindings:Ljava/util/Map;

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

    iget-object v0, p0, Lcom/whoop/design/models/modal/BottomSheet;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getFixedFooter()Lcom/whoop/design/models/modal/BottomSheetFixedFooter;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/modal/BottomSheet;->fixedFooter:Lcom/whoop/design/models/modal/BottomSheetFixedFooter;

    return-object v0
.end method

.method public final getFixedHeader()Lcom/whoop/design/models/modal/BottomSheetFixedHeader;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/modal/BottomSheet;->fixedHeader:Lcom/whoop/design/models/modal/BottomSheetFixedHeader;

    return-object v0
.end method

.method public final getHeight()Lcom/whoop/design/models/modal/BottomSheetHeight;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/modal/BottomSheet;->height:Lcom/whoop/design/models/modal/BottomSheetHeight;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/modal/BottomSheet;->id:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/whoop/design/models/modal/BottomSheet;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getNavigationBar()Lcom/whoop/design/models/items/NavigationBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/modal/BottomSheet;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/modal/BottomSheet;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/modal/BottomSheet;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/design/models/items/NavigationBarModel;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/modal/BottomSheet;->items:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/modal/BottomSheet;->height:Lcom/whoop/design/models/modal/BottomSheetHeight;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/modal/BottomSheet;->fixedHeader:Lcom/whoop/design/models/modal/BottomSheetFixedHeader;

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/design/models/modal/BottomSheetFixedHeader;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/modal/BottomSheet;->fixedFooter:Lcom/whoop/design/models/modal/BottomSheetFixedFooter;

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lcom/whoop/design/models/modal/BottomSheetFixedFooter;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v2, v3

    return v2
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

    iput-object p1, p0, Lcom/whoop/design/models/modal/BottomSheet;->aggregateBindings:Ljava/util/Map;

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

    iput-object p1, p0, Lcom/whoop/design/models/modal/BottomSheet;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/design/models/modal/BottomSheet;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/modal/BottomSheet;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    iget-object v2, p0, Lcom/whoop/design/models/modal/BottomSheet;->items:Ljava/util/List;

    iget-object v3, p0, Lcom/whoop/design/models/modal/BottomSheet;->height:Lcom/whoop/design/models/modal/BottomSheetHeight;

    iget-object v4, p0, Lcom/whoop/design/models/modal/BottomSheet;->fixedHeader:Lcom/whoop/design/models/modal/BottomSheetFixedHeader;

    iget-object v5, p0, Lcom/whoop/design/models/modal/BottomSheet;->fixedFooter:Lcom/whoop/design/models/modal/BottomSheetFixedFooter;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "BottomSheet(id="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", navigationBar="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", items="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", height="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", fixedHeader="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", fixedFooter="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
