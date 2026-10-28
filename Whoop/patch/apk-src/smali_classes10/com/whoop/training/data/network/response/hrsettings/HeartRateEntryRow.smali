.class public final Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow$$serializer;,
        Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\"\u0008\u0087\u0008\u0018\u0000 62\u00020\u0001:\u000278B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u000c\u0010\rBY\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000c\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001fJ\u0010\u0010$\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001fJV\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u001cJ\u0010\u0010(\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u001fJ\u001a\u0010*\u001a\u00020\u00082\u0008\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010,\u001a\u0004\u0008-\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010,\u001a\u0004\u0008.\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010/\u001a\u0004\u00080\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010,\u001a\u0004\u00081\u0010\u001cR\u001a\u0010\t\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u00102\u001a\u0004\u00083\u0010\"R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010/\u001a\u0004\u00084\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010/\u001a\u0004\u00085\u0010\u001f\u00a8\u00069"
    }
    d2 = {
        "Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;",
        "",
        "",
        "label",
        "id",
        "",
        "value",
        "units",
        "",
        "editable",
        "minValue",
        "maxValue",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZII)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ZIILkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$training_release",
        "(Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()I",
        "component4",
        "component5",
        "()Z",
        "component6",
        "component7",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZII)Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;",
        "toString",
        "hashCode",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getLabel",
        "getId",
        "I",
        "getValue",
        "getUnits",
        "Z",
        "getEditable",
        "getMinValue",
        "getMaxValue",
        "Companion",
        "$serializer",
        "a",
        "training_release"
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

.field public static final Companion:Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow$a;


# instance fields
.field private final editable:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "editable"
    .end annotation
.end field

.field private final id:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "id"
    .end annotation
.end field

.field private final label:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "label"
    .end annotation
.end field

.field private final maxValue:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "max_value"
    .end annotation
.end field

.field private final minValue:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "min_value"
    .end annotation
.end field

.field private final units:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "units"
    .end annotation
.end field

.field private final value:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "value"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->Companion:Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow$a;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ZIILkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow$$serializer;->INSTANCE:Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow$$serializer;

    invoke-virtual {p9}, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->label:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->id:Ljava/lang/String;

    iput p4, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->value:I

    iput-object p5, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->units:Ljava/lang/String;

    iput-boolean p6, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->editable:Z

    iput p7, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->minValue:I

    iput p8, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->maxValue:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZII)V
    .locals 1

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "units"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->label:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->id:Ljava/lang/String;

    .line 5
    iput p3, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->value:I

    .line 6
    iput-object p4, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->units:Ljava/lang/String;

    .line 7
    iput-boolean p5, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->editable:Z

    .line 8
    iput p6, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->minValue:I

    .line 9
    iput p7, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->maxValue:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZIIILjava/lang/Object;)Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->label:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->id:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget p3, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->value:I

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->units:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-boolean p5, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->editable:Z

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget p6, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->minValue:I

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget p7, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->maxValue:I

    :cond_6
    move p8, p6

    move p9, p7

    move-object p6, p4

    move p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->copy(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZII)Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$training_release(Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;Lzc3/c;Lyc3/g;)V
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->label:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget v1, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->value:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->units:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x4

    iget-boolean v1, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->editable:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v0, 0x5

    iget v1, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->minValue:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x6

    iget p0, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->maxValue:I

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->value:I

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->units:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->editable:Z

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->minValue:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->maxValue:I

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZII)Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;
    .locals 9

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "units"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move v6, p5

    move v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZII)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;

    iget-object v1, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->label:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->label:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->value:I

    iget v3, p1, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->value:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->units:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->units:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->editable:Z

    iget-boolean v3, p1, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->editable:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->minValue:I

    iget v3, p1, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->minValue:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->maxValue:I

    iget p1, p1, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->maxValue:I

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getEditable()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->editable:Z

    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getMaxValue()I
    .locals 1

    iget v0, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->maxValue:I

    return v0
.end method

.method public final getMinValue()I
    .locals 1

    iget v0, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->minValue:I

    return v0
.end method

.method public final getUnits()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->units:Ljava/lang/String;

    return-object v0
.end method

.method public final getValue()I
    .locals 1

    iget v0, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->value:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->label:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->value:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->units:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->editable:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget v2, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->minValue:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->maxValue:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->label:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->id:Ljava/lang/String;

    iget v2, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->value:I

    iget-object v3, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->units:Ljava/lang/String;

    iget-boolean v4, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->editable:Z

    iget v5, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->minValue:I

    iget v6, p0, Lcom/whoop/training/data/network/response/hrsettings/HeartRateEntryRow;->maxValue:I

    const-string v7, ", id="

    const-string v8, ", value="

    const-string v9, "HeartRateEntryRow(label="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", units="

    const-string v7, ", editable="

    invoke-static {v2, v1, v3, v7, v0}, Ldc/b;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", minValue="

    const-string v2, ", maxValue="

    invoke-static {v5, v1, v2, v0, v4}, Lr;->r(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    const-string v1, ")"

    invoke-static {v0, v6, v1}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
