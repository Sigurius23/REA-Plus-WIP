.class public final Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel$$serializer;,
        Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u0000 ?2\u00020\u0001:\u0002@?BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\r\u0010\u000eBa\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010 J\u0012\u0010&\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\"J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\"Jb\u0010(\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010\"J\u0010\u0010+\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u001a\u00100\u001a\u00020/2\u0008\u0010.\u001a\u0004\u0018\u00010-H\u00d6\u0003\u00a2\u0006\u0004\u00080\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00102\u001a\u0004\u00083\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00104\u001a\u0004\u00085\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00106\u001a\u0004\u00087\u0010\"R\"\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u00108\u0012\u0004\u0008:\u0010;\u001a\u0004\u00089\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00104\u001a\u0004\u0008<\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00106\u001a\u0004\u0008=\u0010\"R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00106\u001a\u0004\u0008>\u0010\"\u00a8\u0006A"
    }
    d2 = {
        "Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/celebration/CelebrationMediaModel;",
        "media",
        "Lcom/whoop/design/util/TextResource;",
        "captionText",
        "",
        "captionTypography",
        "Lcom/whoop/navigation/e;",
        "destination",
        "subCaptionText",
        "subCaptionLeadingImage",
        "subCaptionTypography",
        "<init>",
        "(Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/models/celebration/CelebrationMediaModel;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/design/models/celebration/CelebrationMediaModel;",
        "component2",
        "()Lcom/whoop/design/util/TextResource;",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "()Lcom/whoop/navigation/e;",
        "component5",
        "component6",
        "component7",
        "copy",
        "(Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/models/celebration/CelebrationMediaModel;",
        "getMedia",
        "Lcom/whoop/design/util/TextResource;",
        "getCaptionText",
        "Ljava/lang/String;",
        "getCaptionTypography",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "getDestination$annotations",
        "()V",
        "getSubCaptionText",
        "getSubCaptionLeadingImage",
        "getSubCaptionTypography",
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

.field public static final Companion:Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel$Companion;


# instance fields
.field private final captionText:Lcom/whoop/design/util/TextResource;

.field private final captionTypography:Ljava/lang/String;

.field private final destination:Lcom/whoop/navigation/e;

.field private final media:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

.field private final subCaptionLeadingImage:Ljava/lang/String;

.field private final subCaptionText:Lcom/whoop/design/util/TextResource;

.field private final subCaptionTypography:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->Companion:Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lty1/e;

    const/16 v3, 0x11

    invoke-direct {v2, v3}, Lty1/e;-><init>(I)V

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

    aput-object v0, v2, v3

    const/4 v0, 0x4

    aput-object v1, v2, v0

    const/4 v0, 0x5

    aput-object v1, v2, v0

    const/4 v0, 0x6

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/models/celebration/CelebrationMediaModel;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel$$serializer;->INSTANCE:Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel$$serializer;

    invoke-virtual {p9}, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->media:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    and-int/lit8 p2, p1, 0x2

    const/4 p9, 0x0

    if-nez p2, :cond_1

    iput-object p9, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->captionText:Lcom/whoop/design/util/TextResource;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->captionText:Lcom/whoop/design/util/TextResource;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object p9, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->captionTypography:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->captionTypography:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object p9, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->destination:Lcom/whoop/navigation/e;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->destination:Lcom/whoop/navigation/e;

    :goto_2
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object p9, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionText:Lcom/whoop/design/util/TextResource;

    goto :goto_3

    :cond_4
    iput-object p6, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionText:Lcom/whoop/design/util/TextResource;

    :goto_3
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object p9, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionLeadingImage:Ljava/lang/String;

    goto :goto_4

    :cond_5
    iput-object p7, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionLeadingImage:Ljava/lang/String;

    :goto_4
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_6

    iput-object p9, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionTypography:Ljava/lang/String;

    return-void

    :cond_6
    iput-object p8, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionTypography:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "media"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->media:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->captionText:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->captionTypography:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->destination:Lcom/whoop/navigation/e;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionText:Lcom/whoop/design/util/TextResource;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionLeadingImage:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionTypography:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x2

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_2

    move-object p4, v0

    :cond_2
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_3

    move-object p5, v0

    :cond_3
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_4

    move-object p6, v0

    :cond_4
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_5

    move-object p8, v0

    :goto_0
    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_5
    move-object p8, p7

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {p1 .. p8}, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;-><init>(Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;)V

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

    invoke-static {}, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->media:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->captionText:Lcom/whoop/design/util/TextResource;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->captionTypography:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->destination:Lcom/whoop/navigation/e;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionText:Lcom/whoop/design/util/TextResource;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionLeadingImage:Ljava/lang/String;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionTypography:Ljava/lang/String;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->copy(Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getDestination$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/design/models/celebration/CelebrationMediaModel$$serializer;->INSTANCE:Lcom/whoop/design/models/celebration/CelebrationMediaModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->media:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->captionText:Lcom/whoop/design/util/TextResource;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lmd1/a;->a:Lmd1/a;

    iget-object v3, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->captionText:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->captionTypography:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->captionTypography:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->destination:Lcom/whoop/navigation/e;

    if-eqz v2, :cond_5

    :goto_2
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionText:Lcom/whoop/design/util/TextResource;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lmd1/a;->a:Lmd1/a;

    iget-object v2, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionText:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionLeadingImage:Ljava/lang/String;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionLeadingImage:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionTypography:Ljava/lang/String;

    if-eqz v1, :cond_b

    :goto_5
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionTypography:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/models/celebration/CelebrationMediaModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->media:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->captionText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->captionTypography:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionLeadingImage:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionTypography:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;
    .locals 9

    const-string v0, "media"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;-><init>(Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;

    iget-object v1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->media:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    iget-object v3, p1, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->media:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->captionText:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->captionText:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->captionTypography:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->captionTypography:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->destination:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionText:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionText:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionLeadingImage:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionLeadingImage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionTypography:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionTypography:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getCaptionText()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->captionText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getCaptionTypography()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->captionTypography:Ljava/lang/String;

    return-object v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getMedia()Lcom/whoop/design/models/celebration/CelebrationMediaModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->media:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    return-object v0
.end method

.method public final getSubCaptionLeadingImage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionLeadingImage:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubCaptionText()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getSubCaptionTypography()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionTypography:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->media:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->captionText:Lcom/whoop/design/util/TextResource;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->captionTypography:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->destination:Lcom/whoop/navigation/e;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionText:Lcom/whoop/design/util/TextResource;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionLeadingImage:Ljava/lang/String;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionTypography:Ljava/lang/String;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->media:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    iget-object v1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->captionText:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->captionTypography:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->destination:Lcom/whoop/navigation/e;

    iget-object v4, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionText:Lcom/whoop/design/util/TextResource;

    iget-object v5, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionLeadingImage:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->subCaptionTypography:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "CelebrationMediaWithCaptionModel(media="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", captionText="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", captionTypography="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", destination="

    const-string v1, ", subCaptionText="

    invoke-static {v7, v2, v0, v3, v1}, Lq63/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)V

    const-string v0, ", subCaptionLeadingImage="

    const-string v1, ", subCaptionTypography="

    invoke-static {v7, v4, v0, v5, v1}, Lq63/c;->z(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ")"

    invoke-static {v6, v0, v7}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
