.class public final Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/heightpicker/HeightPickerModel$$serializer;,
        Lcom/whoop/design/models/items/heightpicker/HeightPickerModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\u0008\u0087\u0008\u0018\u0000 L2\u00020\u0001:\u0002MLB{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013B\u0099\u0001\u0008\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0012\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u0019J\u0010\u0010#\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001bJ\u0010\u0010$\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001bJ\u0010\u0010%\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001bJ\u0010\u0010&\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u0019J\u0010\u0010\'\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\u0019J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\u0019J\u00a0\u0001\u0010)\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00042\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\n\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00042\u0008\u0008\u0002\u0010\r\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00022\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010\u0019J\u0010\u0010,\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010\u001bJ\u001a\u00100\u001a\u00020/2\u0008\u0010.\u001a\u0004\u0018\u00010-H\u00d6\u0003\u00a2\u0006\u0004\u00080\u00101J\'\u0010:\u001a\u0002072\u0006\u00102\u001a\u00020\u00002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0001\u00a2\u0006\u0004\u00088\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010;\u001a\u0004\u0008<\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010=\u001a\u0004\u0008>\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010=\u001a\u0004\u0008?\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010=\u001a\u0004\u0008@\u0010\u001bR\u0017\u0010\u0008\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010=\u001a\u0004\u0008A\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010B\u001a\u0004\u0008C\u0010 R\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010;\u001a\u0004\u0008D\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010;\u001a\u0004\u0008E\u0010\u0019R\u0017\u0010\u000c\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010=\u001a\u0004\u0008F\u0010\u001bR\u0017\u0010\r\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010=\u001a\u0004\u0008G\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010=\u001a\u0004\u0008H\u0010\u001bR\u0017\u0010\u000f\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010;\u001a\u0004\u0008I\u0010\u0019R\u0017\u0010\u0010\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010;\u001a\u0004\u0008J\u0010\u0019R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010;\u001a\u0004\u0008K\u0010\u0019\u00a8\u0006N"
    }
    d2 = {
        "Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "label",
        "",
        "feetMin",
        "feetMax",
        "defaultFeet",
        "defaultInches",
        "defaultIn",
        "feetLabel",
        "inchesLabel",
        "cmMin",
        "cmMax",
        "defaultCm",
        "cmLabel",
        "unitType",
        "stateUpdateValueKey",
        "<init>",
        "(Ljava/lang/String;IIIILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;IIIILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()I",
        "component3",
        "component4",
        "component5",
        "component6",
        "()Ljava/lang/Integer;",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "copy",
        "(Ljava/lang/String;IIIILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;",
        "toString",
        "hashCode",
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
        "(Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getLabel",
        "I",
        "getFeetMin",
        "getFeetMax",
        "getDefaultFeet",
        "getDefaultInches",
        "Ljava/lang/Integer;",
        "getDefaultIn",
        "getFeetLabel",
        "getInchesLabel",
        "getCmMin",
        "getCmMax",
        "getDefaultCm",
        "getCmLabel",
        "getUnitType",
        "getStateUpdateValueKey",
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/design/models/items/heightpicker/HeightPickerModel$Companion;


# instance fields
.field private final cmLabel:Ljava/lang/String;

.field private final cmMax:I

.field private final cmMin:I

.field private final defaultCm:I

.field private final defaultFeet:I

.field private final defaultIn:Ljava/lang/Integer;

.field private final defaultInches:I

.field private final feetLabel:Ljava/lang/String;

.field private final feetMax:I

.field private final feetMin:I

.field private final inchesLabel:Ljava/lang/String;

.field private final label:Ljava/lang/String;

.field private final stateUpdateValueKey:Ljava/lang/String;

.field private final unitType:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->Companion:Lcom/whoop/design/models/items/heightpicker/HeightPickerModel$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;IIIILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit16 v0, p1, 0x3fff

    const/16 v1, 0x3fff

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/heightpicker/HeightPickerModel$$serializer;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->label:Ljava/lang/String;

    iput p3, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->feetMin:I

    iput p4, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->feetMax:I

    iput p5, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultFeet:I

    iput p6, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultInches:I

    iput-object p7, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultIn:Ljava/lang/Integer;

    iput-object p8, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->feetLabel:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->inchesLabel:Ljava/lang/String;

    iput p10, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->cmMin:I

    iput p11, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->cmMax:I

    iput p12, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultCm:I

    iput-object p13, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->cmLabel:Ljava/lang/String;

    move-object/from16 p1, p14

    iput-object p1, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->unitType:Ljava/lang/String;

    move-object/from16 p1, p15

    iput-object p1, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->stateUpdateValueKey:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIIILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "feetLabel"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inchesLabel"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cmLabel"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unitType"

    invoke-static {p13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->label:Ljava/lang/String;

    .line 4
    iput p2, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->feetMin:I

    .line 5
    iput p3, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->feetMax:I

    .line 6
    iput p4, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultFeet:I

    .line 7
    iput p5, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultInches:I

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultIn:Ljava/lang/Integer;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->feetLabel:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->inchesLabel:Ljava/lang/String;

    .line 11
    iput p9, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->cmMin:I

    .line 12
    iput p10, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->cmMax:I

    .line 13
    iput p11, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultCm:I

    .line 14
    iput-object p12, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->cmLabel:Ljava/lang/String;

    .line 15
    iput-object p13, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->unitType:Ljava/lang/String;

    .line 16
    iput-object p14, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->stateUpdateValueKey:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;Ljava/lang/String;IIIILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;
    .locals 14

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->label:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    iget v2, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->feetMin:I

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    iget v3, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->feetMax:I

    goto :goto_2

    :cond_2
    move/from16 v3, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    iget v4, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultFeet:I

    goto :goto_3

    :cond_3
    move/from16 v4, p4

    :goto_3
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_4

    iget v5, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultInches:I

    goto :goto_4

    :cond_4
    move/from16 v5, p5

    :goto_4
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    iget-object v6, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultIn:Ljava/lang/Integer;

    goto :goto_5

    :cond_5
    move-object/from16 v6, p6

    :goto_5
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_6

    iget-object v7, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->feetLabel:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v7, p7

    :goto_6
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_7

    iget-object v8, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->inchesLabel:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v8, p8

    :goto_7
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_8

    iget v9, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->cmMin:I

    goto :goto_8

    :cond_8
    move/from16 v9, p9

    :goto_8
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    iget v10, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->cmMax:I

    goto :goto_9

    :cond_9
    move/from16 v10, p10

    :goto_9
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_a

    iget v11, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultCm:I

    goto :goto_a

    :cond_a
    move/from16 v11, p11

    :goto_a
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_b

    iget-object v12, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->cmLabel:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v12, p12

    :goto_b
    and-int/lit16 v13, v0, 0x1000

    if-eqz v13, :cond_c

    iget-object v13, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->unitType:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v13, p13

    :goto_c
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->stateUpdateValueKey:Ljava/lang/String;

    move-object/from16 p15, v0

    :goto_d
    move-object p1, p0

    move-object/from16 p2, v1

    move/from16 p3, v2

    move/from16 p4, v3

    move/from16 p5, v4

    move/from16 p6, v5

    move-object/from16 p7, v6

    move-object/from16 p8, v7

    move-object/from16 p9, v8

    move/from16 p10, v9

    move/from16 p11, v10

    move/from16 p12, v11

    move-object/from16 p13, v12

    move-object/from16 p14, v13

    goto :goto_e

    :cond_d
    move-object/from16 p15, p14

    goto :goto_d

    :goto_e
    invoke-virtual/range {p1 .. p15}, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->copy(Ljava/lang/String;IIIILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->label:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget v1, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->feetMin:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x2

    iget v1, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->feetMax:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x3

    iget v1, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultFeet:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x4

    iget v1, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultInches:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    sget-object v0, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v1, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultIn:Ljava/lang/Integer;

    const/4 v2, 0x5

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x6

    iget-object v1, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->feetLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x7

    iget-object v1, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->inchesLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v0, 0x8

    iget v1, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->cmMin:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/16 v0, 0x9

    iget v1, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->cmMax:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/16 v0, 0xa

    iget v1, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultCm:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/16 v0, 0xb

    iget-object v1, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->cmLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v0, 0xc

    iget-object v1, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->unitType:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->stateUpdateValueKey:Ljava/lang/String;

    const/16 v1, 0xd

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->cmMax:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultCm:I

    return v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->cmLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->unitType:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->stateUpdateValueKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->feetMin:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->feetMax:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultFeet:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultInches:I

    return v0
.end method

.method public final component6()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultIn:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->feetLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->inchesLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->cmMin:I

    return v0
.end method

.method public final copy(Ljava/lang/String;IIIILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;
    .locals 16

    const-string v0, "label"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "feetLabel"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inchesLabel"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cmLabel"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unitType"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move-object/from16 v15, p14

    invoke-direct/range {v1 .. v15}, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;-><init>(Ljava/lang/String;IIIILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->label:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->label:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->feetMin:I

    iget v3, p1, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->feetMin:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->feetMax:I

    iget v3, p1, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->feetMax:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultFeet:I

    iget v3, p1, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultFeet:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultInches:I

    iget v3, p1, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultInches:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultIn:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultIn:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->feetLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->feetLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->inchesLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->inchesLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->cmMin:I

    iget v3, p1, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->cmMin:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->cmMax:I

    iget v3, p1, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->cmMax:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultCm:I

    iget v3, p1, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultCm:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->cmLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->cmLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->unitType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->unitType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->stateUpdateValueKey:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->stateUpdateValueKey:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    return v2

    :cond_f
    return v0
.end method

.method public final getCmLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->cmLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getCmMax()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->cmMax:I

    return v0
.end method

.method public final getCmMin()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->cmMin:I

    return v0
.end method

.method public final getDefaultCm()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultCm:I

    return v0
.end method

.method public final getDefaultFeet()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultFeet:I

    return v0
.end method

.method public final getDefaultIn()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultIn:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getDefaultInches()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultInches:I

    return v0
.end method

.method public final getFeetLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->feetLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getFeetMax()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->feetMax:I

    return v0
.end method

.method public final getFeetMin()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->feetMin:I

    return v0
.end method

.method public final getInchesLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->inchesLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getStateUpdateValueKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->stateUpdateValueKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getUnitType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->unitType:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->label:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->feetMin:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->feetMax:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultFeet:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultInches:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultIn:Ljava/lang/Integer;

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

    iget-object v2, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->feetLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->inchesLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->cmMin:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->cmMax:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultCm:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->cmLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->unitType:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->stateUpdateValueKey:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->label:Ljava/lang/String;

    iget v2, v0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->feetMin:I

    iget v3, v0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->feetMax:I

    iget v4, v0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultFeet:I

    iget v5, v0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultInches:I

    iget-object v6, v0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultIn:Ljava/lang/Integer;

    iget-object v7, v0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->feetLabel:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->inchesLabel:Ljava/lang/String;

    iget v9, v0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->cmMin:I

    iget v10, v0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->cmMax:I

    iget v11, v0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->defaultCm:I

    iget-object v12, v0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->cmLabel:Ljava/lang/String;

    iget-object v13, v0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->unitType:Ljava/lang/String;

    iget-object v14, v0, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->stateUpdateValueKey:Ljava/lang/String;

    const-string v15, ", feetMin="

    const-string v0, ", feetMax="

    move-object/from16 v16, v13

    const-string v13, "HeightPickerModel(label="

    invoke-static {v2, v13, v1, v15, v0}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", defaultFeet="

    const-string v2, ", defaultInches="

    invoke-static {v0, v3, v1, v4, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", defaultIn="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", feetLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", inchesLabel="

    const-string v2, ", cmMin="

    invoke-static {v0, v7, v1, v8, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", cmMax="

    const-string v2, ", defaultCm="

    invoke-static {v0, v9, v1, v10, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", cmLabel="

    const-string v2, ", unitType="

    invoke-static {v11, v1, v12, v2, v0}, Ldc/b;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", stateUpdateValueKey="

    const-string v2, ")"

    move-object/from16 v3, v16

    invoke-static {v0, v3, v1, v14, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
