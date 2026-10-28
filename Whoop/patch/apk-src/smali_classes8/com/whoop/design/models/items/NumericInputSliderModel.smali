.class public final Lcom/whoop/design/models/items/NumericInputSliderModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;
.implements Lcom/whoop/design/models/WithGeneratedBindings;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/NumericInputSliderModel$$serializer;,
        Lcom/whoop/design/models/items/NumericInputSliderModel$Companion;,
        Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;,
        Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabelFormat;,
        Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0018\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0087\u0008\u0018\u0000 \\2\u00020\u00012\u00020\u0002:\u0005]^_`\\BY\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013B\u0097\u0001\u0008\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0015\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0004\u0008\u0012\u0010\u001cJ#\u0010\u001f\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d0\u0015H\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\"J\u0010\u0010$\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010%J\u0010\u0010\'\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010\"J\u0012\u0010*\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/Jp\u00100\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001\u00a2\u0006\u0004\u00080\u00101J\u0010\u00102\u001a\u00020\u0016H\u00d6\u0001\u00a2\u0006\u0004\u00082\u00103J\u0010\u00104\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u00084\u0010%J\u001a\u00107\u001a\u0002062\u0008\u00105\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003\u00a2\u0006\u0004\u00087\u00108J\'\u0010A\u001a\u00020>2\u0006\u00109\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0001\u00a2\u0006\u0004\u0008?\u0010@R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010B\u001a\u0004\u0008C\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010B\u001a\u0004\u0008D\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010E\u001a\u0004\u0008F\u0010%R\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010E\u001a\u0004\u0008G\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010H\u001a\u0004\u0008I\u0010(R\u0017\u0010\u000b\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010B\u001a\u0004\u0008J\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010K\u001a\u0004\u0008L\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010M\u001a\u0004\u0008N\u0010-R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010O\u001a\u0004\u0008P\u0010/R0\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010Q\u001a\u0004\u0008R\u0010S\"\u0004\u0008T\u0010URE\u0010\u0019\u001a%\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0015j\u0004\u0018\u0001`V\u00a2\u0006\u000c\u0008W\u0012\u0008\u0008X\u0012\u0004\u0008\t0Y8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010Q\u001a\u0004\u0008Z\u0010S\"\u0004\u0008[\u0010U\u00a8\u0006a"
    }
    d2 = {
        "Lcom/whoop/design/models/items/NumericInputSliderModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "",
        "upperBound",
        "lowerBound",
        "",
        "stepSize",
        "barThickness",
        "Ly81/f;",
        "barColor",
        "sliderValue",
        "Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;",
        "startLabel",
        "Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;",
        "endLabel",
        "Lcom/whoop/design/models/items/MultiWheelPickerModel;",
        "picker",
        "<init>",
        "(FFIILy81/f;FLcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;Lcom/whoop/design/models/items/MultiWheelPickerModel;)V",
        "seen0",
        "",
        "",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "aggregateBindings",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IFFIILy81/f;FLcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;Lcom/whoop/design/models/items/MultiWheelPickerModel;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/design/models/items/NumericInputSliderModel;",
        "component1",
        "()F",
        "component2",
        "component3",
        "()I",
        "component4",
        "component5",
        "()Ly81/f;",
        "component6",
        "component7",
        "()Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;",
        "component8",
        "()Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;",
        "component9",
        "()Lcom/whoop/design/models/items/MultiWheelPickerModel;",
        "copy",
        "(FFIILy81/f;FLcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;Lcom/whoop/design/models/items/MultiWheelPickerModel;)Lcom/whoop/design/models/items/NumericInputSliderModel;",
        "toString",
        "()Ljava/lang/String;",
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
        "(Lcom/whoop/design/models/items/NumericInputSliderModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "F",
        "getUpperBound",
        "getLowerBound",
        "I",
        "getStepSize",
        "getBarThickness",
        "Ly81/f;",
        "getBarColor",
        "getSliderValue",
        "Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;",
        "getStartLabel",
        "Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;",
        "getEndLabel",
        "Lcom/whoop/design/models/items/MultiWheelPickerModel;",
        "getPicker",
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
        "StartLabel",
        "EndLabel",
        "EndLabelFormat",
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

.field public static final Companion:Lcom/whoop/design/models/items/NumericInputSliderModel$Companion;


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

.field private final barColor:Ly81/f;

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

.field private final endLabel:Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;

.field private final lowerBound:F

.field private final picker:Lcom/whoop/design/models/items/MultiWheelPickerModel;

.field private final sliderValue:F

.field private final startLabel:Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;

.field private final stepSize:I

.field private final upperBound:F


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/design/models/items/NumericInputSliderModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/NumericInputSliderModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/NumericInputSliderModel;->Companion:Lcom/whoop/design/models/items/NumericInputSliderModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/NumericInputSliderModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/h;

    const/16 v4, 0xa

    invoke-direct {v3, v4}, Lw91/h;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lw91/h;

    const/16 v6, 0xb

    invoke-direct {v5, v6}, Lw91/h;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v5, v6, [Ll83/h;

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

    aput-object v1, v5, v3

    const/4 v3, 0x7

    aput-object v1, v5, v3

    aput-object v1, v5, v0

    const/16 v0, 0x9

    aput-object v2, v5, v0

    aput-object v1, v5, v4

    sput-object v5, Lcom/whoop/design/models/items/NumericInputSliderModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>(FFIILy81/f;FLcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;Lcom/whoop/design/models/items/MultiWheelPickerModel;)V
    .locals 1

    const-string v0, "barColor"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->upperBound:F

    .line 3
    iput p2, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->lowerBound:F

    .line 4
    iput p3, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->stepSize:I

    .line 5
    iput p4, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->barThickness:I

    .line 6
    iput-object p5, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->barColor:Ly81/f;

    .line 7
    iput p6, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->sliderValue:F

    .line 8
    iput-object p7, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->startLabel:Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;

    .line 9
    iput-object p8, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->endLabel:Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;

    .line 10
    iput-object p9, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->picker:Lcom/whoop/design/models/items/MultiWheelPickerModel;

    return-void
.end method

.method public synthetic constructor <init>(FFIILy81/f;FLcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;Lcom/whoop/design/models/items/MultiWheelPickerModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    and-int/lit8 v0, p10, 0x8

    if-eqz v0, :cond_0

    const/4 p4, 0x4

    :cond_0
    move v4, p4

    and-int/lit8 p4, p10, 0x10

    if-eqz p4, :cond_1

    .line 14
    sget-object p4, Ly81/f;->SUFFICIENT_TREND:Ly81/f;

    move-object v5, p4

    :goto_0
    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    goto :goto_1

    :cond_1
    move-object v5, p5

    goto :goto_0

    .line 15
    :goto_1
    invoke-direct/range {v0 .. v9}, Lcom/whoop/design/models/items/NumericInputSliderModel;-><init>(FFIILy81/f;FLcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;Lcom/whoop/design/models/items/MultiWheelPickerModel;)V

    return-void
.end method

.method public synthetic constructor <init>(IFFIILy81/f;FLcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;Lcom/whoop/design/models/items/MultiWheelPickerModel;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p13, p1, 0x1e7

    const/16 v0, 0x1e7

    if-eq v0, p13, :cond_0

    .line 11
    sget-object p13, Lcom/whoop/design/models/items/NumericInputSliderModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModel$$serializer;

    invoke-virtual {p13}, Lcom/whoop/design/models/items/NumericInputSliderModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p13

    invoke-static {p1, v0, p13}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->upperBound:F

    iput p3, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->lowerBound:F

    iput p4, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->stepSize:I

    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_1

    const/4 p2, 0x4

    iput p2, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->barThickness:I

    goto :goto_0

    :cond_1
    iput p5, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->barThickness:I

    :goto_0
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_2

    .line 12
    sget-object p2, Ly81/f;->SUFFICIENT_TREND:Ly81/f;

    .line 13
    iput-object p2, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->barColor:Ly81/f;

    goto :goto_1

    :cond_2
    iput-object p6, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->barColor:Ly81/f;

    :goto_1
    iput p7, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->sliderValue:F

    iput-object p8, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->startLabel:Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;

    iput-object p9, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->endLabel:Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;

    iput-object p10, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->picker:Lcom/whoop/design/models/items/MultiWheelPickerModel;

    and-int/lit16 p2, p1, 0x200

    const/4 p3, 0x0

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->bindings:Ljava/util/Map;

    goto :goto_2

    :cond_3
    iput-object p11, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->bindings:Ljava/util/Map;

    :goto_2
    and-int/lit16 p1, p1, 0x400

    if-nez p1, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->aggregateBindings:Ljava/util/Map;

    return-void

    :cond_4
    iput-object p12, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.theme.color.WhoopColorKey"

    invoke-static {}, Ly81/f;->values()[Ly81/f;

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

    invoke-static {}, Lcom/whoop/design/models/items/NumericInputSliderModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/NumericInputSliderModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/NumericInputSliderModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/NumericInputSliderModel;FFIILy81/f;FLcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;Lcom/whoop/design/models/items/MultiWheelPickerModel;ILjava/lang/Object;)Lcom/whoop/design/models/items/NumericInputSliderModel;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget p1, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->upperBound:F

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget p2, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->lowerBound:F

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget p3, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->stepSize:I

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget p4, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->barThickness:I

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->barColor:Ly81/f;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget p6, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->sliderValue:F

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->startLabel:Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->endLabel:Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->picker:Lcom/whoop/design/models/items/MultiWheelPickerModel;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move p8, p6

    move-object p9, p7

    move p6, p4

    move-object p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/design/models/items/NumericInputSliderModel;->copy(FFIILy81/f;FLcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;Lcom/whoop/design/models/items/MultiWheelPickerModel;)Lcom/whoop/design/models/items/NumericInputSliderModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/NumericInputSliderModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/NumericInputSliderModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget v2, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->upperBound:F

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    const/4 v1, 0x1

    iget v2, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->lowerBound:F

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    const/4 v1, 0x2

    iget v2, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->stepSize:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    const/4 v3, 0x4

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget v2, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->barThickness:I

    if-eq v2, v3, :cond_1

    :goto_0
    iget v2, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->barThickness:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    :cond_1
    invoke-interface {p1, p2, v3}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->barColor:Ly81/f;

    sget-object v2, Ly81/f;->SUFFICIENT_TREND:Ly81/f;

    if-eq v1, v2, :cond_3

    :goto_1
    aget-object v1, v0, v3

    invoke-interface {v1}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->barColor:Ly81/f;

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x5

    iget v2, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->sliderValue:F

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    sget-object v1, Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->startLabel:Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;

    const/4 v3, 0x6

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->endLabel:Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;

    const/4 v3, 0x7

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/MultiWheelPickerModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/MultiWheelPickerModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->picker:Lcom/whoop/design/models/items/MultiWheelPickerModel;

    const/16 v3, 0x8

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_5

    :goto_2
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/16 v0, 0xa

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/whoop/design/models/items/NumericInputSliderModel;->bind(Ljava/util/Map;)Lcom/whoop/design/models/items/NumericInputSliderModel;

    move-result-object p1

    return-object p1
.end method

.method public bind(Ljava/util/Map;)Lcom/whoop/design/models/items/NumericInputSliderModel;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/design/models/items/NumericInputSliderModel;"
        }
    .end annotation

    const-string v0, "accumulatedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->getBindings()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    invoke-static {p0, v0, v1, p1}, Lcom/whoop/design/models/items/NumericInputSliderModelStateBindingKt;->generatedBind(Lcom/whoop/design/models/items/NumericInputSliderModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/NumericInputSliderModel;

    move-result-object p1

    return-object p1
.end method

.method public final component1()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->upperBound:F

    return v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->lowerBound:F

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->stepSize:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->barThickness:I

    return v0
.end method

.method public final component5()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->barColor:Ly81/f;

    return-object v0
.end method

.method public final component6()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->sliderValue:F

    return v0
.end method

.method public final component7()Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->startLabel:Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->endLabel:Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;

    return-object v0
.end method

.method public final component9()Lcom/whoop/design/models/items/MultiWheelPickerModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->picker:Lcom/whoop/design/models/items/MultiWheelPickerModel;

    return-object v0
.end method

.method public final copy(FFIILy81/f;FLcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;Lcom/whoop/design/models/items/MultiWheelPickerModel;)Lcom/whoop/design/models/items/NumericInputSliderModel;
    .locals 11

    const-string v0, "barColor"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/NumericInputSliderModel;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/whoop/design/models/items/NumericInputSliderModel;-><init>(FFIILy81/f;FLcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;Lcom/whoop/design/models/items/MultiWheelPickerModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/NumericInputSliderModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/NumericInputSliderModel;

    iget v1, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->upperBound:F

    iget v3, p1, Lcom/whoop/design/models/items/NumericInputSliderModel;->upperBound:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->lowerBound:F

    iget v3, p1, Lcom/whoop/design/models/items/NumericInputSliderModel;->lowerBound:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->stepSize:I

    iget v3, p1, Lcom/whoop/design/models/items/NumericInputSliderModel;->stepSize:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->barThickness:I

    iget v3, p1, Lcom/whoop/design/models/items/NumericInputSliderModel;->barThickness:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->barColor:Ly81/f;

    iget-object v3, p1, Lcom/whoop/design/models/items/NumericInputSliderModel;->barColor:Ly81/f;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->sliderValue:F

    iget v3, p1, Lcom/whoop/design/models/items/NumericInputSliderModel;->sliderValue:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->startLabel:Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;

    iget-object v3, p1, Lcom/whoop/design/models/items/NumericInputSliderModel;->startLabel:Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->endLabel:Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;

    iget-object v3, p1, Lcom/whoop/design/models/items/NumericInputSliderModel;->endLabel:Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->picker:Lcom/whoop/design/models/items/MultiWheelPickerModel;

    iget-object p1, p1, Lcom/whoop/design/models/items/NumericInputSliderModel;->picker:Lcom/whoop/design/models/items/MultiWheelPickerModel;

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

    iget-object v0, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getBarColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->barColor:Ly81/f;

    return-object v0
.end method

.method public final getBarThickness()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->barThickness:I

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

    iget-object v0, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getEndLabel()Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->endLabel:Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;

    return-object v0
.end method

.method public final getLowerBound()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->lowerBound:F

    return v0
.end method

.method public final getPicker()Lcom/whoop/design/models/items/MultiWheelPickerModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->picker:Lcom/whoop/design/models/items/MultiWheelPickerModel;

    return-object v0
.end method

.method public final getSliderValue()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->sliderValue:F

    return v0
.end method

.method public final getStartLabel()Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->startLabel:Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;

    return-object v0
.end method

.method public final getStepSize()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->stepSize:I

    return v0
.end method

.method public final getUpperBound()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->upperBound:F

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->upperBound:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->lowerBound:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->stepSize:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->barThickness:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->barColor:Ly81/f;

    invoke-static {v2, v0, v1}, Ljh3/c;->c(Ly81/f;II)I

    move-result v0

    iget v2, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->sliderValue:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->startLabel:Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->endLabel:Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->picker:Lcom/whoop/design/models/items/MultiWheelPickerModel;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/design/models/items/MultiWheelPickerModel;->hashCode()I

    move-result v3

    :goto_2
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

    iput-object p1, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->aggregateBindings:Ljava/util/Map;

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

    iput-object p1, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget v0, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->upperBound:F

    iget v1, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->lowerBound:F

    iget v2, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->stepSize:I

    iget v3, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->barThickness:I

    iget-object v4, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->barColor:Ly81/f;

    iget v5, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->sliderValue:F

    iget-object v6, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->startLabel:Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;

    iget-object v7, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->endLabel:Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;

    iget-object v8, p0, Lcom/whoop/design/models/items/NumericInputSliderModel;->picker:Lcom/whoop/design/models/items/MultiWheelPickerModel;

    const-string v9, ", lowerBound="

    const-string v10, ", stepSize="

    const-string v11, "NumericInputSliderModel(upperBound="

    invoke-static {v11, v0, v9, v1, v10}, Lb9/y;->t(Ljava/lang/String;FLjava/lang/String;FLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", barThickness="

    const-string v9, ", barColor="

    invoke-static {v0, v2, v1, v3, v9}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sliderValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", startLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", endLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", picker="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
