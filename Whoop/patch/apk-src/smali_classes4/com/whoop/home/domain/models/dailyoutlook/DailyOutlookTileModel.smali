.class public final Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel$$serializer;,
        Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008$\u0008\u0087\u0008\u0018\u0000 :2\u00020\u0001:\u0002;:B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000c\u0010\rBU\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001fJN\u0010&\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u001fJ\u0010\u0010)\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010,\u001a\u00020\u00022\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010.\u0012\u0004\u00080\u00101\u001a\u0004\u0008/\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00102\u001a\u0004\u00083\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00104\u001a\u0004\u00085\u0010!R\u0017\u0010\u0008\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00102\u001a\u0004\u00086\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00107\u001a\u0004\u00088\u0010$R\u0017\u0010\u000b\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00102\u001a\u0004\u00089\u0010\u001f\u00a8\u0006<"
    }
    d2 = {
        "Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;",
        "",
        "",
        "hasGradient",
        "",
        "leftIcon",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "rightIcon",
        "Lcom/whoop/navigation/e;",
        "destination",
        "style",
        "<init>",
        "(ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IZLjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$home_release",
        "(Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Z",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "()Lcom/whoop/design/util/TextResource;",
        "component4",
        "component5",
        "()Lcom/whoop/navigation/e;",
        "component6",
        "copy",
        "(ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Z",
        "getHasGradient",
        "getHasGradient$annotations",
        "()V",
        "Ljava/lang/String;",
        "getLeftIcon",
        "Lcom/whoop/design/util/TextResource;",
        "getTitle",
        "getRightIcon",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "getStyle",
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

.field public static final Companion:Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel$Companion;


# instance fields
.field private final destination:Lcom/whoop/navigation/e;

.field private final hasGradient:Z

.field private final leftIcon:Ljava/lang/String;

.field private final rightIcon:Ljava/lang/String;

.field private final style:Ljava/lang/String;

.field private final title:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->Companion:Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel$Companion;

    sget v0, Lcom/whoop/navigation/e;->d:I

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int/2addr v0, v2

    sput v0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lyq0/a;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lyq0/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x6

    new-array v2, v2, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v2, v4

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v1, v2, v3

    const/4 v3, 0x4

    aput-object v0, v2, v3

    const/4 v0, 0x5

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(IZLjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel$$serializer;->INSTANCE:Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel$$serializer;

    invoke-virtual {p8}, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->hasGradient:Z

    iput-object p3, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->leftIcon:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->title:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->rightIcon:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->destination:Lcom/whoop/navigation/e;

    iput-object p7, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->style:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rightIcon"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destination"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->hasGradient:Z

    .line 4
    iput-object p2, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->leftIcon:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->title:Lcom/whoop/design/util/TextResource;

    .line 6
    iput-object p4, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->rightIcon:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->destination:Lcom/whoop/navigation/e;

    .line 8
    iput-object p6, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->style:Ljava/lang/String;

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

    invoke-static {}, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-boolean p1, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->hasGradient:Z

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->leftIcon:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->title:Lcom/whoop/design/util/TextResource;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->rightIcon:Ljava/lang/String;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->destination:Lcom/whoop/navigation/e;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->style:Ljava/lang/String;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->copy(ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getHasGradient$annotations()V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$home_release(Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-boolean v2, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->hasGradient:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->leftIcon:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lmd1/a;->a:Lmd1/a;

    iget-object v2, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->title:Lcom/whoop/design/util/TextResource;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->rightIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x5

    iget-object p0, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->style:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->hasGradient:Z

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->leftIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->rightIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;
    .locals 8

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rightIcon"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destination"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;-><init>(ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;

    iget-boolean v1, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->hasGradient:Z

    iget-boolean v3, p1, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->hasGradient:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->leftIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->leftIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->rightIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->rightIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->destination:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->style:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->style:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getHasGradient()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->hasGradient:Z

    return v0
.end method

.method public final getLeftIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->leftIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getRightIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->rightIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->hasGradient:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->leftIcon:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->rightIcon:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v2, v0, v1}, Lvl/b;->a(Lcom/whoop/navigation/e;II)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->style:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-boolean v0, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->hasGradient:Z

    iget-object v1, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->leftIcon:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->rightIcon:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->destination:Lcom/whoop/navigation/e;

    iget-object v5, p0, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->style:Ljava/lang/String;

    const-string v6, ", leftIcon="

    const-string v7, ", title="

    const-string v8, "DailyOutlookTileModel(hasGradient="

    invoke-static {v8, v6, v1, v7, v0}, Lev/n;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", rightIcon="

    const-string v6, ", destination="

    invoke-static {v0, v2, v1, v3, v6}, Lq63/c;->z(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", style="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
