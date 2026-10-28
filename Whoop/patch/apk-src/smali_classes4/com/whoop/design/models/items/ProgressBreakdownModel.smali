.class public final Lcom/whoop/design/models/items/ProgressBreakdownModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/ProgressBreakdownModel$$serializer;,
        Lcom/whoop/design/models/items/ProgressBreakdownModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 ;2\u00020\u0001:\u0002<;BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\r\u0010\u000eB]\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\r\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010 J^\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010 J\u0010\u0010*\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010\u001dJ\u001a\u0010.\u001a\u00020-2\u0008\u0010,\u001a\u0004\u0018\u00010+H\u00d6\u0003\u00a2\u0006\u0004\u0008.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00100\u001a\u0004\u00081\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00100\u001a\u0004\u00082\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00103\u001a\u0004\u00084\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00103\u001a\u0004\u00085\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00106\u001a\u0004\u00087\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00108\u001a\u0004\u00089\u0010%R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00103\u001a\u0004\u0008:\u0010 \u00a8\u0006="
    }
    d2 = {
        "Lcom/whoop/design/models/items/ProgressBreakdownModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "totalProgressSteps",
        "currentProgressSteps",
        "",
        "upperLeftDisplay",
        "upperRightDisplay",
        "Lcom/whoop/design/models/items/ProgressMetaDataModel;",
        "progressMetadata",
        "Lcom/whoop/design/models/items/ProgressStyle;",
        "progressStyle",
        "lowerLeftDisplay",
        "<init>",
        "(IILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ProgressMetaDataModel;Lcom/whoop/design/models/items/ProgressStyle;Ljava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IIILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ProgressMetaDataModel;Lcom/whoop/design/models/items/ProgressStyle;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/ProgressBreakdownModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()I",
        "component2",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "component5",
        "()Lcom/whoop/design/models/items/ProgressMetaDataModel;",
        "component6",
        "()Lcom/whoop/design/models/items/ProgressStyle;",
        "component7",
        "copy",
        "(IILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ProgressMetaDataModel;Lcom/whoop/design/models/items/ProgressStyle;Ljava/lang/String;)Lcom/whoop/design/models/items/ProgressBreakdownModel;",
        "toString",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getTotalProgressSteps",
        "getCurrentProgressSteps",
        "Ljava/lang/String;",
        "getUpperLeftDisplay",
        "getUpperRightDisplay",
        "Lcom/whoop/design/models/items/ProgressMetaDataModel;",
        "getProgressMetadata",
        "Lcom/whoop/design/models/items/ProgressStyle;",
        "getProgressStyle",
        "getLowerLeftDisplay",
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

.field public static final Companion:Lcom/whoop/design/models/items/ProgressBreakdownModel$Companion;


# instance fields
.field private final currentProgressSteps:I

.field private final lowerLeftDisplay:Ljava/lang/String;

.field private final progressMetadata:Lcom/whoop/design/models/items/ProgressMetaDataModel;

.field private final progressStyle:Lcom/whoop/design/models/items/ProgressStyle;

.field private final totalProgressSteps:I

.field private final upperLeftDisplay:Ljava/lang/String;

.field private final upperRightDisplay:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/design/models/items/ProgressBreakdownModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/ProgressBreakdownModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->Companion:Lcom/whoop/design/models/items/ProgressBreakdownModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lw91/i;

    const/4 v3, 0x6

    invoke-direct {v2, v3}, Lw91/i;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x7

    new-array v2, v2, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v2, v4

    const/4 v4, 0x1

    aput-object v1, v2, v4

    const/4 v4, 0x2

    aput-object v1, v2, v4

    const/4 v4, 0x3

    aput-object v1, v2, v4

    const/4 v4, 0x4

    aput-object v1, v2, v4

    const/4 v4, 0x5

    aput-object v0, v2, v4

    aput-object v1, v2, v3

    sput-object v2, Lcom/whoop/design/models/items/ProgressBreakdownModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(IIILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ProgressMetaDataModel;Lcom/whoop/design/models/items/ProgressStyle;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/design/models/items/ProgressBreakdownModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ProgressBreakdownModel$$serializer;

    invoke-virtual {p9}, Lcom/whoop/design/models/items/ProgressBreakdownModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->totalProgressSteps:I

    iput p3, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->currentProgressSteps:I

    iput-object p4, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->upperLeftDisplay:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->upperRightDisplay:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->progressMetadata:Lcom/whoop/design/models/items/ProgressMetaDataModel;

    iput-object p7, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->progressStyle:Lcom/whoop/design/models/items/ProgressStyle;

    iput-object p8, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->lowerLeftDisplay:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ProgressMetaDataModel;Lcom/whoop/design/models/items/ProgressStyle;Ljava/lang/String;)V
    .locals 1

    const-string v0, "progressStyle"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->totalProgressSteps:I

    .line 4
    iput p2, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->currentProgressSteps:I

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->upperLeftDisplay:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->upperRightDisplay:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->progressMetadata:Lcom/whoop/design/models/items/ProgressMetaDataModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->progressStyle:Lcom/whoop/design/models/items/ProgressStyle;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->lowerLeftDisplay:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.ProgressStyle"

    invoke-static {}, Lcom/whoop/design/models/items/ProgressStyle;->values()[Lcom/whoop/design/models/items/ProgressStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/ProgressBreakdownModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/ProgressBreakdownModel;IILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ProgressMetaDataModel;Lcom/whoop/design/models/items/ProgressStyle;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/models/items/ProgressBreakdownModel;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget p1, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->totalProgressSteps:I

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget p2, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->currentProgressSteps:I

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->upperLeftDisplay:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->upperRightDisplay:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->progressMetadata:Lcom/whoop/design/models/items/ProgressMetaDataModel;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->progressStyle:Lcom/whoop/design/models/items/ProgressStyle;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->lowerLeftDisplay:Ljava/lang/String;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/design/models/items/ProgressBreakdownModel;->copy(IILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ProgressMetaDataModel;Lcom/whoop/design/models/items/ProgressStyle;Ljava/lang/String;)Lcom/whoop/design/models/items/ProgressBreakdownModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/ProgressBreakdownModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget v2, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->totalProgressSteps:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x1

    iget v2, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->currentProgressSteps:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->upperLeftDisplay:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->upperRightDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/design/models/items/ProgressMetaDataModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ProgressMetaDataModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->progressMetadata:Lcom/whoop/design/models/items/ProgressMetaDataModel;

    const/4 v4, 0x4

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x5

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->progressStyle:Lcom/whoop/design/models/items/ProgressStyle;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x6

    iget-object p0, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->lowerLeftDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->totalProgressSteps:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->currentProgressSteps:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->upperLeftDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->upperRightDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/items/ProgressMetaDataModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->progressMetadata:Lcom/whoop/design/models/items/ProgressMetaDataModel;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/items/ProgressStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->progressStyle:Lcom/whoop/design/models/items/ProgressStyle;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->lowerLeftDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(IILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ProgressMetaDataModel;Lcom/whoop/design/models/items/ProgressStyle;Ljava/lang/String;)Lcom/whoop/design/models/items/ProgressBreakdownModel;
    .locals 9

    const-string v0, "progressStyle"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/ProgressBreakdownModel;

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/design/models/items/ProgressBreakdownModel;-><init>(IILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ProgressMetaDataModel;Lcom/whoop/design/models/items/ProgressStyle;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/ProgressBreakdownModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/ProgressBreakdownModel;

    iget v1, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->totalProgressSteps:I

    iget v3, p1, Lcom/whoop/design/models/items/ProgressBreakdownModel;->totalProgressSteps:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->currentProgressSteps:I

    iget v3, p1, Lcom/whoop/design/models/items/ProgressBreakdownModel;->currentProgressSteps:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->upperLeftDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ProgressBreakdownModel;->upperLeftDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->upperRightDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ProgressBreakdownModel;->upperRightDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->progressMetadata:Lcom/whoop/design/models/items/ProgressMetaDataModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/ProgressBreakdownModel;->progressMetadata:Lcom/whoop/design/models/items/ProgressMetaDataModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->progressStyle:Lcom/whoop/design/models/items/ProgressStyle;

    iget-object v3, p1, Lcom/whoop/design/models/items/ProgressBreakdownModel;->progressStyle:Lcom/whoop/design/models/items/ProgressStyle;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->lowerLeftDisplay:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/design/models/items/ProgressBreakdownModel;->lowerLeftDisplay:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getCurrentProgressSteps()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->currentProgressSteps:I

    return v0
.end method

.method public final getLowerLeftDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->lowerLeftDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getProgressMetadata()Lcom/whoop/design/models/items/ProgressMetaDataModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->progressMetadata:Lcom/whoop/design/models/items/ProgressMetaDataModel;

    return-object v0
.end method

.method public final getProgressStyle()Lcom/whoop/design/models/items/ProgressStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->progressStyle:Lcom/whoop/design/models/items/ProgressStyle;

    return-object v0
.end method

.method public final getTotalProgressSteps()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->totalProgressSteps:I

    return v0
.end method

.method public final getUpperLeftDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->upperLeftDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpperRightDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->upperRightDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->totalProgressSteps:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->currentProgressSteps:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->upperLeftDisplay:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->upperRightDisplay:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->progressMetadata:Lcom/whoop/design/models/items/ProgressMetaDataModel;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/design/models/items/ProgressMetaDataModel;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->progressStyle:Lcom/whoop/design/models/items/ProgressStyle;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->lowerLeftDisplay:Ljava/lang/String;

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v2, v3

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget v0, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->totalProgressSteps:I

    iget v1, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->currentProgressSteps:I

    iget-object v2, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->upperLeftDisplay:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->upperRightDisplay:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->progressMetadata:Lcom/whoop/design/models/items/ProgressMetaDataModel;

    iget-object v5, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->progressStyle:Lcom/whoop/design/models/items/ProgressStyle;

    iget-object v6, p0, Lcom/whoop/design/models/items/ProgressBreakdownModel;->lowerLeftDisplay:Ljava/lang/String;

    const-string v7, ", currentProgressSteps="

    const-string v8, ", upperLeftDisplay="

    const-string v9, "ProgressBreakdownModel(totalProgressSteps="

    invoke-static {v0, v1, v9, v7, v8}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", upperRightDisplay="

    const-string v7, ", progressMetadata="

    invoke-static {v0, v2, v1, v3, v7}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", progressStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lowerLeftDisplay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v6, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
