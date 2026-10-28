.class public final Lcom/whoop/design/models/items/TriLabelSliderModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;
.implements Lcom/whoop/design/models/WithGeneratedBindings;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/TriLabelSliderModel$$serializer;,
        Lcom/whoop/design/models/items/TriLabelSliderModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u0000 S2\u00020\u00012\u00020\u0002:\u0002TSBW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010B\u0099\u0001\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u000c\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0012\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0018J#\u0010\u001b\u001a\u00020\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00190\u0012H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010#J\u0010\u0010%\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010#J\u0010\u0010&\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u001eJ\u0010\u0010\'\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010#Jn\u0010*\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010#J\u0010\u0010-\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010(J\u001a\u00100\u001a\u00020/2\u0008\u0010.\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003\u00a2\u0006\u0004\u00080\u00101J\'\u0010:\u001a\u0002072\u0006\u00102\u001a\u00020\u00002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0001\u00a2\u0006\u0004\u00088\u00109R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010;\u001a\u0004\u0008<\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010=\u001a\u0004\u0008>\u0010 R\u0017\u0010\u0006\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010;\u001a\u0004\u0008?\u0010\u001eR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010@\u001a\u0004\u0008A\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010@\u001a\u0004\u0008B\u0010#R\u0017\u0010\n\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010@\u001a\u0004\u0008C\u0010#R\u0017\u0010\u000b\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010;\u001a\u0004\u0008D\u0010\u001eR\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010E\u001a\u0004\u0008F\u0010(R\u0017\u0010\u000e\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010@\u001a\u0004\u0008G\u0010#R0\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00128\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010H\u001a\u0004\u0008I\u0010J\"\u0004\u0008K\u0010LRE\u0010\u0015\u001a%\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012j\u0004\u0018\u0001`M\u00a2\u0006\u000c\u0008N\u0012\u0008\u0008O\u0012\u0004\u0008\t0P8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010H\u001a\u0004\u0008Q\u0010J\"\u0004\u0008R\u0010L\u00a8\u0006U"
    }
    d2 = {
        "Lcom/whoop/design/models/items/TriLabelSliderModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "",
        "lowerBound",
        "centerBound",
        "upperBound",
        "",
        "startLabel",
        "centerLabel",
        "endLabel",
        "sliderValue",
        "",
        "barThickness",
        "barStyle",
        "<init>",
        "(FLjava/lang/Float;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;FILjava/lang/String;)V",
        "seen0",
        "",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "aggregateBindings",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IFLjava/lang/Float;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;FILjava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/design/models/items/TriLabelSliderModel;",
        "component1",
        "()F",
        "component2",
        "()Ljava/lang/Float;",
        "component3",
        "component4",
        "()Ljava/lang/String;",
        "component5",
        "component6",
        "component7",
        "component8",
        "()I",
        "component9",
        "copy",
        "(FLjava/lang/Float;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;FILjava/lang/String;)Lcom/whoop/design/models/items/TriLabelSliderModel;",
        "toString",
        "hashCode",
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
        "(Lcom/whoop/design/models/items/TriLabelSliderModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "F",
        "getLowerBound",
        "Ljava/lang/Float;",
        "getCenterBound",
        "getUpperBound",
        "Ljava/lang/String;",
        "getStartLabel",
        "getCenterLabel",
        "getEndLabel",
        "getSliderValue",
        "I",
        "getBarThickness",
        "getBarStyle",
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

.field public static final Companion:Lcom/whoop/design/models/items/TriLabelSliderModel$Companion;


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

.field private final barStyle:Ljava/lang/String;

.field private final barThickness:I

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

.field private final centerBound:Ljava/lang/Float;

.field private final centerLabel:Ljava/lang/String;

.field private final endLabel:Ljava/lang/String;

.field private final lowerBound:F

.field private final sliderValue:F

.field private final startLabel:Ljava/lang/String;

.field private final upperBound:F


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/design/models/items/TriLabelSliderModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/TriLabelSliderModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/TriLabelSliderModel;->Companion:Lcom/whoop/design/models/items/TriLabelSliderModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/TriLabelSliderModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/k;

    const/16 v4, 0x1c

    invoke-direct {v3, v4}, Lw91/k;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v3, 0xb

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v1, v3, v4

    const/4 v4, 0x3

    aput-object v1, v3, v4

    const/4 v4, 0x4

    aput-object v1, v3, v4

    const/4 v4, 0x5

    aput-object v1, v3, v4

    const/4 v4, 0x6

    aput-object v1, v3, v4

    const/4 v4, 0x7

    aput-object v1, v3, v4

    aput-object v1, v3, v0

    const/16 v0, 0x9

    aput-object v2, v3, v0

    const/16 v0, 0xa

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/design/models/items/TriLabelSliderModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>(FLjava/lang/Float;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;FILjava/lang/String;)V
    .locals 1

    const-string v0, "startLabel"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endLabel"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "barStyle"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->lowerBound:F

    .line 3
    iput-object p2, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->centerBound:Ljava/lang/Float;

    .line 4
    iput p3, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->upperBound:F

    .line 5
    iput-object p4, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->startLabel:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->centerLabel:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->endLabel:Ljava/lang/String;

    .line 8
    iput p7, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->sliderValue:F

    .line 9
    iput p8, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->barThickness:I

    .line 10
    iput-object p9, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->barStyle:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(FLjava/lang/Float;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;FILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    move/from16 v0, p10

    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_0

    const/16 v1, 0x8

    move v10, v1

    goto :goto_0

    :cond_0
    move/from16 v10, p8

    :goto_0
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_1

    .line 14
    const-string v0, "STRAIN_GRADIENT"

    move-object v11, v0

    :goto_1
    move-object v2, p0

    move v3, p1

    move-object v4, p2

    move v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move/from16 v9, p7

    goto :goto_2

    :cond_1
    move-object/from16 v11, p9

    goto :goto_1

    .line 15
    :goto_2
    invoke-direct/range {v2 .. v11}, Lcom/whoop/design/models/items/TriLabelSliderModel;-><init>(FLjava/lang/Float;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;FILjava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(IFLjava/lang/Float;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;FILjava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p13, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p13, :cond_0

    .line 11
    sget-object p13, Lcom/whoop/design/models/items/TriLabelSliderModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TriLabelSliderModel$$serializer;

    invoke-virtual {p13}, Lcom/whoop/design/models/items/TriLabelSliderModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p13

    invoke-static {p1, v0, p13}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->lowerBound:F

    iput-object p3, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->centerBound:Ljava/lang/Float;

    iput p4, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->upperBound:F

    iput-object p5, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->startLabel:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->centerLabel:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->endLabel:Ljava/lang/String;

    iput p8, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->sliderValue:F

    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_1

    const/16 p2, 0x8

    iput p2, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->barThickness:I

    goto :goto_0

    :cond_1
    iput p9, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->barThickness:I

    :goto_0
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_2

    .line 12
    const-string p2, "STRAIN_GRADIENT"

    .line 13
    iput-object p2, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->barStyle:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p10, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->barStyle:Ljava/lang/String;

    :goto_1
    and-int/lit16 p2, p1, 0x200

    const/4 p3, 0x0

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->bindings:Ljava/util/Map;

    goto :goto_2

    :cond_3
    iput-object p11, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->bindings:Ljava/util/Map;

    :goto_2
    and-int/lit16 p1, p1, 0x400

    if-nez p1, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->aggregateBindings:Ljava/util/Map;

    return-void

    :cond_4
    iput-object p12, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->aggregateBindings:Ljava/util/Map;

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

    invoke-static {}, Lcom/whoop/design/models/items/TriLabelSliderModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/TriLabelSliderModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/TriLabelSliderModel;FLjava/lang/Float;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;FILjava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/models/items/TriLabelSliderModel;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget p1, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->lowerBound:F

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->centerBound:Ljava/lang/Float;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget p3, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->upperBound:F

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->startLabel:Ljava/lang/String;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->centerLabel:Ljava/lang/String;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->endLabel:Ljava/lang/String;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget p7, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->sliderValue:F

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget p8, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->barThickness:I

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->barStyle:Ljava/lang/String;

    :cond_8
    move p10, p8

    move-object p11, p9

    move-object p8, p6

    move p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/design/models/items/TriLabelSliderModel;->copy(FLjava/lang/Float;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;FILjava/lang/String;)Lcom/whoop/design/models/items/TriLabelSliderModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/TriLabelSliderModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/TriLabelSliderModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget v2, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->lowerBound:F

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    sget-object v1, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->centerBound:Ljava/lang/Float;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget v2, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->upperBound:F

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->startLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->centerLabel:Ljava/lang/String;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->endLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x6

    iget v2, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->sliderValue:F

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    const/16 v3, 0x8

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget v2, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->barThickness:I

    if-eq v2, v3, :cond_1

    :goto_0
    iget v2, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->barThickness:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    :cond_1
    invoke-interface {p1, p2, v3}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->barStyle:Ljava/lang/String;

    const-string v2, "STRAIN_GRADIENT"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :goto_1
    iget-object v1, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->barStyle:Ljava/lang/String;

    invoke-interface {p1, p2, v3, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_3
    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lcom/whoop/design/models/items/TriLabelSliderModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_5

    :goto_2
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TriLabelSliderModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/16 v0, 0xa

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Lcom/whoop/design/models/items/TriLabelSliderModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TriLabelSliderModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/whoop/design/models/items/TriLabelSliderModel;->bind(Ljava/util/Map;)Lcom/whoop/design/models/items/TriLabelSliderModel;

    move-result-object p1

    return-object p1
.end method

.method public bind(Ljava/util/Map;)Lcom/whoop/design/models/items/TriLabelSliderModel;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/design/models/items/TriLabelSliderModel;"
        }
    .end annotation

    const-string v0, "accumulatedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/TriLabelSliderModel;->getBindings()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TriLabelSliderModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    invoke-static {p0, v0, v1, p1}, Lcom/whoop/design/models/items/TriLabelSliderModelStateBindingKt;->generatedBind(Lcom/whoop/design/models/items/TriLabelSliderModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/TriLabelSliderModel;

    move-result-object p1

    return-object p1
.end method

.method public final component1()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->lowerBound:F

    return v0
.end method

.method public final component2()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->centerBound:Ljava/lang/Float;

    return-object v0
.end method

.method public final component3()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->upperBound:F

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->startLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->centerLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->endLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->sliderValue:F

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->barThickness:I

    return v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->barStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(FLjava/lang/Float;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;FILjava/lang/String;)Lcom/whoop/design/models/items/TriLabelSliderModel;
    .locals 11

    const-string v0, "startLabel"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endLabel"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "barStyle"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/TriLabelSliderModel;

    move v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move/from16 v8, p7

    move/from16 v9, p8

    invoke-direct/range {v1 .. v10}, Lcom/whoop/design/models/items/TriLabelSliderModel;-><init>(FLjava/lang/Float;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;FILjava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/TriLabelSliderModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/TriLabelSliderModel;

    iget v1, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->lowerBound:F

    iget v3, p1, Lcom/whoop/design/models/items/TriLabelSliderModel;->lowerBound:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->centerBound:Ljava/lang/Float;

    iget-object v3, p1, Lcom/whoop/design/models/items/TriLabelSliderModel;->centerBound:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->upperBound:F

    iget v3, p1, Lcom/whoop/design/models/items/TriLabelSliderModel;->upperBound:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->startLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/TriLabelSliderModel;->startLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->centerLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/TriLabelSliderModel;->centerLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->endLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/TriLabelSliderModel;->endLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->sliderValue:F

    iget v3, p1, Lcom/whoop/design/models/items/TriLabelSliderModel;->sliderValue:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->barThickness:I

    iget v3, p1, Lcom/whoop/design/models/items/TriLabelSliderModel;->barThickness:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->barStyle:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/design/models/items/TriLabelSliderModel;->barStyle:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
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

    iget-object v0, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getBarStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->barStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final getBarThickness()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->barThickness:I

    return v0
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

    iget-object v0, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getCenterBound()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->centerBound:Ljava/lang/Float;

    return-object v0
.end method

.method public final getCenterLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->centerLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getEndLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->endLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getLowerBound()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->lowerBound:F

    return v0
.end method

.method public final getSliderValue()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->sliderValue:F

    return v0
.end method

.method public final getStartLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->startLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpperBound()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->upperBound:F

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->lowerBound:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->centerBound:Ljava/lang/Float;

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

    iget v2, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->upperBound:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->startLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->centerLabel:Ljava/lang/String;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->endLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->sliderValue:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->barThickness:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->barStyle:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
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

    iput-object p1, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->aggregateBindings:Ljava/util/Map;

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

    iput-object p1, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget v0, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->lowerBound:F

    iget-object v1, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->centerBound:Ljava/lang/Float;

    iget v2, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->upperBound:F

    iget-object v3, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->startLabel:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->centerLabel:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->endLabel:Ljava/lang/String;

    iget v6, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->sliderValue:F

    iget v7, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->barThickness:I

    iget-object v8, p0, Lcom/whoop/design/models/items/TriLabelSliderModel;->barStyle:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "TriLabelSliderModel(lowerBound="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", centerBound="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", upperBound="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", startLabel="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", centerLabel="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", endLabel="

    const-string v1, ", sliderValue="

    invoke-static {v9, v4, v0, v5, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", barThickness="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", barStyle="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v8, v0, v9}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
