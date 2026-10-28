.class public final Lcom/whoop/health/domain/models/DataVisualizationCardModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/health/domain/models/DataVisualizationCardModel$$serializer;,
        Lcom/whoop/health/domain/models/DataVisualizationCardModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0081\u0008\u0018\u0000 62\u00020\u0001:\u000276B9\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bBI\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!JB\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010%\u001a\u00020$H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010)H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010.\u001a\u0004\u0008/\u0010\u001bR\u001d\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00100\u001a\u0004\u00081\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00102\u001a\u0004\u00083\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00104\u001a\u0004\u00085\u0010!\u00a8\u00068"
    }
    d2 = {
        "Lcom/whoop/health/domain/models/DataVisualizationCardModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/health/domain/models/DataVisHeaderModel;",
        "header",
        "",
        "items",
        "Lcom/whoop/navigation/e;",
        "navigation",
        "Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;",
        "heartScreenerUpdatedAtInfo",
        "<init>",
        "(Lcom/whoop/health/domain/models/DataVisHeaderModel;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/health/domain/models/DataVisHeaderModel;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$health_release",
        "(Lcom/whoop/health/domain/models/DataVisualizationCardModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/health/domain/models/DataVisHeaderModel;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Lcom/whoop/navigation/e;",
        "component4",
        "()Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;",
        "copy",
        "(Lcom/whoop/health/domain/models/DataVisHeaderModel;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;)Lcom/whoop/health/domain/models/DataVisualizationCardModel;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/health/domain/models/DataVisHeaderModel;",
        "getHeader",
        "Ljava/util/List;",
        "getItems",
        "Lcom/whoop/navigation/e;",
        "getNavigation",
        "Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;",
        "getHeartScreenerUpdatedAtInfo",
        "Companion",
        "$serializer",
        "health_release"
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

.field public static final Companion:Lcom/whoop/health/domain/models/DataVisualizationCardModel$Companion;


# instance fields
.field private final header:Lcom/whoop/health/domain/models/DataVisHeaderModel;

.field private final heartScreenerUpdatedAtInfo:Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final navigation:Lcom/whoop/navigation/e;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/health/domain/models/DataVisualizationCardModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/health/domain/models/DataVisualizationCardModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->Companion:Lcom/whoop/health/domain/models/DataVisualizationCardModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lsh2/d;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Lsh2/d;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v4, Lsh2/d;

    const/4 v5, 0x3

    invoke-direct {v4, v5}, Lsh2/d;-><init>(I)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v4, 0x4

    new-array v4, v4, [Ll83/h;

    const/4 v6, 0x0

    aput-object v1, v4, v6

    const/4 v6, 0x1

    aput-object v2, v4, v6

    aput-object v0, v4, v3

    aput-object v1, v4, v5

    sput-object v4, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/whoop/health/domain/models/DataVisualizationCardModel;-><init>(Lcom/whoop/health/domain/models/DataVisHeaderModel;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/health/domain/models/DataVisHeaderModel;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 6

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p6, p1, 0x1

    if-nez p6, :cond_0

    .line 3
    new-instance v0, Lcom/whoop/health/domain/models/DataVisHeaderModel;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/health/domain/models/DataVisHeaderModel;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 4
    iput-object v0, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->header:Lcom/whoop/health/domain/models/DataVisHeaderModel;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->header:Lcom/whoop/health/domain/models/DataVisHeaderModel;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    .line 5
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 6
    iput-object p2, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->items:Ljava/util/List;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->items:Ljava/util/List;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->navigation:Lcom/whoop/navigation/e;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->navigation:Lcom/whoop/navigation/e;

    :goto_2
    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_3

    iput-object p3, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->heartScreenerUpdatedAtInfo:Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;

    return-void

    :cond_3
    iput-object p5, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->heartScreenerUpdatedAtInfo:Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/health/domain/models/DataVisHeaderModel;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/health/domain/models/DataVisHeaderModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/navigation/e;",
            "Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;",
            ")V"
        }
    .end annotation

    const-string v0, "header"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->header:Lcom/whoop/health/domain/models/DataVisHeaderModel;

    .line 9
    iput-object p2, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->items:Ljava/util/List;

    .line 10
    iput-object p3, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->navigation:Lcom/whoop/navigation/e;

    .line 11
    iput-object p4, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->heartScreenerUpdatedAtInfo:Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/health/domain/models/DataVisHeaderModel;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 12
    new-instance v0, Lcom/whoop/health/domain/models/DataVisHeaderModel;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/health/domain/models/DataVisHeaderModel;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    .line 13
    sget-object p2, Lm83/y;->w:Lm83/y;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move-object p4, v0

    .line 14
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/health/domain/models/DataVisualizationCardModel;-><init>(Lcom/whoop/health/domain/models/DataVisHeaderModel;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;)V

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

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 4

    new-instance v0, Lwc3/a;

    const-class v1, Lcom/whoop/navigation/e;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lwc3/c;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/health/domain/models/DataVisualizationCardModel;Lcom/whoop/health/domain/models/DataVisHeaderModel;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;ILjava/lang/Object;)Lcom/whoop/health/domain/models/DataVisualizationCardModel;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->header:Lcom/whoop/health/domain/models/DataVisHeaderModel;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->items:Ljava/util/List;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->navigation:Lcom/whoop/navigation/e;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->heartScreenerUpdatedAtInfo:Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->copy(Lcom/whoop/health/domain/models/DataVisHeaderModel;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;)Lcom/whoop/health/domain/models/DataVisualizationCardModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$health_release(Lcom/whoop/health/domain/models/DataVisualizationCardModel;Lzc3/c;Lyc3/g;)V
    .locals 9

    sget-object v0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->header:Lcom/whoop/health/domain/models/DataVisHeaderModel;

    new-instance v3, Lcom/whoop/health/domain/models/DataVisHeaderModel;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/whoop/health/domain/models/DataVisHeaderModel;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    sget-object v2, Lcom/whoop/health/domain/models/DataVisHeaderModel$$serializer;->INSTANCE:Lcom/whoop/health/domain/models/DataVisHeaderModel$$serializer;

    iget-object v3, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->header:Lcom/whoop/health/domain/models/DataVisHeaderModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->items:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->items:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->navigation:Lcom/whoop/navigation/e;

    if-eqz v2, :cond_5

    :goto_2
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->navigation:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->heartScreenerUpdatedAtInfo:Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel$$serializer;->INSTANCE:Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel$$serializer;

    iget-object p0, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->heartScreenerUpdatedAtInfo:Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/health/domain/models/DataVisHeaderModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->header:Lcom/whoop/health/domain/models/DataVisHeaderModel;

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

    iget-object v0, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->items:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->navigation:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component4()Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->heartScreenerUpdatedAtInfo:Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;

    return-object v0
.end method

.method public final copy(Lcom/whoop/health/domain/models/DataVisHeaderModel;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;)Lcom/whoop/health/domain/models/DataVisualizationCardModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/health/domain/models/DataVisHeaderModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/navigation/e;",
            "Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;",
            ")",
            "Lcom/whoop/health/domain/models/DataVisualizationCardModel;"
        }
    .end annotation

    const-string v0, "header"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/health/domain/models/DataVisualizationCardModel;-><init>(Lcom/whoop/health/domain/models/DataVisHeaderModel;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/health/domain/models/DataVisualizationCardModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/health/domain/models/DataVisualizationCardModel;

    iget-object v1, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->header:Lcom/whoop/health/domain/models/DataVisHeaderModel;

    iget-object v3, p1, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->header:Lcom/whoop/health/domain/models/DataVisHeaderModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->items:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->items:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->navigation:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->navigation:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->heartScreenerUpdatedAtInfo:Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;

    iget-object p1, p1, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->heartScreenerUpdatedAtInfo:Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getHeader()Lcom/whoop/health/domain/models/DataVisHeaderModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->header:Lcom/whoop/health/domain/models/DataVisHeaderModel;

    return-object v0
.end method

.method public final getHeartScreenerUpdatedAtInfo()Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->heartScreenerUpdatedAtInfo:Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;

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

    iget-object v0, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getNavigation()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->navigation:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->header:Lcom/whoop/health/domain/models/DataVisHeaderModel;

    invoke-virtual {v0}, Lcom/whoop/health/domain/models/DataVisHeaderModel;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->items:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->navigation:Lcom/whoop/navigation/e;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->heartScreenerUpdatedAtInfo:Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->header:Lcom/whoop/health/domain/models/DataVisHeaderModel;

    iget-object v1, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->items:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->navigation:Lcom/whoop/navigation/e;

    iget-object v3, p0, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->heartScreenerUpdatedAtInfo:Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "DataVisualizationCardModel(header="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", items="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", navigation="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", heartScreenerUpdatedAtInfo="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
