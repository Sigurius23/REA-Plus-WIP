.class public final Lcom/whoop/design/models/items/TrackedBehaviorModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/SearchFilterableModel;
.implements Lcom/whoop/design/models/WithGeneratedBindings;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/TrackedBehaviorModel$$serializer;,
        Lcom/whoop/design/models/items/TrackedBehaviorModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0002\u0008\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\u0008\u0087\u0008\u0018\u0000 \\2\u00020\u00012\u00020\u0002:\u0002]\\B\u009e\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r\u0012\u000e\u0008\u0002\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0016\u0008\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011\u0012+\u0008\u0002\u0010\u0018\u001a%\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0004\u0018\u0001`\u0014\u00a2\u0006\u000c\u0008\u0015\u0012\u0008\u0008\u0016\u0012\u0004\u0008\t0\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aB\u0091\u0001\u0008\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011\u0012\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\u0004\u0008\u0019\u0010\u001fJ\u0019\u0010!\u001a\u0004\u0018\u00010\u00002\u0006\u0010 \u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008!\u0010\"J#\u0010%\u001a\u00020\u00002\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020#0\u0011H\u0016\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008/\u00100J\u0010\u00101\u001a\u00020\rH\u00c6\u0003\u00a2\u0006\u0004\u00081\u00102J\u0016\u00103\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000fH\u00c6\u0003\u00a2\u0006\u0004\u00083\u00104J\u001e\u00105\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0004\u00085\u00106J3\u00107\u001a%\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0004\u0018\u0001`\u0014\u00a2\u0006\u000c\u0008\u0015\u0012\u0008\u0008\u0016\u0012\u0004\u0008\t0\u0017H\u00c6\u0003\u00a2\u0006\u0004\u00087\u00106J\u00a9\u0001\u00108\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u000e\u0008\u0002\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000f2\u0016\u0008\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00112+\u0008\u0002\u0010\u0018\u001a%\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0004\u0018\u0001`\u0014\u00a2\u0006\u000c\u0008\u0015\u0012\u0008\u0008\u0016\u0012\u0004\u0008\t0\u0017H\u00c6\u0001\u00a2\u0006\u0004\u00088\u00109J\u0010\u0010:\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008:\u0010.J\u0010\u0010;\u001a\u00020\u001bH\u00d6\u0001\u00a2\u0006\u0004\u0008;\u0010<J\u001a\u0010>\u001a\u00020\r2\u0008\u0010=\u001a\u0004\u0018\u00010#H\u00d6\u0003\u00a2\u0006\u0004\u0008>\u0010?J\'\u0010H\u001a\u00020E2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020CH\u0001\u00a2\u0006\u0004\u0008F\u0010GR\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010I\u001a\u0004\u0008J\u0010(R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010K\u001a\u0004\u0008L\u0010*R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010M\u001a\u0004\u0008N\u0010,R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010O\u001a\u0004\u0008P\u0010.R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010Q\u001a\u0004\u0008R\u00100R\u0017\u0010\u000e\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010S\u001a\u0004\u0008\u000e\u00102R\u001d\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010T\u001a\u0004\u0008U\u00104R0\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00118\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010V\u001a\u0004\u0008W\u00106\"\u0004\u0008X\u0010YRE\u0010\u0018\u001a%\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0004\u0018\u0001`\u0014\u00a2\u0006\u000c\u0008\u0015\u0012\u0008\u0008\u0016\u0012\u0004\u0008\t0\u00178\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010V\u001a\u0004\u0008Z\u00106\"\u0004\u0008[\u0010Y\u00a8\u0006^"
    }
    d2 = {
        "Lcom/whoop/design/models/items/TrackedBehaviorModel;",
        "Lcom/whoop/design/models/SearchFilterableModel;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "Lcom/whoop/design/models/items/BehaviorTrackerModel;",
        "behaviorTracker",
        "Lcom/whoop/design/models/items/TrackerInputModel;",
        "trackerInput",
        "Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;",
        "metadata",
        "",
        "stateKey",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "deselectAction",
        "",
        "isSuggested",
        "",
        "searchKeys",
        "",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "Lcom/whoop/design/models/binding/AggregateBindings;",
        "Lwc3/i;",
        "with",
        "Lj93/d;",
        "aggregateBindings",
        "<init>",
        "(Lcom/whoop/design/models/items/BehaviorTrackerModel;Lcom/whoop/design/models/items/TrackerInputModel;Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;ZLjava/util/List;Ljava/util/Map;Ljava/util/Map;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/models/items/BehaviorTrackerModel;Lcom/whoop/design/models/items/TrackerInputModel;Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;ZLjava/util/List;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "query",
        "filteredForSearch",
        "(Ljava/lang/String;)Lcom/whoop/design/models/items/TrackedBehaviorModel;",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/design/models/items/TrackedBehaviorModel;",
        "component1",
        "()Lcom/whoop/design/models/items/BehaviorTrackerModel;",
        "component2",
        "()Lcom/whoop/design/models/items/TrackerInputModel;",
        "component3",
        "()Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;",
        "component4",
        "()Ljava/lang/String;",
        "component5",
        "()Lcom/whoop/whoopaction/domain/models/Action;",
        "component6",
        "()Z",
        "component7",
        "()Ljava/util/List;",
        "component8",
        "()Ljava/util/Map;",
        "component9",
        "copy",
        "(Lcom/whoop/design/models/items/BehaviorTrackerModel;Lcom/whoop/design/models/items/TrackerInputModel;Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;ZLjava/util/List;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/TrackedBehaviorModel;",
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
        "(Lcom/whoop/design/models/items/TrackedBehaviorModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/design/models/items/BehaviorTrackerModel;",
        "getBehaviorTracker",
        "Lcom/whoop/design/models/items/TrackerInputModel;",
        "getTrackerInput",
        "Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;",
        "getMetadata",
        "Ljava/lang/String;",
        "getStateKey",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "getDeselectAction",
        "Z",
        "Ljava/util/List;",
        "getSearchKeys",
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

.field public static final Companion:Lcom/whoop/design/models/items/TrackedBehaviorModel$Companion;


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

.field private final behaviorTracker:Lcom/whoop/design/models/items/BehaviorTrackerModel;

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

.field private final deselectAction:Lcom/whoop/whoopaction/domain/models/Action;

.field private final isSuggested:Z

.field private final metadata:Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;

.field private final searchKeys:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final stateKey:Ljava/lang/String;

.field private final trackerInput:Lcom/whoop/design/models/items/TrackerInputModel;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/design/models/items/TrackedBehaviorModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/TrackedBehaviorModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->Companion:Lcom/whoop/design/models/items/TrackedBehaviorModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/k;

    const/16 v4, 0x16

    invoke-direct {v3, v4}, Lw91/k;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lw91/k;

    const/16 v5, 0x17

    invoke-direct {v4, v5}, Lw91/k;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v5, Lw91/k;

    const/16 v6, 0x18

    invoke-direct {v5, v6}, Lw91/k;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v5, 0x9

    new-array v5, v5, [Ll83/h;

    const/4 v6, 0x0

    aput-object v1, v5, v6

    const/4 v6, 0x1

    aput-object v1, v5, v6

    const/4 v6, 0x2

    aput-object v1, v5, v6

    const/4 v6, 0x3

    aput-object v1, v5, v6

    const/4 v6, 0x4

    aput-object v3, v5, v6

    const/4 v3, 0x5

    aput-object v1, v5, v3

    const/4 v3, 0x6

    aput-object v4, v5, v3

    const/4 v3, 0x7

    aput-object v2, v5, v3

    aput-object v1, v5, v0

    sput-object v5, Lcom/whoop/design/models/items/TrackedBehaviorModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/models/items/BehaviorTrackerModel;Lcom/whoop/design/models/items/TrackerInputModel;Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;ZLjava/util/List;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/design/models/items/TrackedBehaviorModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TrackedBehaviorModel$$serializer;

    invoke-virtual {p11}, Lcom/whoop/design/models/items/TrackedBehaviorModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->behaviorTracker:Lcom/whoop/design/models/items/BehaviorTrackerModel;

    and-int/lit8 p2, p1, 0x2

    const/4 p11, 0x0

    if-nez p2, :cond_1

    iput-object p11, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->trackerInput:Lcom/whoop/design/models/items/TrackerInputModel;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->trackerInput:Lcom/whoop/design/models/items/TrackerInputModel;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object p11, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->metadata:Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->metadata:Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object p11, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->stateKey:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->stateKey:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object p11, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->deselectAction:Lcom/whoop/whoopaction/domain/models/Action;

    goto :goto_3

    :cond_4
    iput-object p6, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->deselectAction:Lcom/whoop/whoopaction/domain/models/Action;

    :goto_3
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->isSuggested:Z

    goto :goto_4

    :cond_5
    iput-boolean p7, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->isSuggested:Z

    :goto_4
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    .line 2
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 3
    iput-object p2, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->searchKeys:Ljava/util/List;

    goto :goto_5

    :cond_6
    iput-object p8, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->searchKeys:Ljava/util/List;

    :goto_5
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    iput-object p11, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->bindings:Ljava/util/Map;

    goto :goto_6

    :cond_7
    iput-object p9, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->bindings:Ljava/util/Map;

    :goto_6
    and-int/lit16 p1, p1, 0x100

    if-nez p1, :cond_8

    iput-object p11, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->aggregateBindings:Ljava/util/Map;

    return-void

    :cond_8
    iput-object p10, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/models/items/BehaviorTrackerModel;Lcom/whoop/design/models/items/TrackerInputModel;Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;ZLjava/util/List;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/BehaviorTrackerModel;",
            "Lcom/whoop/design/models/items/TrackerInputModel;",
            "Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;",
            "Ljava/lang/String;",
            "Lcom/whoop/whoopaction/domain/models/Action;",
            "Z",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
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

    const-string v0, "behaviorTracker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "searchKeys"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->behaviorTracker:Lcom/whoop/design/models/items/BehaviorTrackerModel;

    .line 6
    iput-object p2, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->trackerInput:Lcom/whoop/design/models/items/TrackerInputModel;

    .line 7
    iput-object p3, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->metadata:Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;

    .line 8
    iput-object p4, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->stateKey:Ljava/lang/String;

    .line 9
    iput-object p5, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->deselectAction:Lcom/whoop/whoopaction/domain/models/Action;

    .line 10
    iput-boolean p6, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->isSuggested:Z

    .line 11
    iput-object p7, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->searchKeys:Ljava/util/List;

    .line 12
    iput-object p8, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->bindings:Ljava/util/Map;

    .line 13
    iput-object p9, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/models/items/BehaviorTrackerModel;Lcom/whoop/design/models/items/TrackerInputModel;Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;ZLjava/util/List;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p10, 0x2

    const/4 v0, 0x0

    if-eqz p11, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_2

    move-object p4, v0

    :cond_2
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_3

    move-object p5, v0

    :cond_3
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_4

    const/4 p6, 0x0

    :cond_4
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_5

    .line 14
    sget-object p7, Lm83/y;->w:Lm83/y;

    :cond_5
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_6

    move-object p8, v0

    :cond_6
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_7

    move-object p10, v0

    :goto_0
    move-object p9, p8

    move-object p8, p7

    move p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_7
    move-object p10, p9

    goto :goto_0

    .line 15
    :goto_1
    invoke-direct/range {p1 .. p10}, Lcom/whoop/design/models/items/TrackedBehaviorModel;-><init>(Lcom/whoop/design/models/items/BehaviorTrackerModel;Lcom/whoop/design/models/items/TrackerInputModel;Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;ZLjava/util/List;Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 6

    new-instance v0, Lwc3/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/whoopaction/domain/models/Action;

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

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

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

    invoke-static {}, Lcom/whoop/design/models/items/TrackedBehaviorModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/TrackedBehaviorModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/TrackedBehaviorModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/TrackedBehaviorModel;Lcom/whoop/design/models/items/BehaviorTrackerModel;Lcom/whoop/design/models/items/TrackerInputModel;Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;ZLjava/util/List;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/items/TrackedBehaviorModel;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->behaviorTracker:Lcom/whoop/design/models/items/BehaviorTrackerModel;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->trackerInput:Lcom/whoop/design/models/items/TrackerInputModel;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->metadata:Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->stateKey:Ljava/lang/String;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->deselectAction:Lcom/whoop/whoopaction/domain/models/Action;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-boolean p6, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->isSuggested:Z

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->searchKeys:Ljava/util/List;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->bindings:Ljava/util/Map;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->aggregateBindings:Ljava/util/Map;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/design/models/items/TrackedBehaviorModel;->copy(Lcom/whoop/design/models/items/BehaviorTrackerModel;Lcom/whoop/design/models/items/TrackerInputModel;Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;ZLjava/util/List;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/TrackedBehaviorModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/TrackedBehaviorModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/design/models/items/BehaviorTrackerModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/BehaviorTrackerModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->behaviorTracker:Lcom/whoop/design/models/items/BehaviorTrackerModel;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->trackerInput:Lcom/whoop/design/models/items/TrackerInputModel;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lcom/whoop/design/models/items/TrackerInputModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TrackerInputModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->trackerInput:Lcom/whoop/design/models/items/TrackerInputModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->metadata:Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->metadata:Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->stateKey:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->stateKey:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->deselectAction:Lcom/whoop/whoopaction/domain/models/Action;

    if-eqz v2, :cond_7

    :goto_3
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->deselectAction:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-boolean v2, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->isSuggested:Z

    if-eqz v2, :cond_9

    :goto_4
    iget-boolean v2, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->isSuggested:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_9
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->searchKeys:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    :goto_5
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->searchKeys:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    invoke-virtual {p0}, Lcom/whoop/design/models/items/TrackedBehaviorModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_d

    :goto_6
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TrackedBehaviorModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    invoke-virtual {p0}, Lcom/whoop/design/models/items/TrackedBehaviorModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_f

    :goto_7
    sget-object v1, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TrackedBehaviorModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/whoop/design/models/items/TrackedBehaviorModel;->bind(Ljava/util/Map;)Lcom/whoop/design/models/items/TrackedBehaviorModel;

    move-result-object p1

    return-object p1
.end method

.method public bind(Ljava/util/Map;)Lcom/whoop/design/models/items/TrackedBehaviorModel;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/design/models/items/TrackedBehaviorModel;"
        }
    .end annotation

    const-string v0, "accumulatedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/TrackedBehaviorModel;->getBindings()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TrackedBehaviorModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    invoke-static {p0, v0, v1, p1}, Lcom/whoop/design/models/items/TrackedBehaviorModelStateBindingKt;->generatedBind(Lcom/whoop/design/models/items/TrackedBehaviorModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/TrackedBehaviorModel;

    move-result-object p1

    return-object p1
.end method

.method public final component1()Lcom/whoop/design/models/items/BehaviorTrackerModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->behaviorTracker:Lcom/whoop/design/models/items/BehaviorTrackerModel;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/items/TrackerInputModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->trackerInput:Lcom/whoop/design/models/items/TrackerInputModel;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->metadata:Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->stateKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->deselectAction:Lcom/whoop/whoopaction/domain/models/Action;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->isSuggested:Z

    return v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->searchKeys:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final component9()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/models/items/BehaviorTrackerModel;Lcom/whoop/design/models/items/TrackerInputModel;Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;ZLjava/util/List;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/TrackedBehaviorModel;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/BehaviorTrackerModel;",
            "Lcom/whoop/design/models/items/TrackerInputModel;",
            "Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;",
            "Ljava/lang/String;",
            "Lcom/whoop/whoopaction/domain/models/Action;",
            "Z",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)",
            "Lcom/whoop/design/models/items/TrackedBehaviorModel;"
        }
    .end annotation

    const-string v0, "behaviorTracker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "searchKeys"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/TrackedBehaviorModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/whoop/design/models/items/TrackedBehaviorModel;-><init>(Lcom/whoop/design/models/items/BehaviorTrackerModel;Lcom/whoop/design/models/items/TrackerInputModel;Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;ZLjava/util/List;Ljava/util/Map;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/TrackedBehaviorModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/TrackedBehaviorModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->behaviorTracker:Lcom/whoop/design/models/items/BehaviorTrackerModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/TrackedBehaviorModel;->behaviorTracker:Lcom/whoop/design/models/items/BehaviorTrackerModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->trackerInput:Lcom/whoop/design/models/items/TrackerInputModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/TrackedBehaviorModel;->trackerInput:Lcom/whoop/design/models/items/TrackerInputModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->metadata:Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/TrackedBehaviorModel;->metadata:Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->stateKey:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/TrackedBehaviorModel;->stateKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->deselectAction:Lcom/whoop/whoopaction/domain/models/Action;

    iget-object v3, p1, Lcom/whoop/design/models/items/TrackedBehaviorModel;->deselectAction:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->isSuggested:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/TrackedBehaviorModel;->isSuggested:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->searchKeys:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/TrackedBehaviorModel;->searchKeys:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->bindings:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/design/models/items/TrackedBehaviorModel;->bindings:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->aggregateBindings:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/design/models/items/TrackedBehaviorModel;->aggregateBindings:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public bridge synthetic filteredForSearch(Ljava/lang/String;)Lcom/whoop/design/models/SearchFilterableModel;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/whoop/design/models/items/TrackedBehaviorModel;->filteredForSearch(Ljava/lang/String;)Lcom/whoop/design/models/items/TrackedBehaviorModel;

    move-result-object p1

    return-object p1
.end method

.method public filteredForSearch(Ljava/lang/String;)Lcom/whoop/design/models/items/TrackedBehaviorModel;
    .locals 2

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->searchKeys:Ljava/util/List;

    if-nez v0, :cond_0

    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_0
    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->behaviorTracker:Lcom/whoop/design/models/items/BehaviorTrackerModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/BehaviorTrackerModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->L(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    :cond_1
    check-cast v0, Ljava/util/List;

    .line 3
    sget-object v1, Lcom/whoop/design/models/SearchFilterableModel;->Companion:Lcom/whoop/design/models/SearchFilterableModel$Companion;

    invoke-virtual {v1, p1, v0}, Lcom/whoop/design/models/SearchFilterableModel$Companion;->matchesQuery(Ljava/lang/String;Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_2

    return-object p0

    :cond_2
    const/4 p1, 0x0

    return-object p1
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

    iget-object v0, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getBehaviorTracker()Lcom/whoop/design/models/items/BehaviorTrackerModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->behaviorTracker:Lcom/whoop/design/models/items/BehaviorTrackerModel;

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

    iget-object v0, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getDeselectAction()Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->deselectAction:Lcom/whoop/whoopaction/domain/models/Action;

    return-object v0
.end method

.method public final getMetadata()Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->metadata:Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;

    return-object v0
.end method

.method public final getSearchKeys()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->searchKeys:Ljava/util/List;

    return-object v0
.end method

.method public final getStateKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->stateKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrackerInput()Lcom/whoop/design/models/items/TrackerInputModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->trackerInput:Lcom/whoop/design/models/items/TrackerInputModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->behaviorTracker:Lcom/whoop/design/models/items/BehaviorTrackerModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/BehaviorTrackerModel;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->trackerInput:Lcom/whoop/design/models/items/TrackerInputModel;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/design/models/items/TrackerInputModel;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->metadata:Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->stateKey:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->deselectAction:Lcom/whoop/whoopaction/domain/models/Action;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->isSuggested:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->searchKeys:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->bindings:Ljava/util/Map;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->aggregateBindings:Ljava/util/Map;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    return v0
.end method

.method public final isSuggested()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->isSuggested:Z

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

    iput-object p1, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->aggregateBindings:Ljava/util/Map;

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

    iput-object p1, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->behaviorTracker:Lcom/whoop/design/models/items/BehaviorTrackerModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->trackerInput:Lcom/whoop/design/models/items/TrackerInputModel;

    iget-object v2, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->metadata:Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;

    iget-object v3, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->stateKey:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->deselectAction:Lcom/whoop/whoopaction/domain/models/Action;

    iget-boolean v5, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->isSuggested:Z

    iget-object v6, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->searchKeys:Ljava/util/List;

    iget-object v7, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->bindings:Ljava/util/Map;

    iget-object v8, p0, Lcom/whoop/design/models/items/TrackedBehaviorModel;->aggregateBindings:Ljava/util/Map;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "TrackedBehaviorModel(behaviorTracker="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", trackerInput="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", metadata="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", stateKey="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", deselectAction="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isSuggested="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", searchKeys="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bindings="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", aggregateBindings="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v9, v8, v0}, Lev/n;->l(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
