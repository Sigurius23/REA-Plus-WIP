.class public final Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;
.implements Lcom/whoop/design/models/WithGeneratedBindings;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel$$serializer;,
        Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0016\n\u0002\u0010\u000b\n\u0002\u0008\u0016\u0008\u0087\u0008\u0018\u0000 O2\u00020\u00012\u00020\u0002:\u0002PQBt\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0016\u0008\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u0012+\u0008\u0002\u0010\u0014\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\t0\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016By\u0008\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008\u0015\u0010\u001bJ\'\u0010$\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001\u00a2\u0006\u0004\u0008\"\u0010#J#\u0010\'\u001a\u00020\u00002\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020%0\rH\u0016\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\u0010\u0010/\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008/\u00100J\u0010\u00101\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u00081\u00102J\u001e\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u00083\u00104J3\u00105\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\t0\u0013H\u00c6\u0003\u00a2\u0006\u0004\u00085\u00104J\u0087\u0001\u00106\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0016\u0008\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2+\u0008\u0002\u0010\u0014\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\t0\u0013H\u00c6\u0001\u00a2\u0006\u0004\u00086\u00107J\u0010\u00108\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u00088\u0010*J\u0010\u00109\u001a\u00020\u0017H\u00d6\u0001\u00a2\u0006\u0004\u00089\u0010:J\u001a\u0010=\u001a\u00020<2\u0008\u0010;\u001a\u0004\u0018\u00010%H\u00d6\u0003\u00a2\u0006\u0004\u0008=\u0010>R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010?\u001a\u0004\u0008@\u0010*R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010A\u001a\u0004\u0008B\u0010,R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010C\u001a\u0004\u0008D\u0010.R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010E\u001a\u0004\u0008F\u00100R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010G\u001a\u0004\u0008H\u00102R0\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010I\u001a\u0004\u0008J\u00104\"\u0004\u0008K\u0010LRE\u0010\u0014\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\t0\u00138\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010I\u001a\u0004\u0008M\u00104\"\u0004\u0008N\u0010L\u00a8\u0006R"
    }
    d2 = {
        "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "",
        "id",
        "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;",
        "exerciseSummary",
        "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;",
        "dateSection",
        "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;",
        "valueSection",
        "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;",
        "footer",
        "",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "Lcom/whoop/design/models/binding/AggregateBindings;",
        "Lwc3/i;",
        "with",
        "Lj93/d;",
        "aggregateBindings",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;Ljava/util/Map;Ljava/util/Map;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weightlifting_release",
        "(Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;",
        "component3",
        "()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;",
        "component4",
        "()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;",
        "component5",
        "()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;",
        "component6",
        "()Ljava/util/Map;",
        "component7",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;",
        "getExerciseSummary",
        "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;",
        "getDateSection",
        "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;",
        "getValueSection",
        "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;",
        "getFooter",
        "Ljava/util/Map;",
        "getBindings",
        "setBindings",
        "(Ljava/util/Map;)V",
        "getAggregateBindings",
        "setAggregateBindings",
        "Companion",
        "$serializer",
        "a",
        "weightlifting_release"
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

.field public static final Companion:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel$a;


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

.field private final dateSection:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;

.field private final exerciseSummary:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;

.field private final footer:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;

.field private final id:Ljava/lang/String;

.field private final valueSection:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->Companion:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lxo1/a;

    const/16 v3, 0xe

    invoke-direct {v2, v3}, Lxo1/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x7

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v1, v2, v3

    const/4 v3, 0x4

    aput-object v1, v2, v3

    const/4 v3, 0x5

    aput-object v0, v2, v3

    const/4 v0, 0x6

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel$$serializer;->INSTANCE:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel$$serializer;

    invoke-virtual {p9}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->exerciseSummary:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;

    iput-object p4, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->dateSection:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;

    iput-object p5, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->valueSection:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;

    iput-object p6, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->footer:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;

    and-int/lit8 p2, p1, 0x20

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->bindings:Ljava/util/Map;

    goto :goto_0

    :cond_1
    iput-object p7, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->bindings:Ljava/util/Map;

    :goto_0
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_2

    iput-object p3, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->aggregateBindings:Ljava/util/Map;

    return-void

    :cond_2
    iput-object p8, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;",
            "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;",
            "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;",
            "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;",
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

    const-string v0, "exerciseSummary"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateSection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "valueSection"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "footer"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->exerciseSummary:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;

    .line 5
    iput-object p3, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->dateSection:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;

    .line 6
    iput-object p4, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->valueSection:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;

    .line 7
    iput-object p5, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->footer:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;

    .line 8
    iput-object p6, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->bindings:Ljava/util/Map;

    .line 9
    iput-object p7, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x20

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p6, v0

    :cond_0
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_1

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

    :cond_1
    move-object p8, p7

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {p1 .. p8}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;-><init>(Ljava/lang/String;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1, v1}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;Ljava/lang/String;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->exerciseSummary:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->dateSection:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->valueSection:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->footer:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->bindings:Ljava/util/Map;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->aggregateBindings:Ljava/util/Map;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->copy(Ljava/lang/String;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$weightlifting_release(Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary$$serializer;->INSTANCE:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary$$serializer;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->exerciseSummary:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection$$serializer;->INSTANCE:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection$$serializer;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->dateSection:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection$$serializer;->INSTANCE:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection$$serializer;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->valueSection:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter$$serializer;->INSTANCE:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter$$serializer;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->footer:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_1

    :goto_0
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->bind(Ljava/util/Map;)Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;

    move-result-object p1

    return-object p1
.end method

.method public bind(Ljava/util/Map;)Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;"
        }
    .end annotation

    const-string v0, "accumulatedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->getBindings()Ljava/util/Map;

    move-result-object v0

    .line 3
    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    .line 4
    invoke-static {p0, v0, v1, p1}, Lxv2/a;->a(Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;

    move-result-object p1

    return-object p1
.end method

.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->exerciseSummary:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;

    return-object v0
.end method

.method public final component3()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->dateSection:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;

    return-object v0
.end method

.method public final component4()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->valueSection:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;

    return-object v0
.end method

.method public final component5()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->footer:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;

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

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->bindings:Ljava/util/Map;

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

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;",
            "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;",
            "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;",
            "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)",
            "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exerciseSummary"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateSection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "valueSection"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "footer"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;-><init>(Ljava/lang/String;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;Ljava/util/Map;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->exerciseSummary:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->exerciseSummary:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->dateSection:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->dateSection:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->valueSection:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->valueSection:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->footer:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->footer:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->bindings:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->bindings:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->aggregateBindings:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->aggregateBindings:Ljava/util/Map;

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

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->aggregateBindings:Ljava/util/Map;

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

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getDateSection()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->dateSection:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;

    return-object v0
.end method

.method public final getExerciseSummary()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->exerciseSummary:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;

    return-object v0
.end method

.method public final getFooter()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->footer:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getValueSection()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->valueSection:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->exerciseSummary:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->dateSection:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->valueSection:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->footer:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->bindings:Ljava/util/Map;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->aggregateBindings:Ljava/util/Map;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

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

    iput-object p1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->aggregateBindings:Ljava/util/Map;

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

    iput-object p1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->exerciseSummary:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->dateSection:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;

    iget-object v3, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->valueSection:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;

    iget-object v4, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->footer:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;

    iget-object v5, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->bindings:Ljava/util/Map;

    iget-object v6, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->aggregateBindings:Ljava/util/Map;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "OneRepMaxMeasurementModel(id="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", exerciseSummary="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", dateSection="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", valueSection="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", footer="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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
