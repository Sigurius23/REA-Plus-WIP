.class public final Lcom/whoop/design/models/items/PregnancyProgressBarModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/PregnancyProgressBarModel$$serializer;,
        Lcom/whoop/design/models/items/PregnancyProgressBarModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u000e\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u0000 62\u00020\u0001:\u000276B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bBG\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"JD\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010&\u001a\u00020%H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010+\u001a\u00020\u00082\u0008\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010-\u001a\u0004\u0008.\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010/\u001a\u0004\u00080\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010/\u001a\u0004\u00081\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00102\u001a\u0004\u00083\u0010 R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00104\u001a\u0004\u00085\u0010\"\u00a8\u00068"
    }
    d2 = {
        "Lcom/whoop/design/models/items/PregnancyProgressBarModel;",
        "",
        "Llz0/d;",
        "style",
        "",
        "rangeMin",
        "rangeMax",
        "currentValue",
        "",
        "showAnnotation",
        "<init>",
        "(Llz0/d;DDLjava/lang/Double;Z)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILlz0/d;DDLjava/lang/Double;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/PregnancyProgressBarModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Llz0/d;",
        "component2",
        "()D",
        "component3",
        "component4",
        "()Ljava/lang/Double;",
        "component5",
        "()Z",
        "copy",
        "(Llz0/d;DDLjava/lang/Double;Z)Lcom/whoop/design/models/items/PregnancyProgressBarModel;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Llz0/d;",
        "getStyle",
        "D",
        "getRangeMin",
        "getRangeMax",
        "Ljava/lang/Double;",
        "getCurrentValue",
        "Z",
        "getShowAnnotation",
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

.field public static final Companion:Lcom/whoop/design/models/items/PregnancyProgressBarModel$Companion;


# instance fields
.field private final currentValue:Ljava/lang/Double;

.field private final rangeMax:D

.field private final rangeMin:D

.field private final showAnnotation:Z

.field private final style:Llz0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/items/PregnancyProgressBarModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/PregnancyProgressBarModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->Companion:Lcom/whoop/design/models/items/PregnancyProgressBarModel$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lw91/h;

    const/16 v3, 0x16

    invoke-direct {v2, v3}, Lw91/h;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x5

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const/4 v0, 0x3

    aput-object v1, v2, v0

    const/4 v0, 0x4

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILlz0/d;DDLjava/lang/Double;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/design/models/items/PregnancyProgressBarModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/PregnancyProgressBarModel$$serializer;

    invoke-virtual {p9}, Lcom/whoop/design/models/items/PregnancyProgressBarModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->style:Llz0/d;

    iput-wide p3, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->rangeMin:D

    iput-wide p5, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->rangeMax:D

    iput-object p7, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->currentValue:Ljava/lang/Double;

    iput-boolean p8, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->showAnnotation:Z

    return-void
.end method

.method public constructor <init>(Llz0/d;DDLjava/lang/Double;Z)V
    .locals 1

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->style:Llz0/d;

    .line 4
    iput-wide p2, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->rangeMin:D

    .line 5
    iput-wide p4, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->rangeMax:D

    .line 6
    iput-object p6, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->currentValue:Ljava/lang/Double;

    .line 7
    iput-boolean p7, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->showAnnotation:Z

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.atom.progressbar.PregnancyProgressPlotStyle"

    invoke-static {}, Llz0/d;->values()[Llz0/d;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/PregnancyProgressBarModel;Llz0/d;DDLjava/lang/Double;ZILjava/lang/Object;)Lcom/whoop/design/models/items/PregnancyProgressBarModel;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->style:Llz0/d;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-wide p2, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->rangeMin:D

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-wide p4, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->rangeMax:D

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p6, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->currentValue:Ljava/lang/Double;

    :cond_3
    and-int/lit8 p8, p8, 0x10

    if-eqz p8, :cond_4

    iget-boolean p7, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->showAnnotation:Z

    :cond_4
    move-object p8, p6

    move p9, p7

    move-wide p6, p4

    move-wide p4, p2

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->copy(Llz0/d;DDLjava/lang/Double;Z)Lcom/whoop/design/models/items/PregnancyProgressBarModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/PregnancyProgressBarModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->style:Llz0/d;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x1

    iget-wide v1, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->rangeMin:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/4 v0, 0x2

    iget-wide v1, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->rangeMax:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    sget-object v0, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    iget-object v1, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->currentValue:Ljava/lang/Double;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x4

    iget-boolean p0, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->showAnnotation:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    return-void
.end method


# virtual methods
.method public final component1()Llz0/d;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->style:Llz0/d;

    return-object v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->rangeMin:D

    return-wide v0
.end method

.method public final component3()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->rangeMax:D

    return-wide v0
.end method

.method public final component4()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->currentValue:Ljava/lang/Double;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->showAnnotation:Z

    return v0
.end method

.method public final copy(Llz0/d;DDLjava/lang/Double;Z)Lcom/whoop/design/models/items/PregnancyProgressBarModel;
    .locals 9

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/PregnancyProgressBarModel;

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    move-object v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/design/models/items/PregnancyProgressBarModel;-><init>(Llz0/d;DDLjava/lang/Double;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/PregnancyProgressBarModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/PregnancyProgressBarModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->style:Llz0/d;

    iget-object v3, p1, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->style:Llz0/d;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->rangeMin:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->rangeMin:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->rangeMax:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->rangeMax:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->currentValue:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->currentValue:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->showAnnotation:Z

    iget-boolean p1, p1, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->showAnnotation:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCurrentValue()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->currentValue:Ljava/lang/Double;

    return-object v0
.end method

.method public final getRangeMax()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->rangeMax:D

    return-wide v0
.end method

.method public final getRangeMin()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->rangeMin:D

    return-wide v0
.end method

.method public final getShowAnnotation()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->showAnnotation:Z

    return v0
.end method

.method public final getStyle()Llz0/d;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->style:Llz0/d;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->style:Llz0/d;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->rangeMin:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->rangeMax:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->currentValue:Ljava/lang/Double;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v1, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->showAnnotation:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->style:Llz0/d;

    iget-wide v1, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->rangeMin:D

    iget-wide v3, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->rangeMax:D

    iget-object v5, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->currentValue:Ljava/lang/Double;

    iget-boolean v6, p0, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->showAnnotation:Z

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "PregnancyProgressBarModel(style="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", rangeMin="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", rangeMax="

    const-string v1, ", currentValue="

    invoke-static {v7, v0, v3, v4, v1}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", showAnnotation="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
