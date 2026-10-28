.class public final Lcom/whoop/design/models/items/ExplainerGaugeModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/ExplainerGaugeModel$$serializer;,
        Lcom/whoop/design/models/items/ExplainerGaugeModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u0000 D2\u00020\u0001:\u0002EDBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000c\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010Bi\u0008\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u000f\u0010\u0015J\'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010 J\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010 J\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010 J\u0010\u0010$\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010 J\u0010\u0010\'\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010(J\u0010\u0010*\u001a\u00020\rH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+Jj\u0010,\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\rH\u00c6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010/\u001a\u00020.H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u0010\u00101\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u00081\u00102J\u001a\u00105\u001a\u00020\r2\u0008\u00104\u001a\u0004\u0018\u000103H\u00d6\u0003\u00a2\u0006\u0004\u00085\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00107\u001a\u0004\u00088\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00107\u001a\u0004\u00089\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00107\u001a\u0004\u0008:\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00107\u001a\u0004\u0008;\u0010 R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010<\u001a\u0004\u0008=\u0010%R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00107\u001a\u0004\u0008>\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010?\u001a\u0004\u0008@\u0010(R\u0017\u0010\u000c\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010?\u001a\u0004\u0008A\u0010(R\u0017\u0010\u000e\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010B\u001a\u0004\u0008C\u0010+\u00a8\u0006F"
    }
    d2 = {
        "Lcom/whoop/design/models/items/ExplainerGaugeModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "optimalStrainPercent",
        "lowerOptimalStrainFillValue",
        "higherOptimalStrainFillValue",
        "recoveryPercentage",
        "Lz51/k;",
        "recoveryLevel",
        "strainScorePercentage",
        "Lcom/whoop/design/util/TextResource;",
        "descriptionText",
        "descriptionSubText",
        "",
        "hasDivider",
        "<init>",
        "(FFFFLz51/k;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Z)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IFFFFLz51/k;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/ExplainerGaugeModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()F",
        "component2",
        "component3",
        "component4",
        "component5",
        "()Lz51/k;",
        "component6",
        "component7",
        "()Lcom/whoop/design/util/TextResource;",
        "component8",
        "component9",
        "()Z",
        "copy",
        "(FFFFLz51/k;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Z)Lcom/whoop/design/models/items/ExplainerGaugeModel;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "F",
        "getOptimalStrainPercent",
        "getLowerOptimalStrainFillValue",
        "getHigherOptimalStrainFillValue",
        "getRecoveryPercentage",
        "Lz51/k;",
        "getRecoveryLevel",
        "getStrainScorePercentage",
        "Lcom/whoop/design/util/TextResource;",
        "getDescriptionText",
        "getDescriptionSubText",
        "Z",
        "getHasDivider",
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

.field public static final Companion:Lcom/whoop/design/models/items/ExplainerGaugeModel$Companion;


# instance fields
.field private final descriptionSubText:Lcom/whoop/design/util/TextResource;

.field private final descriptionText:Lcom/whoop/design/util/TextResource;

.field private final hasDivider:Z

.field private final higherOptimalStrainFillValue:F

.field private final lowerOptimalStrainFillValue:F

.field private final optimalStrainPercent:F

.field private final recoveryLevel:Lz51/k;

.field private final recoveryPercentage:F

.field private final strainScorePercentage:F


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/design/models/items/ExplainerGaugeModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/ExplainerGaugeModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->Companion:Lcom/whoop/design/models/items/ExplainerGaugeModel$Companion;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lw91/d;

    const/4 v3, 0x6

    invoke-direct {v2, v3}, Lw91/d;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/16 v2, 0x9

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

    aput-object v0, v2, v4

    const/4 v0, 0x5

    aput-object v1, v2, v0

    aput-object v1, v2, v3

    const/4 v0, 0x7

    aput-object v1, v2, v0

    const/16 v0, 0x8

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/design/models/items/ExplainerGaugeModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>(FFFFLz51/k;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Z)V
    .locals 1

    const-string v0, "recoveryLevel"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptionText"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptionSubText"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->optimalStrainPercent:F

    .line 3
    iput p2, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->lowerOptimalStrainFillValue:F

    .line 4
    iput p3, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->higherOptimalStrainFillValue:F

    .line 5
    iput p4, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->recoveryPercentage:F

    .line 6
    iput-object p5, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->recoveryLevel:Lz51/k;

    .line 7
    iput p6, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->strainScorePercentage:F

    .line 8
    iput-object p7, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->descriptionText:Lcom/whoop/design/util/TextResource;

    .line 9
    iput-object p8, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->descriptionSubText:Lcom/whoop/design/util/TextResource;

    .line 10
    iput-boolean p9, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->hasDivider:Z

    return-void
.end method

.method public synthetic constructor <init>(IFFFFLz51/k;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p11, p1, 0x1ff

    const/16 v0, 0x1ff

    if-eq v0, p11, :cond_0

    .line 11
    sget-object p11, Lcom/whoop/design/models/items/ExplainerGaugeModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ExplainerGaugeModel$$serializer;

    invoke-virtual {p11}, Lcom/whoop/design/models/items/ExplainerGaugeModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->optimalStrainPercent:F

    iput p3, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->lowerOptimalStrainFillValue:F

    iput p4, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->higherOptimalStrainFillValue:F

    iput p5, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->recoveryPercentage:F

    iput-object p6, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->recoveryLevel:Lz51/k;

    iput p7, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->strainScorePercentage:F

    iput-object p8, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->descriptionText:Lcom/whoop/design/util/TextResource;

    iput-object p9, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->descriptionSubText:Lcom/whoop/design/util/TextResource;

    iput-boolean p10, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->hasDivider:Z

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.organism.gauge.OverviewGaugeRecoveryType"

    invoke-static {}, Lz51/k;->values()[Lz51/k;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/ExplainerGaugeModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/ExplainerGaugeModel;FFFFLz51/k;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZILjava/lang/Object;)Lcom/whoop/design/models/items/ExplainerGaugeModel;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget p1, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->optimalStrainPercent:F

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget p2, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->lowerOptimalStrainFillValue:F

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget p3, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->higherOptimalStrainFillValue:F

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget p4, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->recoveryPercentage:F

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->recoveryLevel:Lz51/k;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget p6, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->strainScorePercentage:F

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->descriptionText:Lcom/whoop/design/util/TextResource;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->descriptionSubText:Lcom/whoop/design/util/TextResource;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-boolean p9, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->hasDivider:Z

    :cond_8
    move-object p10, p8

    move p11, p9

    move p8, p6

    move-object p9, p7

    move p6, p4

    move-object p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/design/models/items/ExplainerGaugeModel;->copy(FFFFLz51/k;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Z)Lcom/whoop/design/models/items/ExplainerGaugeModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/ExplainerGaugeModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget v2, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->optimalStrainPercent:F

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    const/4 v1, 0x1

    iget v2, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->lowerOptimalStrainFillValue:F

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    const/4 v1, 0x2

    iget v2, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->higherOptimalStrainFillValue:F

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    const/4 v1, 0x3

    iget v2, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->recoveryPercentage:F

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->recoveryLevel:Lz51/k;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x5

    iget v1, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->strainScorePercentage:F

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    sget-object v0, Lmd1/a;->a:Lmd1/a;

    iget-object v1, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->descriptionText:Lcom/whoop/design/util/TextResource;

    const/4 v2, 0x6

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->descriptionSubText:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0x8

    iget-boolean p0, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->hasDivider:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    return-void
.end method


# virtual methods
.method public final component1()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->optimalStrainPercent:F

    return v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->lowerOptimalStrainFillValue:F

    return v0
.end method

.method public final component3()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->higherOptimalStrainFillValue:F

    return v0
.end method

.method public final component4()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->recoveryPercentage:F

    return v0
.end method

.method public final component5()Lz51/k;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->recoveryLevel:Lz51/k;

    return-object v0
.end method

.method public final component6()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->strainScorePercentage:F

    return v0
.end method

.method public final component7()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->descriptionText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->descriptionSubText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->hasDivider:Z

    return v0
.end method

.method public final copy(FFFFLz51/k;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Z)Lcom/whoop/design/models/items/ExplainerGaugeModel;
    .locals 11

    const-string v0, "recoveryLevel"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptionText"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptionSubText"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/ExplainerGaugeModel;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move/from16 v7, p6

    move/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/whoop/design/models/items/ExplainerGaugeModel;-><init>(FFFFLz51/k;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/ExplainerGaugeModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/ExplainerGaugeModel;

    iget v1, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->optimalStrainPercent:F

    iget v3, p1, Lcom/whoop/design/models/items/ExplainerGaugeModel;->optimalStrainPercent:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->lowerOptimalStrainFillValue:F

    iget v3, p1, Lcom/whoop/design/models/items/ExplainerGaugeModel;->lowerOptimalStrainFillValue:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->higherOptimalStrainFillValue:F

    iget v3, p1, Lcom/whoop/design/models/items/ExplainerGaugeModel;->higherOptimalStrainFillValue:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->recoveryPercentage:F

    iget v3, p1, Lcom/whoop/design/models/items/ExplainerGaugeModel;->recoveryPercentage:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->recoveryLevel:Lz51/k;

    iget-object v3, p1, Lcom/whoop/design/models/items/ExplainerGaugeModel;->recoveryLevel:Lz51/k;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->strainScorePercentage:F

    iget v3, p1, Lcom/whoop/design/models/items/ExplainerGaugeModel;->strainScorePercentage:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->descriptionText:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/ExplainerGaugeModel;->descriptionText:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->descriptionSubText:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/ExplainerGaugeModel;->descriptionSubText:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->hasDivider:Z

    iget-boolean p1, p1, Lcom/whoop/design/models/items/ExplainerGaugeModel;->hasDivider:Z

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getDescriptionSubText()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->descriptionSubText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getDescriptionText()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->descriptionText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getHasDivider()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->hasDivider:Z

    return v0
.end method

.method public final getHigherOptimalStrainFillValue()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->higherOptimalStrainFillValue:F

    return v0
.end method

.method public final getLowerOptimalStrainFillValue()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->lowerOptimalStrainFillValue:F

    return v0
.end method

.method public final getOptimalStrainPercent()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->optimalStrainPercent:F

    return v0
.end method

.method public final getRecoveryLevel()Lz51/k;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->recoveryLevel:Lz51/k;

    return-object v0
.end method

.method public final getRecoveryPercentage()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->recoveryPercentage:F

    return v0
.end method

.method public final getStrainScorePercentage()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->strainScorePercentage:F

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->optimalStrainPercent:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->lowerOptimalStrainFillValue:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->higherOptimalStrainFillValue:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->recoveryPercentage:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->recoveryLevel:Lz51/k;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->strainScorePercentage:F

    invoke-static {v0, v2, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->descriptionText:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->descriptionSubText:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-boolean v1, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->hasDivider:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget v0, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->optimalStrainPercent:F

    iget v1, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->lowerOptimalStrainFillValue:F

    iget v2, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->higherOptimalStrainFillValue:F

    iget v3, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->recoveryPercentage:F

    iget-object v4, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->recoveryLevel:Lz51/k;

    iget v5, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->strainScorePercentage:F

    iget-object v6, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->descriptionText:Lcom/whoop/design/util/TextResource;

    iget-object v7, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->descriptionSubText:Lcom/whoop/design/util/TextResource;

    iget-boolean v8, p0, Lcom/whoop/design/models/items/ExplainerGaugeModel;->hasDivider:Z

    const-string v9, ", lowerOptimalStrainFillValue="

    const-string v10, ", higherOptimalStrainFillValue="

    const-string v11, "ExplainerGaugeModel(optimalStrainPercent="

    invoke-static {v11, v0, v9, v1, v10}, Lb9/y;->t(Ljava/lang/String;FLjava/lang/String;FLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", recoveryPercentage="

    const-string v9, ", recoveryLevel="

    invoke-static {v0, v2, v1, v3, v9}, Lr;->u(Ljava/lang/StringBuilder;FLjava/lang/String;FLjava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", strainScorePercentage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", descriptionText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", descriptionSubText="

    const-string v2, ", hasDivider="

    invoke-static {v0, v6, v1, v7, v2}, Lq63/c;->y(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    const-string v1, ")"

    invoke-static {v0, v8, v1}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
