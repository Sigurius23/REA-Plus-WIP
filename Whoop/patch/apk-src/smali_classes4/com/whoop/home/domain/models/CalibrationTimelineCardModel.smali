.class public final Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/home/domain/models/CalibrationTimelineCardModel$$serializer;,
        Lcom/whoop/home/domain/models/CalibrationTimelineCardModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u0000 32\u00020\u0001:\u000243B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nBC\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ8\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010#\u001a\u00020\"H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010*\u001a\u00020)2\u0008\u0010(\u001a\u0004\u0018\u00010\'H\u00d6\u0003\u00a2\u0006\u0004\u0008*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010,\u001a\u0004\u0008-\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010,\u001a\u0004\u0008.\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010/\u001a\u0004\u00080\u0010\u001dR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00101\u001a\u0004\u00082\u0010\u001f\u00a8\u00065"
    }
    d2 = {
        "Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "body",
        "Lcom/whoop/navigation/e;",
        "navigation",
        "Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel;",
        "circularProgressIndicator",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$home_release",
        "(Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/design/util/TextResource;",
        "component2",
        "component3",
        "()Lcom/whoop/navigation/e;",
        "component4",
        "()Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel;",
        "copy",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel;)Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;",
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
        "Lcom/whoop/design/util/TextResource;",
        "getTitle",
        "getBody",
        "Lcom/whoop/navigation/e;",
        "getNavigation",
        "Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel;",
        "getCircularProgressIndicator",
        "Companion",
        "$serializer",
        "home_release"
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

.field public static final Companion:Lcom/whoop/home/domain/models/CalibrationTimelineCardModel$Companion;


# instance fields
.field private final body:Lcom/whoop/design/util/TextResource;

.field private final circularProgressIndicator:Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel;

.field private final navigation:Lcom/whoop/navigation/e;

.field private final title:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->Companion:Lcom/whoop/home/domain/models/CalibrationTimelineCardModel$Companion;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v2, Lcom/whoop/navigation/e;->d:I

    or-int/2addr v2, v0

    or-int/2addr v2, v0

    or-int/2addr v0, v2

    sput v0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lyc2/a;

    const/16 v3, 0xd

    invoke-direct {v2, v3}, Lyc2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x4

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v0, v2, v3

    const/4 v0, 0x3

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel$$serializer;->INSTANCE:Lcom/whoop/home/domain/models/CalibrationTimelineCardModel$$serializer;

    invoke-virtual {p6}, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->title:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->body:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->navigation:Lcom/whoop/navigation/e;

    iput-object p5, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->circularProgressIndicator:Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigation"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "circularProgressIndicator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->title:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-object p2, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->body:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-object p3, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->navigation:Lcom/whoop/navigation/e;

    .line 6
    iput-object p4, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->circularProgressIndicator:Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel;

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
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

    invoke-static {}, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel;ILjava/lang/Object;)Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->title:Lcom/whoop/design/util/TextResource;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->body:Lcom/whoop/design/util/TextResource;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->navigation:Lcom/whoop/navigation/e;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->circularProgressIndicator:Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel;)Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$home_release(Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lmd1/a;->a:Lmd1/a;

    iget-object v2, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->title:Lcom/whoop/design/util/TextResource;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->body:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->navigation:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel$$serializer;->INSTANCE:Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel$$serializer;

    iget-object p0, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->circularProgressIndicator:Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel;

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->body:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component3()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->navigation:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component4()Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->circularProgressIndicator:Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel;)Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigation"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "circularProgressIndicator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;

    iget-object v1, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->body:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->body:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->navigation:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->navigation:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->circularProgressIndicator:Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel;

    iget-object p1, p1, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->circularProgressIndicator:Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBody()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->body:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getCircularProgressIndicator()Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->circularProgressIndicator:Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel;

    return-object v0
.end method

.method public final getNavigation()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->navigation:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->body:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->navigation:Lcom/whoop/navigation/e;

    invoke-static {v2, v0, v1}, Lvl/b;->a(Lcom/whoop/navigation/e;II)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->circularProgressIndicator:Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel;

    invoke-virtual {v1}, Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->body:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->navigation:Lcom/whoop/navigation/e;

    iget-object v3, p0, Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;->circularProgressIndicator:Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel;

    const-string v4, ", body="

    const-string v5, ", navigation="

    const-string v6, "CalibrationTimelineCardModel(title="

    invoke-static {v6, v0, v4, v1, v5}, Lte0/d;->q(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", circularProgressIndicator="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
