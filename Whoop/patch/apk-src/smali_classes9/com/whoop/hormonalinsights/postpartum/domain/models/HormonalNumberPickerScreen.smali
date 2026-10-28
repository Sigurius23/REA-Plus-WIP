.class public final Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen$$serializer;,
        Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 22\u00020\u0001:\u000232B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bBI\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u0004\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\n\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 JD\u0010!\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u001cJ\u001a\u0010(\u001a\u00020\'2\u0008\u0010&\u001a\u0004\u0018\u00010%H\u00d6\u0003\u00a2\u0006\u0004\u0008(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010*\u001a\u0004\u0008+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010,\u001a\u0004\u0008-\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010,\u001a\u0004\u0008.\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010*\u001a\u0004\u0008/\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00100\u001a\u0004\u00081\u0010 \u00a8\u00064"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;",
        "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;",
        "",
        "title",
        "",
        "minValue",
        "maxValue",
        "buttonTitle",
        "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;",
        "nextId",
        "<init>",
        "(Ljava/lang/String;IILjava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;IILjava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$hormonal_insights_release",
        "(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()I",
        "component3",
        "component4",
        "component5",
        "()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;",
        "copy",
        "(Ljava/lang/String;IILjava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;)Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;",
        "toString",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitle",
        "I",
        "getMinValue",
        "getMaxValue",
        "getButtonTitle",
        "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;",
        "getNextId",
        "Companion",
        "$serializer",
        "hormonal-insights_release"
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

.field public static final Companion:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen$Companion;


# instance fields
.field private final buttonTitle:Ljava/lang/String;

.field private final maxValue:I

.field private final minValue:I

.field private final nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->Companion:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lgm2/a;

    const/16 v3, 0x1d

    invoke-direct {v2, v3}, Lgm2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x5

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v1, v2, v3

    const/4 v1, 0x4

    aput-object v0, v2, v1

    sput-object v2, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;IILjava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen$$serializer;

    invoke-virtual {p7}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->title:Ljava/lang/String;

    iput p3, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->minValue:I

    iput p4, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->maxValue:I

    iput-object p5, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->buttonTitle:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILjava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttonTitle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->title:Ljava/lang/String;

    .line 4
    iput p2, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->minValue:I

    .line 5
    iput p3, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->maxValue:I

    .line 6
    iput-object p4, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->buttonTitle:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId"

    invoke-static {}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;->values()[Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;Ljava/lang/String;IILjava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;ILjava/lang/Object;)Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->minValue:I

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->maxValue:I

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->buttonTitle:Ljava/lang/String;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->copy(Ljava/lang/String;IILjava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;)Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$hormonal_insights_release(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget v2, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->minValue:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x2

    iget v2, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->maxValue:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->buttonTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->minValue:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->maxValue:I

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->buttonTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;IILjava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;)Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;
    .locals 7

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttonTitle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;-><init>(Ljava/lang/String;IILjava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->minValue:I

    iget v3, p1, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->minValue:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->maxValue:I

    iget v3, p1, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->maxValue:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->buttonTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->buttonTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    iget-object p1, p1, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getButtonTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->buttonTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getMaxValue()I
    .locals 1

    iget v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->maxValue:I

    return v0
.end method

.method public final getMinValue()I
    .locals 1

    iget v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->minValue:I

    return v0
.end method

.method public final getNextId()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->minValue:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->maxValue:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->buttonTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->title:Ljava/lang/String;

    iget v1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->minValue:I

    iget v2, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->maxValue:I

    iget-object v3, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->buttonTitle:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;->nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    const-string v5, ", minValue="

    const-string v6, ", maxValue="

    const-string v7, "HormonalNumberPickerScreen(title="

    invoke-static {v1, v7, v0, v5, v6}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", buttonTitle="

    const-string v5, ", nextId="

    invoke-static {v2, v1, v3, v5, v0}, Ldc/b;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
