.class public final Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel$$serializer;,
        Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u0000 72\u00020\u0001:\u000287B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBW\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001cJL\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u001cJ\u0010\u0010\'\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010)H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010.\u001a\u0004\u0008/\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010.\u001a\u0004\u00080\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00101\u001a\u0004\u00082\u0010\u001fR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00103\u001a\u0004\u00084\u0010!R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010.\u001a\u0004\u00085\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010.\u001a\u0004\u00086\u0010\u001c\u00a8\u00069"
    }
    d2 = {
        "Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "title",
        "value",
        "Lcom/whoop/design/models/items/ImpactStyle;",
        "style",
        "Lcom/whoop/design/models/items/ImpactBarSegmentModel;",
        "impactBarSegment",
        "behaviorImpactDescription",
        "ctaButtonLabel",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/ImpactBarSegmentModel;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/ImpactBarSegmentModel;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Lcom/whoop/design/models/items/ImpactStyle;",
        "component4",
        "()Lcom/whoop/design/models/items/ImpactBarSegmentModel;",
        "component5",
        "component6",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/ImpactBarSegmentModel;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitle",
        "getValue",
        "Lcom/whoop/design/models/items/ImpactStyle;",
        "getStyle",
        "Lcom/whoop/design/models/items/ImpactBarSegmentModel;",
        "getImpactBarSegment",
        "getBehaviorImpactDescription",
        "getCtaButtonLabel",
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

.field public static final Companion:Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel$Companion;


# instance fields
.field private final behaviorImpactDescription:Ljava/lang/String;

.field private final ctaButtonLabel:Ljava/lang/String;

.field private final impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

.field private final style:Lcom/whoop/design/models/items/ImpactStyle;

.field private final title:Ljava/lang/String;

.field private final value:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->Companion:Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel$Companion;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lw91/k;

    const/16 v3, 0x1d

    invoke-direct {v2, v3}, Lw91/k;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x6

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v0, v2, v3

    const/4 v0, 0x3

    aput-object v1, v2, v0

    const/4 v0, 0x4

    aput-object v1, v2, v0

    const/4 v0, 0x5

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/ImpactBarSegmentModel;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel$$serializer;

    invoke-virtual {p8}, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->value:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->style:Lcom/whoop/design/models/items/ImpactStyle;

    iput-object p5, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    iput-object p6, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->behaviorImpactDescription:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->ctaButtonLabel:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/ImpactBarSegmentModel;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "impactBarSegment"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "behaviorImpactDescription"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ctaButtonLabel"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->value:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->style:Lcom/whoop/design/models/items/ImpactStyle;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->behaviorImpactDescription:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->ctaButtonLabel:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.ImpactStyle"

    invoke-static {}, Lcom/whoop/design/models/items/ImpactStyle;->values()[Lcom/whoop/design/models/items/ImpactStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/ImpactBarSegmentModel;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->value:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->style:Lcom/whoop/design/models/items/ImpactStyle;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->behaviorImpactDescription:Ljava/lang/String;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->ctaButtonLabel:Ljava/lang/String;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/ImpactBarSegmentModel;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->value:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->style:Lcom/whoop/design/models/items/ImpactStyle;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/ImpactBarSegmentModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ImpactBarSegmentModel$$serializer;

    iget-object v1, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->behaviorImpactDescription:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x5

    iget-object p0, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->ctaButtonLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->value:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/items/ImpactStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->style:Lcom/whoop/design/models/items/ImpactStyle;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/ImpactBarSegmentModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->behaviorImpactDescription:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->ctaButtonLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/ImpactBarSegmentModel;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;
    .locals 8

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "impactBarSegment"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "behaviorImpactDescription"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ctaButtonLabel"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/ImpactBarSegmentModel;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->value:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->value:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->style:Lcom/whoop/design/models/items/ImpactStyle;

    iget-object v3, p1, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->style:Lcom/whoop/design/models/items/ImpactStyle;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->behaviorImpactDescription:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->behaviorImpactDescription:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->ctaButtonLabel:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->ctaButtonLabel:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getBehaviorImpactDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->behaviorImpactDescription:Ljava/lang/String;

    return-object v0
.end method

.method public final getCtaButtonLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->ctaButtonLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getImpactBarSegment()Lcom/whoop/design/models/items/ImpactBarSegmentModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    return-object v0
.end method

.method public final getStyle()Lcom/whoop/design/models/items/ImpactStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->style:Lcom/whoop/design/models/items/ImpactStyle;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->value:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->value:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->style:Lcom/whoop/design/models/items/ImpactStyle;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->behaviorImpactDescription:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->ctaButtonLabel:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->value:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->style:Lcom/whoop/design/models/items/ImpactStyle;

    iget-object v3, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    iget-object v4, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->behaviorImpactDescription:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/design/models/items/UnlockedImpactOnRecoveryModel;->ctaButtonLabel:Ljava/lang/String;

    const-string v6, ", value="

    const-string v7, ", style="

    const-string v8, "UnlockedImpactOnRecoveryModel(title="

    invoke-static {v8, v0, v6, v1, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", impactBarSegment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", behaviorImpactDescription="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", ctaButtonLabel="

    const-string v2, ")"

    invoke-static {v0, v4, v1, v5, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
