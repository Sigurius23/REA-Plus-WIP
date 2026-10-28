.class public final Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/access/omronauth/domain/models/OmronAuthModel$$serializer;,
        Lcom/whoop/access/omronauth/domain/models/OmronAuthModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u000b\n\u0002\u0008\u0016\u0008\u0087\u0008\u0018\u0000 G2\u00020\u0001:\u0002HIBE\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011Ba\u0008\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u0016J\'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\\\u0010.\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u0010\u00100\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u00080\u0010+J\u0010\u00101\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u00081\u00102J\u001a\u00105\u001a\u0002042\u0008\u00103\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00085\u00106R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00107\u001a\u0004\u00088\u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00109\u001a\u0004\u0008:\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010;\u001a\u0004\u0008<\u0010%R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010=\u001a\u0004\u0008>\u0010\'R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010?\u001a\u0004\u0008@\u0010)R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010A\u001a\u0004\u0008B\u0010+R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010C\u0012\u0004\u0008E\u0010F\u001a\u0004\u0008D\u0010-\u00a8\u0006J"
    }
    d2 = {
        "Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;",
        "",
        "Lcom/whoop/design/models/items/NavigationBarModel;",
        "navBar",
        "Lcom/whoop/design/models/items/ImageUrlModel;",
        "image",
        "Lcom/whoop/design/models/TitleSubTitleModel;",
        "content",
        "Lcom/whoop/design/models/items/FeatureListModel;",
        "featuresList",
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "button",
        "",
        "omronUrl",
        "Lcom/whoop/navigation/e;",
        "navigateOnSuccess",
        "<init>",
        "(Lcom/whoop/design/models/items/NavigationBarModel;Lcom/whoop/design/models/items/ImageUrlModel;Lcom/whoop/design/models/TitleSubTitleModel;Lcom/whoop/design/models/items/FeatureListModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Lcom/whoop/navigation/e;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/models/items/NavigationBarModel;Lcom/whoop/design/models/items/ImageUrlModel;Lcom/whoop/design/models/TitleSubTitleModel;Lcom/whoop/design/models/items/FeatureListModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$access_release",
        "(Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/design/models/items/NavigationBarModel;",
        "component2",
        "()Lcom/whoop/design/models/items/ImageUrlModel;",
        "component3",
        "()Lcom/whoop/design/models/TitleSubTitleModel;",
        "component4",
        "()Lcom/whoop/design/models/items/FeatureListModel;",
        "component5",
        "()Lcom/whoop/design/models/items/CardButtonModel;",
        "component6",
        "()Ljava/lang/String;",
        "component7",
        "()Lcom/whoop/navigation/e;",
        "copy",
        "(Lcom/whoop/design/models/items/NavigationBarModel;Lcom/whoop/design/models/items/ImageUrlModel;Lcom/whoop/design/models/TitleSubTitleModel;Lcom/whoop/design/models/items/FeatureListModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/models/items/NavigationBarModel;",
        "getNavBar",
        "Lcom/whoop/design/models/items/ImageUrlModel;",
        "getImage",
        "Lcom/whoop/design/models/TitleSubTitleModel;",
        "getContent",
        "Lcom/whoop/design/models/items/FeatureListModel;",
        "getFeaturesList",
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "getButton",
        "Ljava/lang/String;",
        "getOmronUrl",
        "Lcom/whoop/navigation/e;",
        "getNavigateOnSuccess",
        "getNavigateOnSuccess$annotations",
        "()V",
        "Companion",
        "$serializer",
        "a",
        "access_release"
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

.field public static final Companion:Lcom/whoop/access/omronauth/domain/models/OmronAuthModel$a;


# instance fields
.field private final button:Lcom/whoop/design/models/items/CardButtonModel;

.field private final content:Lcom/whoop/design/models/TitleSubTitleModel;

.field private final featuresList:Lcom/whoop/design/models/items/FeatureListModel;

.field private final image:Lcom/whoop/design/models/items/ImageUrlModel;

.field private final navBar:Lcom/whoop/design/models/items/NavigationBarModel;

.field private final navigateOnSuccess:Lcom/whoop/navigation/e;

.field private final omronUrl:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->Companion:Lcom/whoop/access/omronauth/domain/models/OmronAuthModel$a;

    sget v0, Lcom/whoop/navigation/e;->d:I

    sget v2, Lcom/whoop/design/models/items/CardButtonModel;->$stable:I

    or-int/2addr v0, v2

    sget v2, Lcom/whoop/design/models/items/FeatureListModel;->$stable:I

    or-int/2addr v0, v2

    sget v2, Lcom/whoop/design/models/TitleSubTitleModel;->$stable:I

    or-int/2addr v0, v2

    sget v2, Lcom/whoop/design/models/items/ImageUrlModel;->$stable:I

    or-int/2addr v0, v2

    sget v2, Lcom/whoop/design/models/items/NavigationBarModel;->$stable:I

    or-int/2addr v0, v2

    sput v0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lv40/d;

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Lv40/d;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x7

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v1, v2, v3

    const/4 v3, 0x4

    aput-object v1, v2, v3

    const/4 v3, 0x5

    aput-object v1, v2, v3

    const/4 v1, 0x6

    aput-object v0, v2, v1

    sput-object v2, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/models/items/NavigationBarModel;Lcom/whoop/design/models/items/ImageUrlModel;Lcom/whoop/design/models/TitleSubTitleModel;Lcom/whoop/design/models/items/FeatureListModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel$$serializer;->INSTANCE:Lcom/whoop/access/omronauth/domain/models/OmronAuthModel$$serializer;

    invoke-virtual {p9}, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->navBar:Lcom/whoop/design/models/items/NavigationBarModel;

    iput-object p3, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->image:Lcom/whoop/design/models/items/ImageUrlModel;

    iput-object p4, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->content:Lcom/whoop/design/models/TitleSubTitleModel;

    iput-object p5, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->featuresList:Lcom/whoop/design/models/items/FeatureListModel;

    iput-object p6, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->button:Lcom/whoop/design/models/items/CardButtonModel;

    iput-object p7, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->omronUrl:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->navigateOnSuccess:Lcom/whoop/navigation/e;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/models/items/NavigationBarModel;Lcom/whoop/design/models/items/ImageUrlModel;Lcom/whoop/design/models/TitleSubTitleModel;Lcom/whoop/design/models/items/FeatureListModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Lcom/whoop/navigation/e;)V
    .locals 1

    const-string v0, "content"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featuresList"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "button"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "omronUrl"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->navBar:Lcom/whoop/design/models/items/NavigationBarModel;

    .line 4
    iput-object p2, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->image:Lcom/whoop/design/models/items/ImageUrlModel;

    .line 5
    iput-object p3, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->content:Lcom/whoop/design/models/TitleSubTitleModel;

    .line 6
    iput-object p4, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->featuresList:Lcom/whoop/design/models/items/FeatureListModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->button:Lcom/whoop/design/models/items/CardButtonModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->omronUrl:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->navigateOnSuccess:Lcom/whoop/navigation/e;

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

    invoke-static {}, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;Lcom/whoop/design/models/items/NavigationBarModel;Lcom/whoop/design/models/items/ImageUrlModel;Lcom/whoop/design/models/TitleSubTitleModel;Lcom/whoop/design/models/items/FeatureListModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->navBar:Lcom/whoop/design/models/items/NavigationBarModel;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->image:Lcom/whoop/design/models/items/ImageUrlModel;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->content:Lcom/whoop/design/models/TitleSubTitleModel;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->featuresList:Lcom/whoop/design/models/items/FeatureListModel;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->button:Lcom/whoop/design/models/items/CardButtonModel;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->omronUrl:Ljava/lang/String;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->navigateOnSuccess:Lcom/whoop/navigation/e;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->copy(Lcom/whoop/design/models/items/NavigationBarModel;Lcom/whoop/design/models/items/ImageUrlModel;Lcom/whoop/design/models/TitleSubTitleModel;Lcom/whoop/design/models/items/FeatureListModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getNavigateOnSuccess$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$access_release(Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/design/models/items/NavigationBarModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/NavigationBarModel$$serializer;

    iget-object v2, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->navBar:Lcom/whoop/design/models/items/NavigationBarModel;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/ImageUrlModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ImageUrlModel$$serializer;

    iget-object v2, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->image:Lcom/whoop/design/models/items/ImageUrlModel;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/TitleSubTitleModel$$serializer;->INSTANCE:Lcom/whoop/design/models/TitleSubTitleModel$$serializer;

    iget-object v2, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->content:Lcom/whoop/design/models/TitleSubTitleModel;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/FeatureListModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/FeatureListModel$$serializer;

    iget-object v2, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->featuresList:Lcom/whoop/design/models/items/FeatureListModel;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/CardButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CardButtonModel$$serializer;

    iget-object v2, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->button:Lcom/whoop/design/models/items/CardButtonModel;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->omronUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x6

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->navigateOnSuccess:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/models/items/NavigationBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->navBar:Lcom/whoop/design/models/items/NavigationBarModel;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/items/ImageUrlModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->image:Lcom/whoop/design/models/items/ImageUrlModel;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/TitleSubTitleModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->content:Lcom/whoop/design/models/TitleSubTitleModel;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/FeatureListModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->featuresList:Lcom/whoop/design/models/items/FeatureListModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/items/CardButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->button:Lcom/whoop/design/models/items/CardButtonModel;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->omronUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->navigateOnSuccess:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/models/items/NavigationBarModel;Lcom/whoop/design/models/items/ImageUrlModel;Lcom/whoop/design/models/TitleSubTitleModel;Lcom/whoop/design/models/items/FeatureListModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;
    .locals 9

    const-string v0, "content"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featuresList"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "button"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "omronUrl"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;-><init>(Lcom/whoop/design/models/items/NavigationBarModel;Lcom/whoop/design/models/items/ImageUrlModel;Lcom/whoop/design/models/TitleSubTitleModel;Lcom/whoop/design/models/items/FeatureListModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Lcom/whoop/navigation/e;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;

    iget-object v1, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->navBar:Lcom/whoop/design/models/items/NavigationBarModel;

    iget-object v3, p1, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->navBar:Lcom/whoop/design/models/items/NavigationBarModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->image:Lcom/whoop/design/models/items/ImageUrlModel;

    iget-object v3, p1, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->image:Lcom/whoop/design/models/items/ImageUrlModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->content:Lcom/whoop/design/models/TitleSubTitleModel;

    iget-object v3, p1, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->content:Lcom/whoop/design/models/TitleSubTitleModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->featuresList:Lcom/whoop/design/models/items/FeatureListModel;

    iget-object v3, p1, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->featuresList:Lcom/whoop/design/models/items/FeatureListModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->button:Lcom/whoop/design/models/items/CardButtonModel;

    iget-object v3, p1, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->button:Lcom/whoop/design/models/items/CardButtonModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->omronUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->omronUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->navigateOnSuccess:Lcom/whoop/navigation/e;

    iget-object p1, p1, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->navigateOnSuccess:Lcom/whoop/navigation/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getButton()Lcom/whoop/design/models/items/CardButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->button:Lcom/whoop/design/models/items/CardButtonModel;

    return-object v0
.end method

.method public final getContent()Lcom/whoop/design/models/TitleSubTitleModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->content:Lcom/whoop/design/models/TitleSubTitleModel;

    return-object v0
.end method

.method public final getFeaturesList()Lcom/whoop/design/models/items/FeatureListModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->featuresList:Lcom/whoop/design/models/items/FeatureListModel;

    return-object v0
.end method

.method public final getImage()Lcom/whoop/design/models/items/ImageUrlModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->image:Lcom/whoop/design/models/items/ImageUrlModel;

    return-object v0
.end method

.method public final getNavBar()Lcom/whoop/design/models/items/NavigationBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->navBar:Lcom/whoop/design/models/items/NavigationBarModel;

    return-object v0
.end method

.method public final getNavigateOnSuccess()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->navigateOnSuccess:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getOmronUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->omronUrl:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->navBar:Lcom/whoop/design/models/items/NavigationBarModel;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/design/models/items/NavigationBarModel;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->image:Lcom/whoop/design/models/items/ImageUrlModel;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/whoop/design/models/items/ImageUrlModel;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->content:Lcom/whoop/design/models/TitleSubTitleModel;

    invoke-virtual {v3}, Lcom/whoop/design/models/TitleSubTitleModel;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->featuresList:Lcom/whoop/design/models/items/FeatureListModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/FeatureListModel;->hashCode()I

    move-result v0

    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->button:Lcom/whoop/design/models/items/CardButtonModel;

    invoke-virtual {v3}, Lcom/whoop/design/models/items/CardButtonModel;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->omronUrl:Ljava/lang/String;

    invoke-static {v3, v2, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->navigateOnSuccess:Lcom/whoop/navigation/e;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->navBar:Lcom/whoop/design/models/items/NavigationBarModel;

    iget-object v1, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->image:Lcom/whoop/design/models/items/ImageUrlModel;

    iget-object v2, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->content:Lcom/whoop/design/models/TitleSubTitleModel;

    iget-object v3, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->featuresList:Lcom/whoop/design/models/items/FeatureListModel;

    iget-object v4, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->button:Lcom/whoop/design/models/items/CardButtonModel;

    iget-object v5, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->omronUrl:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->navigateOnSuccess:Lcom/whoop/navigation/e;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "OmronAuthModel(navBar="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", image="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", content="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", featuresList="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", button="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", omronUrl="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", navigateOnSuccess="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v7, v6, v0}, Lte0/d;->o(Ljava/lang/StringBuilder;Lcom/whoop/navigation/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
