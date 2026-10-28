.class public final Lcom/whoop/access/circumference/models/CircumferenceModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/WithGeneratedBindings;
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/access/circumference/models/CircumferenceModel$$serializer;,
        Lcom/whoop/access/circumference/models/CircumferenceModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0014\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\u0008\u0087\u0008\u0018\u0000 M2\u00020\u00012\u00020\u0002:\u0002NOB\u008a\u0001\u0012\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\u0016\u0008\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u0008\u0018\u00010\r\u0012+\u0008\u0002\u0010\u0014\u001a%\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\t0\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016Bu\u0008\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u0008\u0018\u00010\r\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008\u0015\u0010\u001bJ#\u0010\u001e\u001a\u00020\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u001c0\rH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0016\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010%J\u0016\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010!J\u001e\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u0008\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J3\u0010*\u001a%\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\t0\u0013H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010)J\u0097\u0001\u0010+\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00082\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00032\u0016\u0008\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u0008\u0018\u00010\r2+\u0008\u0002\u0010\u0014\u001a%\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\t0\u0013H\u00c6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010%J\u0010\u0010.\u001a\u00020\u0017H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u001a\u00102\u001a\u0002012\u0008\u00100\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003\u00a2\u0006\u0004\u00082\u00103J\'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001\u00a2\u0006\u0004\u0008:\u0010;R\u001d\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010=\u001a\u0004\u0008>\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010?\u001a\u0004\u0008@\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010A\u001a\u0004\u0008B\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010A\u001a\u0004\u0008C\u0010%R&\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00038\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010=\u0012\u0004\u0008E\u0010F\u001a\u0004\u0008D\u0010!R0\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u0008\u0018\u00010\r8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010G\u001a\u0004\u0008H\u0010)\"\u0004\u0008I\u0010JRE\u0010\u0014\u001a%\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\t0\u00138\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010G\u001a\u0004\u0008K\u0010)\"\u0004\u0008L\u0010J\u00a8\u0006P"
    }
    d2 = {
        "Lcom/whoop/access/circumference/models/CircumferenceModel;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "Lcom/whoop/access/circumference/models/SegmentedControlDisplayModel;",
        "segmentedControlLabels",
        "Lcom/whoop/access/circumference/models/CircumferencePickerModel;",
        "circumferencePicker",
        "",
        "stateUpdateUnitKey",
        "unitType",
        "Lk50/c;",
        "foreignMeasurements",
        "",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "Lcom/whoop/design/models/binding/AggregateBindings;",
        "Lwc3/i;",
        "with",
        "Lj93/d;",
        "aggregateBindings",
        "<init>",
        "(Ljava/util/List;Lcom/whoop/access/circumference/models/CircumferencePickerModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/util/List;Lcom/whoop/access/circumference/models/CircumferencePickerModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/access/circumference/models/CircumferenceModel;",
        "component1",
        "()Ljava/util/List;",
        "component2",
        "()Lcom/whoop/access/circumference/models/CircumferencePickerModel;",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "component5",
        "component6",
        "()Ljava/util/Map;",
        "component7",
        "copy",
        "(Ljava/util/List;Lcom/whoop/access/circumference/models/CircumferencePickerModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/access/circumference/models/CircumferenceModel;",
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
        "write$Self$access_release",
        "(Lcom/whoop/access/circumference/models/CircumferenceModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/util/List;",
        "getSegmentedControlLabels",
        "Lcom/whoop/access/circumference/models/CircumferencePickerModel;",
        "getCircumferencePicker",
        "Ljava/lang/String;",
        "getStateUpdateUnitKey",
        "getUnitType",
        "getForeignMeasurements",
        "getForeignMeasurements$annotations",
        "()V",
        "Ljava/util/Map;",
        "getBindings",
        "setBindings",
        "(Ljava/util/Map;)V",
        "getAggregateBindings",
        "setAggregateBindings",
        "Companion",
        "$serializer",
        "a",
        "access_release"
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

.field public static final Companion:Lcom/whoop/access/circumference/models/CircumferenceModel$a;


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

.field private final circumferencePicker:Lcom/whoop/access/circumference/models/CircumferencePickerModel;

.field private final foreignMeasurements:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk50/c;",
            ">;"
        }
    .end annotation
.end field

.field private final segmentedControlLabels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/access/circumference/models/SegmentedControlDisplayModel;",
            ">;"
        }
    .end annotation
.end field

.field private final stateUpdateUnitKey:Ljava/lang/String;

.field private final unitType:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/access/circumference/models/CircumferenceModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/access/circumference/models/CircumferenceModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/access/circumference/models/CircumferenceModel;->Companion:Lcom/whoop/access/circumference/models/CircumferenceModel$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/access/circumference/models/CircumferenceModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ljx2/b;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Ljx2/b;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v4, Ljx2/b;

    const/4 v5, 0x2

    invoke-direct {v4, v5}, Ljx2/b;-><init>(I)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v4, 0x6

    new-array v4, v4, [Ll83/h;

    const/4 v6, 0x0

    aput-object v2, v4, v6

    aput-object v1, v4, v3

    aput-object v1, v4, v5

    const/4 v2, 0x3

    aput-object v1, v4, v2

    const/4 v2, 0x4

    aput-object v0, v4, v2

    const/4 v0, 0x5

    aput-object v1, v4, v0

    sput-object v4, Lcom/whoop/access/circumference/models/CircumferenceModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Lcom/whoop/access/circumference/models/CircumferencePickerModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x6

    const/4 v0, 0x6

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/access/circumference/models/CircumferenceModel$$serializer;->INSTANCE:Lcom/whoop/access/circumference/models/CircumferenceModel$$serializer;

    invoke-virtual {p8}, Lcom/whoop/access/circumference/models/CircumferenceModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p8, p1, 0x1

    sget-object v0, Lm83/y;->w:Lm83/y;

    if-nez p8, :cond_1

    iput-object v0, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->segmentedControlLabels:Ljava/util/List;

    goto :goto_0

    :cond_1
    iput-object p2, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->segmentedControlLabels:Ljava/util/List;

    :goto_0
    iput-object p3, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->circumferencePicker:Lcom/whoop/access/circumference/models/CircumferencePickerModel;

    iput-object p4, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->stateUpdateUnitKey:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x8

    const/4 p3, 0x0

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->unitType:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p5, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->unitType:Ljava/lang/String;

    :goto_1
    iput-object v0, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->foreignMeasurements:Ljava/util/List;

    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->bindings:Ljava/util/Map;

    goto :goto_2

    :cond_3
    iput-object p6, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->bindings:Ljava/util/Map;

    :goto_2
    and-int/lit8 p1, p1, 0x20

    if-nez p1, :cond_4

    iput-object p3, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->aggregateBindings:Ljava/util/Map;

    return-void

    :cond_4
    iput-object p7, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lcom/whoop/access/circumference/models/CircumferencePickerModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/access/circumference/models/SegmentedControlDisplayModel;",
            ">;",
            "Lcom/whoop/access/circumference/models/CircumferencePickerModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lk50/c;",
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

    const-string v0, "segmentedControlLabels"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "circumferencePicker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "foreignMeasurements"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->segmentedControlLabels:Ljava/util/List;

    .line 4
    iput-object p2, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->circumferencePicker:Lcom/whoop/access/circumference/models/CircumferencePickerModel;

    .line 5
    iput-object p3, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->stateUpdateUnitKey:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->unitType:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->foreignMeasurements:Ljava/util/List;

    .line 8
    iput-object p6, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->bindings:Ljava/util/Map;

    .line 9
    iput-object p7, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lcom/whoop/access/circumference/models/CircumferencePickerModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p9, p8, 0x1

    .line 10
    sget-object v0, Lm83/y;->w:Lm83/y;

    if-eqz p9, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x8

    const/4 v1, 0x0

    if-eqz p9, :cond_1

    move-object p4, v1

    :cond_1
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_2

    move-object p5, v0

    :cond_2
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_3

    move-object p6, v1

    :cond_3
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_4

    move-object p8, v1

    :goto_0
    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_4
    move-object p8, p7

    goto :goto_0

    :goto_1
    invoke-direct/range {p1 .. p8}, Lcom/whoop/access/circumference/models/CircumferenceModel;-><init>(Ljava/util/List;Lcom/whoop/access/circumference/models/CircumferencePickerModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/access/circumference/models/SegmentedControlDisplayModel$$serializer;->INSTANCE:Lcom/whoop/access/circumference/models/SegmentedControlDisplayModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

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

    invoke-static {}, Lcom/whoop/access/circumference/models/CircumferenceModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/access/circumference/models/CircumferenceModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/access/circumference/models/CircumferenceModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/access/circumference/models/CircumferenceModel;Ljava/util/List;Lcom/whoop/access/circumference/models/CircumferencePickerModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/access/circumference/models/CircumferenceModel;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->segmentedControlLabels:Ljava/util/List;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->circumferencePicker:Lcom/whoop/access/circumference/models/CircumferencePickerModel;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->stateUpdateUnitKey:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->unitType:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->foreignMeasurements:Ljava/util/List;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->bindings:Ljava/util/Map;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->aggregateBindings:Ljava/util/Map;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/access/circumference/models/CircumferenceModel;->copy(Ljava/util/List;Lcom/whoop/access/circumference/models/CircumferencePickerModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/access/circumference/models/CircumferenceModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getForeignMeasurements$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$access_release(Lcom/whoop/access/circumference/models/CircumferenceModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/access/circumference/models/CircumferenceModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->segmentedControlLabels:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->segmentedControlLabels:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    sget-object v1, Lcom/whoop/access/circumference/models/CircumferencePickerModel$$serializer;->INSTANCE:Lcom/whoop/access/circumference/models/CircumferencePickerModel$$serializer;

    iget-object v2, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->circumferencePicker:Lcom/whoop/access/circumference/models/CircumferencePickerModel;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->stateUpdateUnitKey:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    iget-object v3, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->unitType:Ljava/lang/String;

    if-eqz v3, :cond_3

    :goto_1
    iget-object v3, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->unitType:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lcom/whoop/access/circumference/models/CircumferenceModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_5

    :goto_2
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/access/circumference/models/CircumferenceModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Lcom/whoop/access/circumference/models/CircumferenceModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p0}, Lcom/whoop/access/circumference/models/CircumferenceModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    return-void
.end method


# virtual methods
.method public bind(Ljava/util/Map;)Lcom/whoop/access/circumference/models/CircumferenceModel;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/access/circumference/models/CircumferenceModel;"
        }
    .end annotation

    const-string v0, "accumulatedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/whoop/access/circumference/models/CircumferenceModel;->getBindings()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/access/circumference/models/CircumferenceModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    invoke-static {p0, v0, v1, p1}, Lk50/b;->a(Lcom/whoop/access/circumference/models/CircumferenceModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/access/circumference/models/CircumferenceModel;

    move-result-object v2

    const-string v0, "null cannot be cast to non-null type com.whoop.access.circumference.models.CircumferenceModel"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->stateUpdateUnitKey:Ljava/lang/String;

    invoke-static {p1, v0}, Lk50/a;->a(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v7

    const/16 v10, 0x6f

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v2 .. v11}, Lcom/whoop/access/circumference/models/CircumferenceModel;->copy$default(Lcom/whoop/access/circumference/models/CircumferenceModel;Ljava/util/List;Lcom/whoop/access/circumference/models/CircumferencePickerModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/access/circumference/models/CircumferenceModel;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/whoop/access/circumference/models/CircumferenceModel;->bind(Ljava/util/Map;)Lcom/whoop/access/circumference/models/CircumferenceModel;

    move-result-object p1

    return-object p1
.end method

.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/access/circumference/models/SegmentedControlDisplayModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->segmentedControlLabels:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Lcom/whoop/access/circumference/models/CircumferencePickerModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->circumferencePicker:Lcom/whoop/access/circumference/models/CircumferencePickerModel;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->stateUpdateUnitKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->unitType:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lk50/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->foreignMeasurements:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final component7()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Lcom/whoop/access/circumference/models/CircumferencePickerModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/access/circumference/models/CircumferenceModel;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/access/circumference/models/SegmentedControlDisplayModel;",
            ">;",
            "Lcom/whoop/access/circumference/models/CircumferencePickerModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lk50/c;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)",
            "Lcom/whoop/access/circumference/models/CircumferenceModel;"
        }
    .end annotation

    const-string v0, "segmentedControlLabels"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "circumferencePicker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "foreignMeasurements"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/access/circumference/models/CircumferenceModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/access/circumference/models/CircumferenceModel;-><init>(Ljava/util/List;Lcom/whoop/access/circumference/models/CircumferencePickerModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/access/circumference/models/CircumferenceModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/access/circumference/models/CircumferenceModel;

    iget-object v1, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->segmentedControlLabels:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/access/circumference/models/CircumferenceModel;->segmentedControlLabels:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->circumferencePicker:Lcom/whoop/access/circumference/models/CircumferencePickerModel;

    iget-object v3, p1, Lcom/whoop/access/circumference/models/CircumferenceModel;->circumferencePicker:Lcom/whoop/access/circumference/models/CircumferencePickerModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->stateUpdateUnitKey:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/access/circumference/models/CircumferenceModel;->stateUpdateUnitKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->unitType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/access/circumference/models/CircumferenceModel;->unitType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->foreignMeasurements:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/access/circumference/models/CircumferenceModel;->foreignMeasurements:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->bindings:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/access/circumference/models/CircumferenceModel;->bindings:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->aggregateBindings:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/access/circumference/models/CircumferenceModel;->aggregateBindings:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
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

    iget-object v0, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->aggregateBindings:Ljava/util/Map;

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

    iget-object v0, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getCircumferencePicker()Lcom/whoop/access/circumference/models/CircumferencePickerModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->circumferencePicker:Lcom/whoop/access/circumference/models/CircumferencePickerModel;

    return-object v0
.end method

.method public final getForeignMeasurements()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lk50/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->foreignMeasurements:Ljava/util/List;

    return-object v0
.end method

.method public final getSegmentedControlLabels()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/access/circumference/models/SegmentedControlDisplayModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->segmentedControlLabels:Ljava/util/List;

    return-object v0
.end method

.method public final getStateUpdateUnitKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->stateUpdateUnitKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getUnitType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->unitType:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->segmentedControlLabels:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->circumferencePicker:Lcom/whoop/access/circumference/models/CircumferencePickerModel;

    invoke-virtual {v2}, Lcom/whoop/access/circumference/models/CircumferencePickerModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->stateUpdateUnitKey:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->unitType:Ljava/lang/String;

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->foreignMeasurements:Ljava/util/List;

    invoke-static {v2, v1, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->bindings:Ljava/util/Map;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->aggregateBindings:Ljava/util/Map;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
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

    iput-object p1, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->aggregateBindings:Ljava/util/Map;

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

    iput-object p1, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->segmentedControlLabels:Ljava/util/List;

    iget-object v1, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->circumferencePicker:Lcom/whoop/access/circumference/models/CircumferencePickerModel;

    iget-object v2, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->stateUpdateUnitKey:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->unitType:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->foreignMeasurements:Ljava/util/List;

    iget-object v5, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->bindings:Ljava/util/Map;

    iget-object v6, p0, Lcom/whoop/access/circumference/models/CircumferenceModel;->aggregateBindings:Ljava/util/Map;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "CircumferenceModel(segmentedControlLabels="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", circumferencePicker="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", stateUpdateUnitKey="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", unitType="

    const-string v1, ", foreignMeasurements="

    invoke-static {v7, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bindings="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", aggregateBindings="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v7, v6, v0}, Lev/n;->l(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
