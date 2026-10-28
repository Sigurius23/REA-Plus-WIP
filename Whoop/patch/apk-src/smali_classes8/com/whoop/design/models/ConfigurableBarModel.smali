.class public final Lcom/whoop/design/models/ConfigurableBarModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/ConfigurableBarModel$$serializer;,
        Lcom/whoop/design/models/ConfigurableBarModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 22\u00020\u0001:\u000232B)\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tBA\u0008\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0008\u0010\u000eJ\'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ:\u0010\u001e\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008 \u0010\u0019J\u0010\u0010!\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u001a\u0010%\u001a\u00020$2\u0008\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008%\u0010&R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\'\u0012\u0004\u0008)\u0010*\u001a\u0004\u0008(\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010\'\u0012\u0004\u0008,\u0010*\u001a\u0004\u0008+\u0010\u0019R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\'\u0012\u0004\u0008.\u0010*\u001a\u0004\u0008-\u0010\u0019R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010/\u0012\u0004\u00081\u0010*\u001a\u0004\u00080\u0010\u001d\u00a8\u00064"
    }
    d2 = {
        "Lcom/whoop/design/models/ConfigurableBarModel;",
        "",
        "",
        "topLabel",
        "bottomLabelDisplay",
        "barColor",
        "",
        "percentage",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/ConfigurableBarModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()D",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)Lcom/whoop/design/models/ConfigurableBarModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTopLabel",
        "getTopLabel$annotations",
        "()V",
        "getBottomLabelDisplay",
        "getBottomLabelDisplay$annotations",
        "getBarColor",
        "getBarColor$annotations",
        "D",
        "getPercentage",
        "getPercentage$annotations",
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

.field public static final Companion:Lcom/whoop/design/models/ConfigurableBarModel$Companion;


# instance fields
.field private final barColor:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "color"
    .end annotation
.end field

.field private final bottomLabelDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "bottom_label_display_text"
    .end annotation
.end field

.field private final percentage:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "percent_of_total"
    .end annotation
.end field

.field private final topLabel:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "top_label_display"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/design/models/ConfigurableBarModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/ConfigurableBarModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/ConfigurableBarModel;->Companion:Lcom/whoop/design/models/ConfigurableBarModel$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/design/models/ConfigurableBarModel$$serializer;->INSTANCE:Lcom/whoop/design/models/ConfigurableBarModel$$serializer;

    invoke-virtual {p7}, Lcom/whoop/design/models/ConfigurableBarModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/ConfigurableBarModel;->topLabel:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/ConfigurableBarModel;->bottomLabelDisplay:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/design/models/ConfigurableBarModel;->barColor:Ljava/lang/String;

    iput-wide p5, p0, Lcom/whoop/design/models/ConfigurableBarModel;->percentage:D

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V
    .locals 1

    const-string v0, "bottomLabelDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "barColor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/ConfigurableBarModel;->topLabel:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/ConfigurableBarModel;->bottomLabelDisplay:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/ConfigurableBarModel;->barColor:Ljava/lang/String;

    .line 6
    iput-wide p4, p0, Lcom/whoop/design/models/ConfigurableBarModel;->percentage:D

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/ConfigurableBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILjava/lang/Object;)Lcom/whoop/design/models/ConfigurableBarModel;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/ConfigurableBarModel;->topLabel:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/ConfigurableBarModel;->bottomLabelDisplay:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/ConfigurableBarModel;->barColor:Ljava/lang/String;

    :cond_2
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_3

    iget-wide p4, p0, Lcom/whoop/design/models/ConfigurableBarModel;->percentage:D

    :cond_3
    move-wide p6, p4

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/design/models/ConfigurableBarModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)Lcom/whoop/design/models/ConfigurableBarModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getBarColor$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "color"
    .end annotation

    return-void
.end method

.method public static synthetic getBottomLabelDisplay$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "bottom_label_display_text"
    .end annotation

    return-void
.end method

.method public static synthetic getPercentage$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "percent_of_total"
    .end annotation

    return-void
.end method

.method public static synthetic getTopLabel$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "top_label_display"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/ConfigurableBarModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/design/models/ConfigurableBarModel;->topLabel:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/design/models/ConfigurableBarModel;->bottomLabelDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/design/models/ConfigurableBarModel;->barColor:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-wide v1, p0, Lcom/whoop/design/models/ConfigurableBarModel;->percentage:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/ConfigurableBarModel;->topLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/ConfigurableBarModel;->bottomLabelDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/ConfigurableBarModel;->barColor:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/ConfigurableBarModel;->percentage:D

    return-wide v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)Lcom/whoop/design/models/ConfigurableBarModel;
    .locals 7

    const-string v0, "bottomLabelDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "barColor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/ConfigurableBarModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-wide v5, p4

    invoke-direct/range {v1 .. v6}, Lcom/whoop/design/models/ConfigurableBarModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/ConfigurableBarModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/ConfigurableBarModel;

    iget-object v1, p0, Lcom/whoop/design/models/ConfigurableBarModel;->topLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/ConfigurableBarModel;->topLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/ConfigurableBarModel;->bottomLabelDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/ConfigurableBarModel;->bottomLabelDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/ConfigurableBarModel;->barColor:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/ConfigurableBarModel;->barColor:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/whoop/design/models/ConfigurableBarModel;->percentage:D

    iget-wide v5, p1, Lcom/whoop/design/models/ConfigurableBarModel;->percentage:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    if-eqz p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBarColor()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/ConfigurableBarModel;->barColor:Ljava/lang/String;

    return-object v0
.end method

.method public final getBottomLabelDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/ConfigurableBarModel;->bottomLabelDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getPercentage()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/ConfigurableBarModel;->percentage:D

    return-wide v0
.end method

.method public final getTopLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/ConfigurableBarModel;->topLabel:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/models/ConfigurableBarModel;->topLabel:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/ConfigurableBarModel;->bottomLabelDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/ConfigurableBarModel;->barColor:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-wide v1, p0, Lcom/whoop/design/models/ConfigurableBarModel;->percentage:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/design/models/ConfigurableBarModel;->topLabel:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/ConfigurableBarModel;->bottomLabelDisplay:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/ConfigurableBarModel;->barColor:Ljava/lang/String;

    iget-wide v3, p0, Lcom/whoop/design/models/ConfigurableBarModel;->percentage:D

    const-string v5, ", bottomLabelDisplay="

    const-string v6, ", barColor="

    const-string v7, "ConfigurableBarModel(topLabel="

    invoke-static {v7, v0, v5, v1, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", percentage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
