.class public final Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/weightpicker/WeightPickerModel$$serializer;,
        Lcom/whoop/design/models/items/weightpicker/WeightPickerModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u0000 A2\u00020\u0001:\u0002BABa\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\u000c\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010B}\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000f\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u0016J\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u0016J\u0080\u0001\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00042\u0008\u0008\u0002\u0010\n\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0002\u0010\r\u001a\u00020\u00022\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u0016J\u0010\u0010%\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010\u0018J\u001a\u0010)\u001a\u00020(2\u0008\u0010\'\u001a\u0004\u0018\u00010&H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\'\u00103\u001a\u0002002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001\u00a2\u0006\u0004\u00081\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00104\u001a\u0004\u00085\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00106\u001a\u0004\u00087\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00106\u001a\u0004\u00088\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00106\u001a\u0004\u00089\u0010\u0018R\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00104\u001a\u0004\u0008:\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00106\u001a\u0004\u0008;\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00106\u001a\u0004\u0008<\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00106\u001a\u0004\u0008=\u0010\u0018R\u0017\u0010\u000c\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00104\u001a\u0004\u0008>\u0010\u0016R\u0017\u0010\r\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u00104\u001a\u0004\u0008?\u0010\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u00104\u001a\u0004\u0008@\u0010\u0016\u00a8\u0006C"
    }
    d2 = {
        "Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "label",
        "",
        "lbsMin",
        "lbsMax",
        "defaultLbs",
        "lbsLabel",
        "kgMin",
        "kgMax",
        "defaultKg",
        "kgLabel",
        "unitType",
        "stateUpdateValueKey",
        "<init>",
        "(Ljava/lang/String;IIILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;IIILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()I",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "copy",
        "(Ljava/lang/String;IIILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;",
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
        "(Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getLabel",
        "I",
        "getLbsMin",
        "getLbsMax",
        "getDefaultLbs",
        "getLbsLabel",
        "getKgMin",
        "getKgMax",
        "getDefaultKg",
        "getKgLabel",
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

.field public static final Companion:Lcom/whoop/design/models/items/weightpicker/WeightPickerModel$Companion;


# instance fields
.field private final defaultKg:I

.field private final defaultLbs:I

.field private final kgLabel:Ljava/lang/String;

.field private final kgMax:I

.field private final kgMin:I

.field private final label:Ljava/lang/String;

.field private final lbsLabel:Ljava/lang/String;

.field private final lbsMax:I

.field private final lbsMin:I

.field private final stateUpdateValueKey:Ljava/lang/String;

.field private final unitType:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->Companion:Lcom/whoop/design/models/items/weightpicker/WeightPickerModel$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;IIILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p13, p1, 0x7ff

    const/16 v0, 0x7ff

    if-eq v0, p13, :cond_0

    .line 1
    sget-object p13, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/weightpicker/WeightPickerModel$$serializer;

    invoke-virtual {p13}, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p13

    invoke-static {p1, v0, p13}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->label:Ljava/lang/String;

    iput p3, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->lbsMin:I

    iput p4, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->lbsMax:I

    iput p5, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->defaultLbs:I

    iput-object p6, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->lbsLabel:Ljava/lang/String;

    iput p7, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->kgMin:I

    iput p8, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->kgMax:I

    iput p9, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->defaultKg:I

    iput-object p10, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->kgLabel:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->unitType:Ljava/lang/String;

    iput-object p12, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->stateUpdateValueKey:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lbsLabel"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kgLabel"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unitType"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->label:Ljava/lang/String;

    .line 4
    iput p2, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->lbsMin:I

    .line 5
    iput p3, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->lbsMax:I

    .line 6
    iput p4, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->defaultLbs:I

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->lbsLabel:Ljava/lang/String;

    .line 8
    iput p6, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->kgMin:I

    .line 9
    iput p7, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->kgMax:I

    .line 10
    iput p8, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->defaultKg:I

    .line 11
    iput-object p9, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->kgLabel:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->unitType:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->stateUpdateValueKey:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;Ljava/lang/String;IIILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->label:Ljava/lang/String;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget p2, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->lbsMin:I

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget p3, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->lbsMax:I

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget p4, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->defaultLbs:I

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->lbsLabel:Ljava/lang/String;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget p6, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->kgMin:I

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget p7, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->kgMax:I

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget p8, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->defaultKg:I

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->kgLabel:Ljava/lang/String;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->unitType:Ljava/lang/String;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->stateUpdateValueKey:Ljava/lang/String;

    :cond_a
    move-object p12, p10

    move-object p13, p11

    move p10, p8

    move-object p11, p9

    move p8, p6

    move p9, p7

    move p6, p4

    move-object p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->copy(Ljava/lang/String;IIILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;Lzc3/c;Lyc3/g;)V
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->label:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget v1, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->lbsMin:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x2

    iget v1, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->lbsMax:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x3

    iget v1, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->defaultLbs:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->lbsLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x5

    iget v1, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->kgMin:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x6

    iget v1, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->kgMax:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x7

    iget v1, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->defaultKg:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/16 v0, 0x8

    iget-object v1, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->kgLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v0, 0x9

    iget-object v1, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->unitType:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->stateUpdateValueKey:Ljava/lang/String;

    const/16 v1, 0xa

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->unitType:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->stateUpdateValueKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->lbsMin:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->lbsMax:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->defaultLbs:I

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->lbsLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->kgMin:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->kgMax:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->defaultKg:I

    return v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->kgLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;IIILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;
    .locals 13

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lbsLabel"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kgLabel"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unitType"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;

    move-object v2, p1

    move v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;-><init>(Ljava/lang/String;IIILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->label:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->label:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->lbsMin:I

    iget v3, p1, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->lbsMin:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->lbsMax:I

    iget v3, p1, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->lbsMax:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->defaultLbs:I

    iget v3, p1, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->defaultLbs:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->lbsLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->lbsLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->kgMin:I

    iget v3, p1, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->kgMin:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->kgMax:I

    iget v3, p1, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->kgMax:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->defaultKg:I

    iget v3, p1, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->defaultKg:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->kgLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->kgLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->unitType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->unitType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->stateUpdateValueKey:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->stateUpdateValueKey:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getDefaultKg()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->defaultKg:I

    return v0
.end method

.method public final getDefaultLbs()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->defaultLbs:I

    return v0
.end method

.method public final getKgLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->kgLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getKgMax()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->kgMax:I

    return v0
.end method

.method public final getKgMin()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->kgMin:I

    return v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getLbsLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->lbsLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getLbsMax()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->lbsMax:I

    return v0
.end method

.method public final getLbsMin()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->lbsMin:I

    return v0
.end method

.method public final getStateUpdateValueKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->stateUpdateValueKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getUnitType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->unitType:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->label:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->lbsMin:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->lbsMax:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->defaultLbs:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->lbsLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->kgMin:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->kgMax:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->defaultKg:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->kgLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->unitType:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->stateUpdateValueKey:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->label:Ljava/lang/String;

    iget v1, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->lbsMin:I

    iget v2, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->lbsMax:I

    iget v3, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->defaultLbs:I

    iget-object v4, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->lbsLabel:Ljava/lang/String;

    iget v5, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->kgMin:I

    iget v6, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->kgMax:I

    iget v7, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->defaultKg:I

    iget-object v8, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->kgLabel:Ljava/lang/String;

    iget-object v9, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->unitType:Ljava/lang/String;

    iget-object v10, p0, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->stateUpdateValueKey:Ljava/lang/String;

    const-string v11, ", lbsMin="

    const-string v12, ", lbsMax="

    const-string v13, "WeightPickerModel(label="

    invoke-static {v1, v13, v0, v11, v12}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", defaultLbs="

    const-string v11, ", lbsLabel="

    invoke-static {v0, v2, v1, v3, v11}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", kgMin="

    const-string v2, ", kgMax="

    invoke-static {v5, v4, v1, v2, v0}, Ld;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", defaultKg="

    const-string v2, ", kgLabel="

    invoke-static {v0, v6, v1, v7, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", unitType="

    const-string v2, ", stateUpdateValueKey="

    invoke-static {v0, v8, v1, v9, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ")"

    invoke-static {v10, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
