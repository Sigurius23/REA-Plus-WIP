.class public final Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard$$serializer;,
        Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u0000 ?2\u00020\u0001:\u0002@?BU\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fBk\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001fJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u001fJ\u0012\u0010\'\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\u001fJ\u0012\u0010(\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)Jn\u0010*\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00c6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u001a\u00101\u001a\u0002002\u0008\u0010/\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00081\u00102R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00103\u001a\u0004\u00084\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00105\u001a\u0004\u00086\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00107\u001a\u0004\u00088\u0010#R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00103\u001a\u0004\u00089\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00103\u001a\u0004\u0008:\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00103\u001a\u0004\u0008;\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00103\u001a\u0004\u0008<\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010=\u001a\u0004\u0008>\u0010)\u00a8\u0006A"
    }
    d2 = {
        "Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;",
        "",
        "",
        "titleDisplay",
        "Lcom/whoop/design/models/items/ImpactStyle;",
        "impactStyle",
        "Lcom/whoop/design/models/items/TileTagModel;",
        "tileTag",
        "impactPercentageValue",
        "impactPercentageSymbol",
        "subBarLabel",
        "subBarPercent",
        "Lcom/whoop/design/models/items/ImpactBarSegmentModel;",
        "impactBarSegment",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/TileTagModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactBarSegmentModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/TileTagModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactBarSegmentModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/design/models/items/ImpactStyle;",
        "component3",
        "()Lcom/whoop/design/models/items/TileTagModel;",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "()Lcom/whoop/design/models/items/ImpactBarSegmentModel;",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/TileTagModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactBarSegmentModel;)Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitleDisplay",
        "Lcom/whoop/design/models/items/ImpactStyle;",
        "getImpactStyle",
        "Lcom/whoop/design/models/items/TileTagModel;",
        "getTileTag",
        "getImpactPercentageValue",
        "getImpactPercentageSymbol",
        "getSubBarLabel",
        "getSubBarPercent",
        "Lcom/whoop/design/models/items/ImpactBarSegmentModel;",
        "getImpactBarSegment",
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

.field public static final Companion:Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard$Companion;


# instance fields
.field private final impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

.field private final impactPercentageSymbol:Ljava/lang/String;

.field private final impactPercentageValue:Ljava/lang/String;

.field private final impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

.field private final subBarLabel:Ljava/lang/String;

.field private final subBarPercent:Ljava/lang/String;

.field private final tileTag:Lcom/whoop/design/models/items/TileTagModel;

.field private final titleDisplay:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->Companion:Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard$Companion;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lw91/a;

    const/16 v3, 0x8

    invoke-direct {v2, v3}, Lw91/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    new-array v2, v3, [Ll83/h;

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

    const/4 v0, 0x5

    aput-object v1, v2, v0

    const/4 v0, 0x6

    aput-object v1, v2, v0

    const/4 v0, 0x7

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/TileTagModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactBarSegmentModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p10, p1, 0xff

    const/16 v0, 0xff

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard$$serializer;->INSTANCE:Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard$$serializer;

    invoke-virtual {p10}, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->titleDisplay:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    iput-object p4, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->tileTag:Lcom/whoop/design/models/items/TileTagModel;

    iput-object p5, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactPercentageValue:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactPercentageSymbol:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->subBarLabel:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->subBarPercent:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/TileTagModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactBarSegmentModel;)V
    .locals 1

    const-string v0, "impactStyle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->titleDisplay:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->tileTag:Lcom/whoop/design/models/items/TileTagModel;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactPercentageValue:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactPercentageSymbol:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->subBarLabel:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->subBarPercent:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

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

    invoke-static {}, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/TileTagModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactBarSegmentModel;ILjava/lang/Object;)Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->titleDisplay:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->tileTag:Lcom/whoop/design/models/items/TileTagModel;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactPercentageValue:Ljava/lang/String;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactPercentageSymbol:Ljava/lang/String;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->subBarLabel:Ljava/lang/String;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->subBarPercent:Ljava/lang/String;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->copy(Ljava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/TileTagModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactBarSegmentModel;)Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->$childSerializers:[Ll83/h;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->titleDisplay:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/TileTagModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TileTagModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->tileTag:Lcom/whoop/design/models/items/TileTagModel;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x3

    iget-object v2, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactPercentageValue:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x4

    iget-object v2, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactPercentageSymbol:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x5

    iget-object v2, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->subBarLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x6

    iget-object v2, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->subBarPercent:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/ImpactBarSegmentModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ImpactBarSegmentModel$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    const/4 v1, 0x7

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/items/ImpactStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/items/TileTagModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->tileTag:Lcom/whoop/design/models/items/TileTagModel;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactPercentageValue:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactPercentageSymbol:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->subBarLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->subBarPercent:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/models/items/ImpactBarSegmentModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/TileTagModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactBarSegmentModel;)Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;
    .locals 10

    const-string v0, "impactStyle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;-><init>(Ljava/lang/String;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/models/items/TileTagModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactBarSegmentModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;

    iget-object v1, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->titleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->titleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    iget-object v3, p1, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->tileTag:Lcom/whoop/design/models/items/TileTagModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->tileTag:Lcom/whoop/design/models/items/TileTagModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactPercentageValue:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactPercentageValue:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactPercentageSymbol:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactPercentageSymbol:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->subBarLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->subBarLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->subBarPercent:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->subBarPercent:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    iget-object p1, p1, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getImpactBarSegment()Lcom/whoop/design/models/items/ImpactBarSegmentModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    return-object v0
.end method

.method public final getImpactPercentageSymbol()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactPercentageSymbol:Ljava/lang/String;

    return-object v0
.end method

.method public final getImpactPercentageValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactPercentageValue:Ljava/lang/String;

    return-object v0
.end method

.method public final getImpactStyle()Lcom/whoop/design/models/items/ImpactStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    return-object v0
.end method

.method public final getSubBarLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->subBarLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubBarPercent()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->subBarPercent:Ljava/lang/String;

    return-object v0
.end method

.method public final getTileTag()Lcom/whoop/design/models/items/TileTagModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->tileTag:Lcom/whoop/design/models/items/TileTagModel;

    return-object v0
.end method

.method public final getTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->titleDisplay:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->tileTag:Lcom/whoop/design/models/items/TileTagModel;

    if-nez v0, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/design/models/items/TileTagModel;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactPercentageValue:Ljava/lang/String;

    if-nez v0, :cond_2

    move v0, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactPercentageSymbol:Ljava/lang/String;

    if-nez v0, :cond_3

    move v0, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->subBarLabel:Ljava/lang/String;

    if-nez v0, :cond_4

    move v0, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_4
    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->subBarPercent:Ljava/lang/String;

    if-nez v0, :cond_5

    move v0, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_5
    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    if-nez v0, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v0}, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v2, v1

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->titleDisplay:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    iget-object v2, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->tileTag:Lcom/whoop/design/models/items/TileTagModel;

    iget-object v3, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactPercentageValue:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactPercentageSymbol:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->subBarLabel:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->subBarPercent:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;->impactBarSegment:Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "BehaviorDetailsTileImpactCard(titleDisplay="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", impactStyle="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", tileTag="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", impactPercentageValue="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", impactPercentageSymbol="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", subBarLabel="

    const-string v1, ", subBarPercent="

    invoke-static {v8, v4, v0, v5, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", impactBarSegment="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
