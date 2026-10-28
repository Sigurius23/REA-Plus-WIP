.class public final Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse$$serializer;,
        Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u0000 <2\u00020\u0001:\u0002=<BA\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eBS\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0016\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&JN\u0010\'\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010\u001eJ\u0010\u0010*\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u001a\u0010.\u001a\u00020-2\u0008\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00100\u001a\u0004\u00081\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00102\u001a\u0004\u00083\u0010 R\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00104\u001a\u0004\u00085\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00106\u001a\u0004\u00087\u0010$R\"\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u00108\u0012\u0004\u0008:\u0010;\u001a\u0004\u00089\u0010&\u00a8\u0006>"
    }
    d2 = {
        "Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;",
        "",
        "",
        "analyticsId",
        "Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;",
        "header",
        "",
        "Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSection;",
        "sections",
        "Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;",
        "footer",
        "Lcom/whoop/impacts/details/domain/requests/MetaData;",
        "metadata",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;Ljava/util/List;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;Lcom/whoop/impacts/details/domain/requests/MetaData;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;Ljava/util/List;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;Lcom/whoop/impacts/details/domain/requests/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$behavior_impact_release",
        "(Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;",
        "component3",
        "()Ljava/util/List;",
        "component4",
        "()Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;",
        "component5",
        "()Lcom/whoop/impacts/details/domain/requests/MetaData;",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;Ljava/util/List;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;Lcom/whoop/impacts/details/domain/requests/MetaData;)Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getAnalyticsId",
        "Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;",
        "getHeader",
        "Ljava/util/List;",
        "getSections",
        "Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;",
        "getFooter",
        "Lcom/whoop/impacts/details/domain/requests/MetaData;",
        "getMetadata",
        "getMetadata$annotations",
        "()V",
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

.field public static final Companion:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse$Companion;


# instance fields
.field private final analyticsId:Ljava/lang/String;

.field private final footer:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;

.field private final header:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;

.field private final metadata:Lcom/whoop/impacts/details/domain/requests/MetaData;

.field private final sections:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSection;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->Companion:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Ljp1/p;

    invoke-direct {v3, v0}, Ljp1/p;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    new-instance v3, Ljp1/p;

    const/16 v4, 0x9

    invoke-direct {v3, v4}, Ljp1/p;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/4 v3, 0x5

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v0, v3, v4

    const/4 v0, 0x3

    aput-object v1, v3, v0

    const/4 v0, 0x4

    aput-object v2, v3, v0

    sput-object v3, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;Ljava/util/List;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;Lcom/whoop/impacts/details/domain/requests/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x6

    const/4 v0, 0x6

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse$$serializer;->INSTANCE:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse$$serializer;

    invoke-virtual {p7}, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p7, p1, 0x1

    const/4 v0, 0x0

    if-nez p7, :cond_1

    iput-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->analyticsId:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p2, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->analyticsId:Ljava/lang/String;

    :goto_0
    iput-object p3, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->header:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;

    iput-object p4, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->sections:Ljava/util/List;

    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_2

    iput-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->footer:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;

    goto :goto_1

    :cond_2
    iput-object p5, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->footer:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;

    :goto_1
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_3

    iput-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->metadata:Lcom/whoop/impacts/details/domain/requests/MetaData;

    return-void

    :cond_3
    iput-object p6, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->metadata:Lcom/whoop/impacts/details/domain/requests/MetaData;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;Ljava/util/List;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;Lcom/whoop/impacts/details/domain/requests/MetaData;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;",
            "Ljava/util/List<",
            "Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSection;",
            ">;",
            "Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;",
            "Lcom/whoop/impacts/details/domain/requests/MetaData;",
            ")V"
        }
    .end annotation

    const-string v0, "header"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sections"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->analyticsId:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->header:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;

    .line 5
    iput-object p3, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->sections:Ljava/util/List;

    .line 6
    iput-object p4, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->footer:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;

    .line 7
    iput-object p5, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->metadata:Lcom/whoop/impacts/details/domain/requests/MetaData;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;Ljava/util/List;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;Lcom/whoop/impacts/details/domain/requests/MetaData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_1

    move-object p4, v0

    :cond_1
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_2

    move-object p6, v0

    :goto_0
    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_2
    move-object p6, p5

    goto :goto_0

    .line 8
    :goto_1
    invoke-direct/range {p1 .. p6}, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;-><init>(Ljava/lang/String;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;Ljava/util/List;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;Lcom/whoop/impacts/details/domain/requests/MetaData;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSection$$serializer;->INSTANCE:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSection$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 4

    new-instance v0, Lwc3/a;

    const-class v1, Lcom/whoop/impacts/details/domain/requests/MetaData;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    sget-object v2, Lcom/whoop/impacts/details/domain/requests/MetaData$$serializer;->INSTANCE:Lcom/whoop/impacts/details/domain/requests/MetaData$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Lwc3/c;

    invoke-direct {v0, v1, v2, v3}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;Ljava/lang/String;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;Ljava/util/List;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;Lcom/whoop/impacts/details/domain/requests/MetaData;ILjava/lang/Object;)Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->analyticsId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->header:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->sections:Ljava/util/List;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->footer:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->metadata:Lcom/whoop/impacts/details/domain/requests/MetaData;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->copy(Ljava/lang/String;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;Ljava/util/List;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;Lcom/whoop/impacts/details/domain/requests/MetaData;)Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getMetadata$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$behavior_impact_release(Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->analyticsId:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->analyticsId:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    sget-object v1, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader$$serializer;->INSTANCE:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader$$serializer;

    iget-object v2, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->header:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->sections:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->footer:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter$$serializer;->INSTANCE:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter$$serializer;

    iget-object v3, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->footer:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->metadata:Lcom/whoop/impacts/details/domain/requests/MetaData;

    if-eqz v2, :cond_5

    :goto_2
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->metadata:Lcom/whoop/impacts/details/domain/requests/MetaData;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->analyticsId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->header:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSection;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->sections:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->footer:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;

    return-object v0
.end method

.method public final component5()Lcom/whoop/impacts/details/domain/requests/MetaData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->metadata:Lcom/whoop/impacts/details/domain/requests/MetaData;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;Ljava/util/List;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;Lcom/whoop/impacts/details/domain/requests/MetaData;)Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;",
            "Ljava/util/List<",
            "Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSection;",
            ">;",
            "Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;",
            "Lcom/whoop/impacts/details/domain/requests/MetaData;",
            ")",
            "Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;"
        }
    .end annotation

    const-string v0, "header"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sections"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;-><init>(Ljava/lang/String;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;Ljava/util/List;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;Lcom/whoop/impacts/details/domain/requests/MetaData;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;

    iget-object v1, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->analyticsId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->analyticsId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->header:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;

    iget-object v3, p1, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->header:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->sections:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->sections:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->footer:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;

    iget-object v3, p1, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->footer:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->metadata:Lcom/whoop/impacts/details/domain/requests/MetaData;

    iget-object p1, p1, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->metadata:Lcom/whoop/impacts/details/domain/requests/MetaData;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAnalyticsId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->analyticsId:Ljava/lang/String;

    return-object v0
.end method

.method public final getFooter()Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->footer:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;

    return-object v0
.end method

.method public final getHeader()Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->header:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;

    return-object v0
.end method

.method public final getMetadata()Lcom/whoop/impacts/details/domain/requests/MetaData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->metadata:Lcom/whoop/impacts/details/domain/requests/MetaData;

    return-object v0
.end method

.method public final getSections()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSection;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->sections:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->analyticsId:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->header:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;

    invoke-virtual {v3}, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->sections:Ljava/util/List;

    invoke-static {v3, v2, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->footer:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->metadata:Lcom/whoop/impacts/details/domain/requests/MetaData;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/impacts/details/domain/requests/MetaData;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->analyticsId:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->header:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;

    iget-object v2, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->sections:Ljava/util/List;

    iget-object v3, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->footer:Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;

    iget-object v4, p0, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;->metadata:Lcom/whoop/impacts/details/domain/requests/MetaData;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "BehaviorDetailsResponse(analyticsId="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", header="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sections="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", footer="

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
