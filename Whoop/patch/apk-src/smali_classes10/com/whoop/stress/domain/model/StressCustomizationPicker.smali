.class public final Lcom/whoop/stress/domain/model/StressCustomizationPicker;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/stress/domain/model/StressCustomizationPicker$$serializer;,
        Lcom/whoop/stress/domain/model/StressCustomizationPicker$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0015\u0008\u0087\u0008\u0018\u0000 82\u00020\u0001:\u00029:B9\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bBQ\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u0006\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\n\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001eJN\u0010!\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u001eJ\u001a\u0010\'\u001a\u00020&2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010)\u0012\u0004\u0008+\u0010,\u001a\u0004\u0008*\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010)\u0012\u0004\u0008.\u0010,\u001a\u0004\u0008-\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010)\u0012\u0004\u00080\u0010,\u001a\u0004\u0008/\u0010\u001aR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00101\u0012\u0004\u00083\u0010,\u001a\u0004\u00082\u0010\u001eR \u0010\u0008\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u00101\u0012\u0004\u00085\u0010,\u001a\u0004\u00084\u0010\u001eR \u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u00101\u0012\u0004\u00087\u0010,\u001a\u0004\u00086\u0010\u001e\u00a8\u0006;"
    }
    d2 = {
        "Lcom/whoop/stress/domain/model/StressCustomizationPicker;",
        "",
        "",
        "suffix",
        "pickerTitle",
        "button",
        "",
        "minValue",
        "maxValue",
        "initialValue",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$stress_release",
        "(Lcom/whoop/stress/domain/model/StressCustomizationPicker;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()I",
        "component5",
        "component6",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)Lcom/whoop/stress/domain/model/StressCustomizationPicker;",
        "toString",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getSuffix",
        "getSuffix$annotations",
        "()V",
        "getPickerTitle",
        "getPickerTitle$annotations",
        "getButton",
        "getButton$annotations",
        "I",
        "getMinValue",
        "getMinValue$annotations",
        "getMaxValue",
        "getMaxValue$annotations",
        "getInitialValue",
        "getInitialValue$annotations",
        "Companion",
        "$serializer",
        "a",
        "stress_release"
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

.field public static final Companion:Lcom/whoop/stress/domain/model/StressCustomizationPicker$a;


# instance fields
.field private final button:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "button_display"
    .end annotation
.end field

.field private final initialValue:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "initial_picker_value"
    .end annotation
.end field

.field private final maxValue:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "maximum_picker_value"
    .end annotation
.end field

.field private final minValue:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "minimum_picker_value"
    .end annotation
.end field

.field private final pickerTitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "title_display"
    .end annotation
.end field

.field private final suffix:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "suffix"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/stress/domain/model/StressCustomizationPicker$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/stress/domain/model/StressCustomizationPicker$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->Companion:Lcom/whoop/stress/domain/model/StressCustomizationPicker$a;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/stress/domain/model/StressCustomizationPicker$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressCustomizationPicker$$serializer;

    invoke-virtual {p8}, Lcom/whoop/stress/domain/model/StressCustomizationPicker$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->suffix:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->pickerTitle:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->button:Ljava/lang/String;

    iput p5, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->minValue:I

    iput p6, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->maxValue:I

    iput p7, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->initialValue:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V
    .locals 1

    const-string v0, "pickerTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "button"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->suffix:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->pickerTitle:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->button:Ljava/lang/String;

    .line 6
    iput p4, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->minValue:I

    .line 7
    iput p5, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->maxValue:I

    .line 8
    iput p6, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->initialValue:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/stress/domain/model/StressCustomizationPicker;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/Object;)Lcom/whoop/stress/domain/model/StressCustomizationPicker;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->suffix:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->pickerTitle:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->button:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget p4, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->minValue:I

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget p5, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->maxValue:I

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget p6, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->initialValue:I

    :cond_5
    move p7, p5

    move p8, p6

    move-object p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)Lcom/whoop/stress/domain/model/StressCustomizationPicker;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getButton$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "button_display"
    .end annotation

    return-void
.end method

.method public static synthetic getInitialValue$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "initial_picker_value"
    .end annotation

    return-void
.end method

.method public static synthetic getMaxValue$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "maximum_picker_value"
    .end annotation

    return-void
.end method

.method public static synthetic getMinValue$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "minimum_picker_value"
    .end annotation

    return-void
.end method

.method public static synthetic getPickerTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "title_display"
    .end annotation

    return-void
.end method

.method public static synthetic getSuffix$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "suffix"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$stress_release(Lcom/whoop/stress/domain/model/StressCustomizationPicker;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->suffix:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->pickerTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->button:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget v1, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->minValue:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x4

    iget v1, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->maxValue:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x5

    iget p0, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->initialValue:I

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->suffix:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->pickerTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->button:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->minValue:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->maxValue:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->initialValue:I

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)Lcom/whoop/stress/domain/model/StressCustomizationPicker;
    .locals 8

    const-string v0, "pickerTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "button"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/stress/domain/model/StressCustomizationPicker;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/stress/domain/model/StressCustomizationPicker;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/stress/domain/model/StressCustomizationPicker;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/stress/domain/model/StressCustomizationPicker;

    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->suffix:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->suffix:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->pickerTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->pickerTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->button:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->button:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->minValue:I

    iget v3, p1, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->minValue:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->maxValue:I

    iget v3, p1, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->maxValue:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->initialValue:I

    iget p1, p1, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->initialValue:I

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getButton()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->button:Ljava/lang/String;

    return-object v0
.end method

.method public final getInitialValue()I
    .locals 1

    iget v0, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->initialValue:I

    return v0
.end method

.method public final getMaxValue()I
    .locals 1

    iget v0, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->maxValue:I

    return v0
.end method

.method public final getMinValue()I
    .locals 1

    iget v0, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->minValue:I

    return v0
.end method

.method public final getPickerTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->pickerTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSuffix()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->suffix:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->suffix:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->pickerTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->button:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->minValue:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->maxValue:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->initialValue:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->suffix:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->pickerTitle:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->button:Ljava/lang/String;

    iget v3, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->minValue:I

    iget v4, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->maxValue:I

    iget v5, p0, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->initialValue:I

    const-string v6, ", pickerTitle="

    const-string v7, ", button="

    const-string v8, "StressCustomizationPicker(suffix="

    invoke-static {v8, v0, v6, v1, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", minValue="

    const-string v6, ", maxValue="

    invoke-static {v3, v2, v1, v6, v0}, Ld;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", initialValue="

    const-string v2, ")"

    invoke-static {v0, v4, v1, v5, v2}, Lnh3/a;->i(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
