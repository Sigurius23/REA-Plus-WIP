.class public final Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel$$serializer;,
        Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0081\u0008\u0018\u0000 72\u00020\u0001:\u000287BE\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBS\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\"JN\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u001eJ\u0010\u0010\'\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010)H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010.\u001a\u0004\u0008/\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00100\u001a\u0004\u00081\u0010\u001eR\u001d\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00102\u001a\u0004\u00083\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00104\u001a\u0004\u00085\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00104\u001a\u0004\u00086\u0010\"\u00a8\u00069"
    }
    d2 = {
        "Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;",
        "header",
        "",
        "body",
        "",
        "items",
        "",
        "latestProcessedTimestamp",
        "trailingEcgTimeStamp",
        "<init>",
        "(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$kennel_release",
        "(Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "()Ljava/util/List;",
        "component4",
        "()Ljava/lang/Long;",
        "component5",
        "copy",
        "(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;",
        "getHeader",
        "Ljava/lang/String;",
        "getBody",
        "Ljava/util/List;",
        "getItems",
        "Ljava/lang/Long;",
        "getLatestProcessedTimestamp",
        "getTrailingEcgTimeStamp",
        "Companion",
        "$serializer",
        "kennel_release"
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

.field public static final Companion:Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel$Companion;


# instance fields
.field private final body:Ljava/lang/String;

.field private final header:Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final latestProcessedTimestamp:Ljava/lang/Long;

.field private final trailingEcgTimeStamp:Ljava/lang/Long;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->Companion:Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lwi0/d;

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Lwi0/d;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x5

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

    sput-object v2, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;-><init>(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 7

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p7, p1, 0x1

    if-nez p7, :cond_0

    .line 3
    new-instance v0, Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 4
    iput-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->header:Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->header:Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    const/4 p7, 0x0

    if-nez p2, :cond_1

    iput-object p7, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->body:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->body:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    .line 5
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 6
    iput-object p2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->items:Ljava/util/List;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->items:Ljava/util/List;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object p7, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->latestProcessedTimestamp:Ljava/lang/Long;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->latestProcessedTimestamp:Ljava/lang/Long;

    :goto_3
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_4

    iput-object p7, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->trailingEcgTimeStamp:Ljava/lang/Long;

    return-void

    :cond_4
    iput-object p6, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->trailingEcgTimeStamp:Ljava/lang/Long;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ")V"
        }
    .end annotation

    const-string v0, "header"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->header:Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    .line 9
    iput-object p2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->body:Ljava/lang/String;

    .line 10
    iput-object p3, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->items:Ljava/util/List;

    .line 11
    iput-object p4, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->latestProcessedTimestamp:Ljava/lang/Long;

    .line 12
    iput-object p5, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->trailingEcgTimeStamp:Ljava/lang/Long;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    .line 13
    new-instance v0, Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    .line 14
    sget-object p3, Lm83/y;->w:Lm83/y;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    move-object p6, v0

    :goto_0
    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_4
    move-object p6, p5

    goto :goto_0

    .line 15
    :goto_1
    invoke-direct/range {p1 .. p6}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;-><init>(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)V

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

    invoke-static {}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;ILjava/lang/Object;)Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->header:Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->body:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->items:Ljava/util/List;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->latestProcessedTimestamp:Ljava/lang/Long;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->trailingEcgTimeStamp:Ljava/lang/Long;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->copy(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$kennel_release(Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;Lzc3/c;Lyc3/g;)V
    .locals 10

    sget-object v0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->header:Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    new-instance v3, Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    const/16 v8, 0xf

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    sget-object v2, Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel$$serializer;->INSTANCE:Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel$$serializer;

    iget-object v3, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->header:Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->body:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->body:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->items:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :goto_2
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->items:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->latestProcessedTimestamp:Ljava/lang/Long;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->latestProcessedTimestamp:Ljava/lang/Long;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->trailingEcgTimeStamp:Ljava/lang/Long;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    iget-object p0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->trailingEcgTimeStamp:Ljava/lang/Long;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->header:Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->body:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->items:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->latestProcessedTimestamp:Ljava/lang/Long;

    return-object v0
.end method

.method public final component5()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->trailingEcgTimeStamp:Ljava/lang/Long;

    return-object v0
.end method

.method public final copy(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ")",
            "Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;"
        }
    .end annotation

    const-string v0, "header"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;-><init>(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;

    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->header:Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    iget-object v3, p1, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->header:Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->body:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->body:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->items:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->items:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->latestProcessedTimestamp:Ljava/lang/Long;

    iget-object v3, p1, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->latestProcessedTimestamp:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->trailingEcgTimeStamp:Ljava/lang/Long;

    iget-object p1, p1, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->trailingEcgTimeStamp:Ljava/lang/Long;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->body:Ljava/lang/String;

    return-object v0
.end method

.method public final getHeader()Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->header:Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    return-object v0
.end method

.method public final getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getLatestProcessedTimestamp()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->latestProcessedTimestamp:Ljava/lang/Long;

    return-object v0
.end method

.method public final getTrailingEcgTimeStamp()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->trailingEcgTimeStamp:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->header:Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    invoke-virtual {v0}, Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->body:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->items:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->latestProcessedTimestamp:Ljava/lang/Long;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->trailingEcgTimeStamp:Ljava/lang/Long;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->header:Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->body:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->items:Ljava/util/List;

    iget-object v3, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->latestProcessedTimestamp:Ljava/lang/Long;

    iget-object v4, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->trailingEcgTimeStamp:Ljava/lang/Long;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "ShepherdDetectionModel(header="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", body="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", items="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", latestProcessedTimestamp="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", trailingEcgTimeStamp="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
