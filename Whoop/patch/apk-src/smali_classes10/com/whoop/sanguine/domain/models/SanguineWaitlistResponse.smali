.class public final Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse$$serializer;,
        Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u0000 72\u00020\u0001:\u000289B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000c\u0010\rBS\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0016\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$JL\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010.\u001a\u0004\u0008/\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010.\u001a\u0004\u00080\u0010\u001dR\u001d\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00101\u001a\u0004\u00082\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00103\u001a\u0004\u00084\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00105\u001a\u0004\u00086\u0010$\u00a8\u0006:"
    }
    d2 = {
        "Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;",
        "",
        "",
        "headerText",
        "headerImageUrl",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "items",
        "Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;",
        "footer",
        "Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;",
        "analytics",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$sanguine_release",
        "(Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Ljava/util/List;",
        "component4",
        "()Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;",
        "component5",
        "()Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;)Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getHeaderText",
        "getHeaderImageUrl",
        "Ljava/util/List;",
        "getItems",
        "Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;",
        "getFooter",
        "Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;",
        "getAnalytics",
        "Companion",
        "$serializer",
        "a",
        "sanguine_release"
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

.field public static final Companion:Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse$a;


# instance fields
.field private final analytics:Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;

.field private final footer:Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;

.field private final headerImageUrl:Ljava/lang/String;

.field private final headerText:Ljava/lang/String;

.field private final items:Ljava/util/List;
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

    new-instance v0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->Companion:Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lty1/e;

    const/16 v3, 0xb

    invoke-direct {v2, v3}, Lty1/e;-><init>(I)V

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

    sput-object v2, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse$$serializer;->INSTANCE:Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse$$serializer;

    invoke-virtual {p7}, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->headerText:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->headerImageUrl:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->items:Ljava/util/List;

    iput-object p5, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->footer:Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;

    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->analytics:Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;

    return-void

    :cond_1
    iput-object p6, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->analytics:Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;",
            "Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;",
            ")V"
        }
    .end annotation

    const-string v0, "headerText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headerImageUrl"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->headerText:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->headerImageUrl:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->items:Ljava/util/List;

    .line 6
    iput-object p4, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->footer:Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;

    .line 7
    iput-object p5, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->analytics:Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 8
    invoke-direct/range {v0 .. v5}, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;)V

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

    invoke-static {}, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;ILjava/lang/Object;)Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->headerText:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->headerImageUrl:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->items:Ljava/util/List;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->footer:Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->analytics:Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;)Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$sanguine_release(Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->headerText:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->headerImageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->items:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter$$serializer;->INSTANCE:Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter$$serializer;

    iget-object v1, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->footer:Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->analytics:Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo$$serializer;->INSTANCE:Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo$$serializer;

    iget-object p0, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->analytics:Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->headerText:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->headerImageUrl:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->items:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->footer:Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;

    return-object v0
.end method

.method public final component5()Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->analytics:Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;)Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;",
            "Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;",
            ")",
            "Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;"
        }
    .end annotation

    const-string v0, "headerText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headerImageUrl"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;

    iget-object v1, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->headerText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->headerText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->headerImageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->headerImageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->items:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->items:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->footer:Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;

    iget-object v3, p1, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->footer:Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->analytics:Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;

    iget-object p1, p1, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->analytics:Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAnalytics()Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->analytics:Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;

    return-object v0
.end method

.method public final getFooter()Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->footer:Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;

    return-object v0
.end method

.method public final getHeaderImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->headerImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getHeaderText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->headerText:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->items:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->headerText:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->headerImageUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->items:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->footer:Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->analytics:Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->headerText:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->headerImageUrl:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->items:Ljava/util/List;

    iget-object v3, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->footer:Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;

    iget-object v4, p0, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->analytics:Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;

    const-string v5, ", headerImageUrl="

    const-string v6, ", items="

    const-string v7, "SanguineWaitlistResponse(headerText="

    invoke-static {v7, v0, v5, v1, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", footer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", analytics="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
