.class public final Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader$$serializer;,
        Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 <2\u00020\u0001:\u0002=<BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eBa\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001eJ\u0010\u0010$\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'JX\u0010(\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010%J\u0010\u0010+\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u001a\u0010/\u001a\u00020.2\u0008\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00101\u001a\u0004\u00082\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00101\u001a\u0004\u00083\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00101\u001a\u0004\u00084\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00105\u001a\u0004\u00086\u0010\"R\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00101\u001a\u0004\u00087\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00108\u001a\u0004\u00089\u0010%R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010:\u001a\u0004\u0008;\u0010\'\u00a8\u0006>"
    }
    d2 = {
        "Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;",
        "",
        "Lcom/whoop/design/util/TextResource;",
        "detailsTitleDisplay",
        "detailsSubtitleDisplay",
        "detailsTagLabelDisplay",
        "Lcom/whoop/design/models/items/ImpactStyle;",
        "detailsImpactStyle",
        "detailsImpactValueDisplay",
        "",
        "detailsImageDisplay",
        "Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader;",
        "subHeader",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$behavior_impact_release",
        "(Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/design/util/TextResource;",
        "component2",
        "component3",
        "component4",
        "()Lcom/whoop/design/models/items/ImpactStyle;",
        "component5",
        "component6",
        "()Ljava/lang/String;",
        "component7",
        "()Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader;",
        "copy",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader;)Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/util/TextResource;",
        "getDetailsTitleDisplay",
        "getDetailsSubtitleDisplay",
        "getDetailsTagLabelDisplay",
        "Lcom/whoop/design/models/items/ImpactStyle;",
        "getDetailsImpactStyle",
        "getDetailsImpactValueDisplay",
        "Ljava/lang/String;",
        "getDetailsImageDisplay",
        "Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader;",
        "getSubHeader",
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

.field public static final Companion:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader$Companion;


# instance fields
.field private final detailsImageDisplay:Ljava/lang/String;

.field private final detailsImpactStyle:Lcom/whoop/design/models/items/ImpactStyle;

.field private final detailsImpactValueDisplay:Lcom/whoop/design/util/TextResource;

.field private final detailsSubtitleDisplay:Lcom/whoop/design/util/TextResource;

.field private final detailsTagLabelDisplay:Lcom/whoop/design/util/TextResource;

.field private final detailsTitleDisplay:Lcom/whoop/design/util/TextResource;

.field private final subHeader:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->Companion:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ljp1/p;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Ljp1/p;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    new-array v2, v3, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v0, v2, v3

    const/4 v0, 0x4

    aput-object v1, v2, v0

    const/4 v0, 0x5

    aput-object v1, v2, v0

    const/4 v0, 0x6

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader$$serializer;->INSTANCE:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader$$serializer;

    invoke-virtual {p9}, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsTitleDisplay:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsSubtitleDisplay:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsTagLabelDisplay:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsImpactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    iput-object p6, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsImpactValueDisplay:Lcom/whoop/design/util/TextResource;

    iput-object p7, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsImageDisplay:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->subHeader:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader;)V
    .locals 1

    const-string v0, "detailsTitleDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detailsSubtitleDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detailsTagLabelDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detailsImpactStyle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detailsImpactValueDisplay"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detailsImageDisplay"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsTitleDisplay:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-object p2, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsSubtitleDisplay:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-object p3, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsTagLabelDisplay:Lcom/whoop/design/util/TextResource;

    .line 6
    iput-object p4, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsImpactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    .line 7
    iput-object p5, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsImpactValueDisplay:Lcom/whoop/design/util/TextResource;

    .line 8
    iput-object p6, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsImageDisplay:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->subHeader:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader;

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

    invoke-static {}, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader;ILjava/lang/Object;)Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsTitleDisplay:Lcom/whoop/design/util/TextResource;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsSubtitleDisplay:Lcom/whoop/design/util/TextResource;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsTagLabelDisplay:Lcom/whoop/design/util/TextResource;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsImpactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsImpactValueDisplay:Lcom/whoop/design/util/TextResource;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsImageDisplay:Ljava/lang/String;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->subHeader:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader;)Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$behavior_impact_release(Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->$childSerializers:[Ll83/h;

    sget-object v1, Lmd1/a;->a:Lmd1/a;

    iget-object v2, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsTitleDisplay:Lcom/whoop/design/util/TextResource;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsSubtitleDisplay:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsTagLabelDisplay:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsImpactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x4

    iget-object v2, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsImpactValueDisplay:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x5

    iget-object v1, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsImageDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader$$serializer;->INSTANCE:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader$$serializer;

    iget-object p0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->subHeader:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader;

    const/4 v1, 0x6

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsTitleDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsSubtitleDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsTagLabelDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/ImpactStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsImpactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsImpactValueDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsImageDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->subHeader:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader;)Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;
    .locals 9

    const-string v0, "detailsTitleDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detailsSubtitleDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detailsTagLabelDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detailsImpactStyle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detailsImpactValueDisplay"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detailsImageDisplay"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;

    iget-object v1, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsTitleDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsTitleDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsSubtitleDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsSubtitleDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsTagLabelDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsTagLabelDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsImpactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    iget-object v3, p1, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsImpactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsImpactValueDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsImpactValueDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsImageDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsImageDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->subHeader:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader;

    iget-object p1, p1, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->subHeader:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getDetailsImageDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsImageDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getDetailsImpactStyle()Lcom/whoop/design/models/items/ImpactStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsImpactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    return-object v0
.end method

.method public final getDetailsImpactValueDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsImpactValueDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getDetailsSubtitleDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsSubtitleDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getDetailsTagLabelDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsTagLabelDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getDetailsTitleDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsTitleDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getSubHeader()Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->subHeader:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsTitleDisplay:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsSubtitleDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsTagLabelDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsImpactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsImpactValueDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v2, v0, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsImageDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->subHeader:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsTitleDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsSubtitleDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsTagLabelDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsImpactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    iget-object v4, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsImpactValueDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v5, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->detailsImageDisplay:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->subHeader:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader;

    const-string v7, ", detailsSubtitleDisplay="

    const-string v8, ", detailsTagLabelDisplay="

    const-string v9, "BehaviorDetailsHeader(detailsTitleDisplay="

    invoke-static {v9, v0, v7, v1, v8}, Lte0/d;->q(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", detailsImpactStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", detailsImpactValueDisplay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", detailsImageDisplay="

    const-string v2, ", subHeader="

    invoke-static {v0, v4, v1, v5, v2}, Lq63/c;->z(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
