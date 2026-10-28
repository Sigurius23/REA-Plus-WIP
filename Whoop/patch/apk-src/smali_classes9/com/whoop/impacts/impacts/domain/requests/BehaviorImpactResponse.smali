.class public final Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse$$serializer;,
        Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000e\n\u0002\u0008\u0017\u0008\u0087\u0008\u0018\u0000 >2\u00020\u0001:\u0002?>B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eBQ\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&JL\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010*\u001a\u00020)H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u001a\u0010/\u001a\u00020\u00072\u0008\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u00101\u0012\u0004\u00083\u00104\u001a\u0004\u00082\u0010\u001eR \u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00105\u001a\u0004\u00086\u0010 R\u001a\u0010\u0008\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00107\u001a\u0004\u00088\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u00109\u001a\u0004\u0008:\u0010$R\"\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010;\u0012\u0004\u0008=\u00104\u001a\u0004\u0008<\u0010&\u00a8\u0006@"
    }
    d2 = {
        "Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;",
        "",
        "Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;",
        "behaviorImpactTitleTile",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "tiles",
        "",
        "journalEnabled",
        "",
        "cycleId",
        "Lcom/whoop/impacts/impacts/domain/requests/MetaData;",
        "metadata",
        "<init>",
        "(Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;Ljava/util/List;ZLjava/lang/Long;Lcom/whoop/impacts/impacts/domain/requests/MetaData;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;Ljava/util/List;ZLjava/lang/Long;Lcom/whoop/impacts/impacts/domain/requests/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$behavior_impact_release",
        "(Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Z",
        "component4",
        "()Ljava/lang/Long;",
        "component5",
        "()Lcom/whoop/impacts/impacts/domain/requests/MetaData;",
        "copy",
        "(Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;Ljava/util/List;ZLjava/lang/Long;Lcom/whoop/impacts/impacts/domain/requests/MetaData;)Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;",
        "getBehaviorImpactTitleTile",
        "getBehaviorImpactTitleTile$annotations",
        "()V",
        "Ljava/util/List;",
        "getTiles",
        "Z",
        "getJournalEnabled",
        "Ljava/lang/Long;",
        "getCycleId",
        "Lcom/whoop/impacts/impacts/domain/requests/MetaData;",
        "getMetadata",
        "getMetadata$annotations",
        "Companion",
        "$serializer",
        "behavior-impact_release"
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

.field public static final Companion:Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse$Companion;


# instance fields
.field private final behaviorImpactTitleTile:Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "header"
    .end annotation
.end field

.field private final cycleId:Ljava/lang/Long;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "cycle_id"
    .end annotation
.end field

.field private final journalEnabled:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "journal_enabled"
    .end annotation
.end field

.field private final metadata:Lcom/whoop/impacts/impacts/domain/requests/MetaData;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "metadata"
    .end annotation
.end field

.field private final tiles:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "tiles"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->Companion:Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lsl0/a1;

    const/16 v3, 0x15

    invoke-direct {v2, v3}, Lsl0/a1;-><init>(I)V

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

    sput-object v2, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;Ljava/util/List;ZLjava/lang/Long;Lcom/whoop/impacts/impacts/domain/requests/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse$$serializer;->INSTANCE:Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse$$serializer;

    invoke-virtual {p7}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->behaviorImpactTitleTile:Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;

    iput-object p3, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->tiles:Ljava/util/List;

    iput-boolean p4, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->journalEnabled:Z

    iput-object p5, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->cycleId:Ljava/lang/Long;

    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->metadata:Lcom/whoop/impacts/impacts/domain/requests/MetaData;

    return-void

    :cond_1
    iput-object p6, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->metadata:Lcom/whoop/impacts/impacts/domain/requests/MetaData;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;Ljava/util/List;ZLjava/lang/Long;Lcom/whoop/impacts/impacts/domain/requests/MetaData;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;Z",
            "Ljava/lang/Long;",
            "Lcom/whoop/impacts/impacts/domain/requests/MetaData;",
            ")V"
        }
    .end annotation

    const-string v0, "behaviorImpactTitleTile"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tiles"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->behaviorImpactTitleTile:Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;

    .line 4
    iput-object p2, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->tiles:Ljava/util/List;

    .line 5
    iput-boolean p3, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->journalEnabled:Z

    .line 6
    iput-object p4, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->cycleId:Ljava/lang/Long;

    .line 7
    iput-object p5, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->metadata:Lcom/whoop/impacts/impacts/domain/requests/MetaData;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;Ljava/util/List;ZLjava/lang/Long;Lcom/whoop/impacts/impacts/domain/requests/MetaData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 8
    invoke-direct/range {v0 .. v5}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;-><init>(Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;Ljava/util/List;ZLjava/lang/Long;Lcom/whoop/impacts/impacts/domain/requests/MetaData;)V

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 7

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    new-instance v1, Lwc3/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    new-instance v5, Lwc3/e;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    new-array v6, v3, [Ljava/lang/annotation/Annotation;

    invoke-direct {v5, v2, v6}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v2, v3, [Lwc3/c;

    invoke-direct {v1, v4, v5, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;Ljava/util/List;ZLjava/lang/Long;Lcom/whoop/impacts/impacts/domain/requests/MetaData;ILjava/lang/Object;)Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->behaviorImpactTitleTile:Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->tiles:Ljava/util/List;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-boolean p3, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->journalEnabled:Z

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->cycleId:Ljava/lang/Long;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->metadata:Lcom/whoop/impacts/impacts/domain/requests/MetaData;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->copy(Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;Ljava/util/List;ZLjava/lang/Long;Lcom/whoop/impacts/impacts/domain/requests/MetaData;)Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getBehaviorImpactTitleTile$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "header"
    .end annotation

    return-void
.end method

.method public static synthetic getMetadata$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "metadata"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$behavior_impact_release(Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader$$serializer;->INSTANCE:Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader$$serializer;

    iget-object v2, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->behaviorImpactTitleTile:Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->tiles:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x2

    iget-boolean v1, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->journalEnabled:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v0, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    iget-object v1, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->cycleId:Ljava/lang/Long;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->metadata:Lcom/whoop/impacts/impacts/domain/requests/MetaData;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/whoop/impacts/impacts/domain/requests/MetaData$$serializer;->INSTANCE:Lcom/whoop/impacts/impacts/domain/requests/MetaData$$serializer;

    iget-object p0, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->metadata:Lcom/whoop/impacts/impacts/domain/requests/MetaData;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->behaviorImpactTitleTile:Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->tiles:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->journalEnabled:Z

    return v0
.end method

.method public final component4()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->cycleId:Ljava/lang/Long;

    return-object v0
.end method

.method public final component5()Lcom/whoop/impacts/impacts/domain/requests/MetaData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->metadata:Lcom/whoop/impacts/impacts/domain/requests/MetaData;

    return-object v0
.end method

.method public final copy(Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;Ljava/util/List;ZLjava/lang/Long;Lcom/whoop/impacts/impacts/domain/requests/MetaData;)Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;Z",
            "Ljava/lang/Long;",
            "Lcom/whoop/impacts/impacts/domain/requests/MetaData;",
            ")",
            "Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;"
        }
    .end annotation

    const-string v0, "behaviorImpactTitleTile"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tiles"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;-><init>(Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;Ljava/util/List;ZLjava/lang/Long;Lcom/whoop/impacts/impacts/domain/requests/MetaData;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;

    iget-object v1, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->behaviorImpactTitleTile:Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;

    iget-object v3, p1, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->behaviorImpactTitleTile:Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->tiles:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->tiles:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->journalEnabled:Z

    iget-boolean v3, p1, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->journalEnabled:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->cycleId:Ljava/lang/Long;

    iget-object v3, p1, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->cycleId:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->metadata:Lcom/whoop/impacts/impacts/domain/requests/MetaData;

    iget-object p1, p1, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->metadata:Lcom/whoop/impacts/impacts/domain/requests/MetaData;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getBehaviorImpactTitleTile()Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->behaviorImpactTitleTile:Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;

    return-object v0
.end method

.method public final getCycleId()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->cycleId:Ljava/lang/Long;

    return-object v0
.end method

.method public final getJournalEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->journalEnabled:Z

    return v0
.end method

.method public final getMetadata()Lcom/whoop/impacts/impacts/domain/requests/MetaData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->metadata:Lcom/whoop/impacts/impacts/domain/requests/MetaData;

    return-object v0
.end method

.method public final getTiles()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->tiles:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->behaviorImpactTitleTile:Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;

    invoke-virtual {v0}, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->tiles:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->journalEnabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->cycleId:Ljava/lang/Long;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->metadata:Lcom/whoop/impacts/impacts/domain/requests/MetaData;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/impacts/impacts/domain/requests/MetaData;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->behaviorImpactTitleTile:Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;

    iget-object v1, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->tiles:Ljava/util/List;

    iget-boolean v2, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->journalEnabled:Z

    iget-object v3, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->cycleId:Ljava/lang/Long;

    iget-object v4, p0, Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;->metadata:Lcom/whoop/impacts/impacts/domain/requests/MetaData;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "BehaviorImpactResponse(behaviorImpactTitleTile="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", tiles="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", journalEnabled="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", cycleId="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", metadata="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
