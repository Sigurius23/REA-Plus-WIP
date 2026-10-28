.class public final Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/advancedlabs/domain/models/SchedulePillModel$$serializer;,
        Lcom/whoop/advancedlabs/domain/models/SchedulePillModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u0000 72\u00020\u0001:\u000287B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000c\u0010\rBS\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$JJ\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010.\u001a\u0004\u0008/\u0010\u001dR\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00100\u001a\u0004\u00081\u0010\u001fR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00102\u001a\u0004\u00083\u0010!R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010.\u001a\u0004\u00084\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00105\u001a\u0004\u00086\u0010$\u00a8\u00069"
    }
    d2 = {
        "Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;",
        "",
        "",
        "selectionDisplay",
        "",
        "Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;",
        "scheduleTiles",
        "Lcom/whoop/design/models/DateDisplay;",
        "dateDisplay",
        "style",
        "Lcom/whoop/design/models/InfoCalloutTileModel;",
        "infoCallout",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DateDisplay;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DateDisplay;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$advanced_labs_release",
        "(Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Lcom/whoop/design/models/DateDisplay;",
        "component4",
        "component5",
        "()Lcom/whoop/design/models/InfoCalloutTileModel;",
        "copy",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DateDisplay;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;)Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getSelectionDisplay",
        "Ljava/util/List;",
        "getScheduleTiles",
        "Lcom/whoop/design/models/DateDisplay;",
        "getDateDisplay",
        "getStyle",
        "Lcom/whoop/design/models/InfoCalloutTileModel;",
        "getInfoCallout",
        "Companion",
        "$serializer",
        "advanced-labs_release"
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

.field public static final Companion:Lcom/whoop/advancedlabs/domain/models/SchedulePillModel$Companion;


# instance fields
.field private final dateDisplay:Lcom/whoop/design/models/DateDisplay;

.field private final infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

.field private final scheduleTiles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;",
            ">;"
        }
    .end annotation
.end field

.field private final selectionDisplay:Ljava/lang/String;

.field private final style:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->Companion:Lcom/whoop/advancedlabs/domain/models/SchedulePillModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ltb0/a;

    const/16 v3, 0x14

    invoke-direct {v2, v3}, Ltb0/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x5

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const/4 v0, 0x3

    aput-object v1, v2, v0

    const/4 v0, 0x4

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DateDisplay;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/SchedulePillModel$$serializer;

    invoke-virtual {p7}, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->selectionDisplay:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->scheduleTiles:Ljava/util/List;

    iput-object p4, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->dateDisplay:Lcom/whoop/design/models/DateDisplay;

    iput-object p5, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->style:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DateDisplay;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;",
            ">;",
            "Lcom/whoop/design/models/DateDisplay;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/InfoCalloutTileModel;",
            ")V"
        }
    .end annotation

    const-string v0, "selectionDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduleTiles"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->selectionDisplay:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->scheduleTiles:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->dateDisplay:Lcom/whoop/design/models/DateDisplay;

    .line 6
    iput-object p4, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->style:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DateDisplay;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;ILjava/lang/Object;)Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->selectionDisplay:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->scheduleTiles:Ljava/util/List;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->dateDisplay:Lcom/whoop/design/models/DateDisplay;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->style:Ljava/lang/String;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DateDisplay;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;)Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$advanced_labs_release(Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->selectionDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->scheduleTiles:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/DateDisplay$$serializer;->INSTANCE:Lcom/whoop/design/models/DateDisplay$$serializer;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->dateDisplay:Lcom/whoop/design/models/DateDisplay;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->style:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;

    iget-object p0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    const/4 v1, 0x4

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->selectionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->scheduleTiles:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/DateDisplay;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->dateDisplay:Lcom/whoop/design/models/DateDisplay;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/InfoCalloutTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DateDisplay;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;)Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;",
            ">;",
            "Lcom/whoop/design/models/DateDisplay;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/InfoCalloutTileModel;",
            ")",
            "Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;"
        }
    .end annotation

    const-string v0, "selectionDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduleTiles"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DateDisplay;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->selectionDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->selectionDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->scheduleTiles:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->scheduleTiles:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->dateDisplay:Lcom/whoop/design/models/DateDisplay;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->dateDisplay:Lcom/whoop/design/models/DateDisplay;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->style:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->style:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    iget-object p1, p1, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getDateDisplay()Lcom/whoop/design/models/DateDisplay;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->dateDisplay:Lcom/whoop/design/models/DateDisplay;

    return-object v0
.end method

.method public final getInfoCallout()Lcom/whoop/design/models/InfoCalloutTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-object v0
.end method

.method public final getScheduleTiles()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->scheduleTiles:Ljava/util/List;

    return-object v0
.end method

.method public final getSelectionDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->selectionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->style:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->selectionDisplay:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->scheduleTiles:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->dateDisplay:Lcom/whoop/design/models/DateDisplay;

    invoke-virtual {v2}, Lcom/whoop/design/models/DateDisplay;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->style:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/design/models/InfoCalloutTileModel;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->selectionDisplay:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->scheduleTiles:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->dateDisplay:Lcom/whoop/design/models/DateDisplay;

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->style:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    const-string v5, ", scheduleTiles="

    const-string v6, ", dateDisplay="

    const-string v7, "SchedulePillModel(selectionDisplay="

    invoke-static {v7, v0, v5, v6, v1}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", style="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", infoCallout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
