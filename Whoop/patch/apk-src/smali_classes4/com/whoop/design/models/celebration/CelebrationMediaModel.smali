.class public final Lcom/whoop/design/models/celebration/CelebrationMediaModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/celebration/CelebrationMediaModel$$serializer;,
        Lcom/whoop/design/models/celebration/CelebrationMediaModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u0000\n\u0002\u0008\u0014\u0008\u0087\u0008\u0018\u0000 E2\u00020\u0001:\u0002FEB]\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011Bk\u0008\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u0016J\'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-Jj\u0010.\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u0010\u00100\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u00080\u0010#J\u0010\u00101\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u00081\u00102J\u001a\u00105\u001a\u00020\u000e2\u0008\u00104\u001a\u0004\u0018\u000103H\u00d6\u0003\u00a2\u0006\u0004\u00085\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00107\u001a\u0004\u00088\u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00109\u001a\u0004\u0008:\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00109\u001a\u0004\u0008;\u0010#R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010<\u001a\u0004\u0008=\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010<\u001a\u0004\u0008>\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010?\u001a\u0004\u0008@\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010A\u001a\u0004\u0008B\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010C\u001a\u0004\u0008D\u0010-\u00a8\u0006G"
    }
    d2 = {
        "Lcom/whoop/design/models/celebration/CelebrationMediaModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/ContentType;",
        "contentType",
        "",
        "contentUrl",
        "size",
        "Lcom/whoop/design/util/TextResource;",
        "textOverlay",
        "textOverlaySuffix",
        "Lcom/whoop/design/models/celebration/TextOverlayStyle;",
        "textOverlayStyle",
        "Lcom/whoop/design/models/celebration/DynamicLottieModel;",
        "dynamicLottieProperties",
        "",
        "showLoadingShimmer",
        "<init>",
        "(Lcom/whoop/design/models/ContentType;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/celebration/TextOverlayStyle;Lcom/whoop/design/models/celebration/DynamicLottieModel;Ljava/lang/Boolean;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/models/ContentType;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/celebration/TextOverlayStyle;Lcom/whoop/design/models/celebration/DynamicLottieModel;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/design/models/ContentType;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "()Lcom/whoop/design/util/TextResource;",
        "component5",
        "component6",
        "()Lcom/whoop/design/models/celebration/TextOverlayStyle;",
        "component7",
        "()Lcom/whoop/design/models/celebration/DynamicLottieModel;",
        "component8",
        "()Ljava/lang/Boolean;",
        "copy",
        "(Lcom/whoop/design/models/ContentType;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/celebration/TextOverlayStyle;Lcom/whoop/design/models/celebration/DynamicLottieModel;Ljava/lang/Boolean;)Lcom/whoop/design/models/celebration/CelebrationMediaModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/models/ContentType;",
        "getContentType",
        "Ljava/lang/String;",
        "getContentUrl",
        "getSize",
        "Lcom/whoop/design/util/TextResource;",
        "getTextOverlay",
        "getTextOverlaySuffix",
        "Lcom/whoop/design/models/celebration/TextOverlayStyle;",
        "getTextOverlayStyle",
        "Lcom/whoop/design/models/celebration/DynamicLottieModel;",
        "getDynamicLottieProperties",
        "Ljava/lang/Boolean;",
        "getShowLoadingShimmer",
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

.field public static final Companion:Lcom/whoop/design/models/celebration/CelebrationMediaModel$Companion;


# instance fields
.field private final contentType:Lcom/whoop/design/models/ContentType;

.field private final contentUrl:Ljava/lang/String;

.field private final dynamicLottieProperties:Lcom/whoop/design/models/celebration/DynamicLottieModel;

.field private final showLoadingShimmer:Ljava/lang/Boolean;

.field private final size:Ljava/lang/String;

.field private final textOverlay:Lcom/whoop/design/util/TextResource;

.field private final textOverlayStyle:Lcom/whoop/design/models/celebration/TextOverlayStyle;

.field private final textOverlaySuffix:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/design/models/celebration/CelebrationMediaModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/celebration/CelebrationMediaModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->Companion:Lcom/whoop/design/models/celebration/CelebrationMediaModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lty1/e;

    const/16 v4, 0xf

    invoke-direct {v3, v4}, Lty1/e;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lty1/e;

    const/16 v5, 0x10

    invoke-direct {v4, v5}, Lty1/e;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v0, v0, [Ll83/h;

    const/4 v4, 0x0

    aput-object v3, v0, v4

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const/4 v3, 0x2

    aput-object v1, v0, v3

    const/4 v3, 0x3

    aput-object v1, v0, v3

    const/4 v3, 0x4

    aput-object v1, v0, v3

    const/4 v3, 0x5

    aput-object v2, v0, v3

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/models/ContentType;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/celebration/TextOverlayStyle;Lcom/whoop/design/models/celebration/DynamicLottieModel;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p1, 0x6

    const/4 v0, 0x6

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/design/models/celebration/CelebrationMediaModel$$serializer;->INSTANCE:Lcom/whoop/design/models/celebration/CelebrationMediaModel$$serializer;

    invoke-virtual {p10}, Lcom/whoop/design/models/celebration/CelebrationMediaModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p10, p1, 0x1

    if-nez p10, :cond_1

    .line 2
    sget-object p2, Lcom/whoop/design/models/ContentType;->UNKNOWN:Lcom/whoop/design/models/ContentType;

    .line 3
    :cond_1
    iput-object p2, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->contentType:Lcom/whoop/design/models/ContentType;

    iput-object p3, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->contentUrl:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->size:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x8

    const/4 p3, 0x0

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlay:Lcom/whoop/design/util/TextResource;

    goto :goto_0

    :cond_2
    iput-object p5, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlay:Lcom/whoop/design/util/TextResource;

    :goto_0
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlaySuffix:Lcom/whoop/design/util/TextResource;

    goto :goto_1

    :cond_3
    iput-object p6, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlaySuffix:Lcom/whoop/design/util/TextResource;

    :goto_1
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlayStyle:Lcom/whoop/design/models/celebration/TextOverlayStyle;

    goto :goto_2

    :cond_4
    iput-object p7, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlayStyle:Lcom/whoop/design/models/celebration/TextOverlayStyle;

    :goto_2
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->dynamicLottieProperties:Lcom/whoop/design/models/celebration/DynamicLottieModel;

    goto :goto_3

    :cond_5
    iput-object p8, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->dynamicLottieProperties:Lcom/whoop/design/models/celebration/DynamicLottieModel;

    :goto_3
    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_6

    iput-object p3, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->showLoadingShimmer:Ljava/lang/Boolean;

    return-void

    :cond_6
    iput-object p9, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->showLoadingShimmer:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/models/ContentType;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/celebration/TextOverlayStyle;Lcom/whoop/design/models/celebration/DynamicLottieModel;Ljava/lang/Boolean;)V
    .locals 1

    const-string v0, "contentType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentUrl"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "size"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->contentType:Lcom/whoop/design/models/ContentType;

    .line 6
    iput-object p2, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->contentUrl:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->size:Ljava/lang/String;

    .line 8
    iput-object p4, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlay:Lcom/whoop/design/util/TextResource;

    .line 9
    iput-object p5, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlaySuffix:Lcom/whoop/design/util/TextResource;

    .line 10
    iput-object p6, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlayStyle:Lcom/whoop/design/models/celebration/TextOverlayStyle;

    .line 11
    iput-object p7, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->dynamicLottieProperties:Lcom/whoop/design/models/celebration/DynamicLottieModel;

    .line 12
    iput-object p8, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->showLoadingShimmer:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/models/ContentType;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/celebration/TextOverlayStyle;Lcom/whoop/design/models/celebration/DynamicLottieModel;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    .line 13
    sget-object p1, Lcom/whoop/design/models/ContentType;->UNKNOWN:Lcom/whoop/design/models/ContentType;

    :cond_0
    and-int/lit8 p10, p9, 0x8

    const/4 v0, 0x0

    if-eqz p10, :cond_1

    move-object p4, v0

    :cond_1
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_2

    move-object p5, v0

    :cond_2
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_3

    move-object p6, v0

    :cond_3
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_4

    move-object p7, v0

    :cond_4
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_5

    move-object p10, v0

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    goto :goto_0

    :cond_5
    move-object p10, p8

    move-object p9, p7

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    .line 14
    :goto_0
    invoke-direct/range {p2 .. p10}, Lcom/whoop/design/models/celebration/CelebrationMediaModel;-><init>(Lcom/whoop/design/models/ContentType;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/celebration/TextOverlayStyle;Lcom/whoop/design/models/celebration/DynamicLottieModel;Ljava/lang/Boolean;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/ContentType;->Companion:Lcom/whoop/design/models/ContentType$Companion;

    invoke-virtual {v0}, Lcom/whoop/design/models/ContentType$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/celebration/TextOverlayStyle;->Companion:Lcom/whoop/design/models/celebration/TextOverlayStyle$Companion;

    invoke-virtual {v0}, Lcom/whoop/design/models/celebration/TextOverlayStyle$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lcom/whoop/design/models/ContentType;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/celebration/TextOverlayStyle;Lcom/whoop/design/models/celebration/DynamicLottieModel;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/whoop/design/models/celebration/CelebrationMediaModel;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->contentType:Lcom/whoop/design/models/ContentType;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->contentUrl:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->size:Ljava/lang/String;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlay:Lcom/whoop/design/util/TextResource;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlaySuffix:Lcom/whoop/design/util/TextResource;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlayStyle:Lcom/whoop/design/models/celebration/TextOverlayStyle;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->dynamicLottieProperties:Lcom/whoop/design/models/celebration/DynamicLottieModel;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->showLoadingShimmer:Ljava/lang/Boolean;

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

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->copy(Lcom/whoop/design/models/ContentType;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/celebration/TextOverlayStyle;Lcom/whoop/design/models/celebration/DynamicLottieModel;Ljava/lang/Boolean;)Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->contentType:Lcom/whoop/design/models/ContentType;

    sget-object v3, Lcom/whoop/design/models/ContentType;->UNKNOWN:Lcom/whoop/design/models/ContentType;

    if-eq v2, v3, :cond_1

    :goto_0
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->contentType:Lcom/whoop/design/models/ContentType;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->contentUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->size:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlay:Lcom/whoop/design/util/TextResource;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lmd1/a;->a:Lmd1/a;

    iget-object v3, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlay:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlaySuffix:Lcom/whoop/design/util/TextResource;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lmd1/a;->a:Lmd1/a;

    iget-object v3, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlaySuffix:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlayStyle:Lcom/whoop/design/models/celebration/TextOverlayStyle;

    if-eqz v2, :cond_7

    :goto_3
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlayStyle:Lcom/whoop/design/models/celebration/TextOverlayStyle;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->dynamicLottieProperties:Lcom/whoop/design/models/celebration/DynamicLottieModel;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lcom/whoop/design/models/celebration/DynamicLottieModel$$serializer;->INSTANCE:Lcom/whoop/design/models/celebration/DynamicLottieModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->dynamicLottieProperties:Lcom/whoop/design/models/celebration/DynamicLottieModel;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->showLoadingShimmer:Ljava/lang/Boolean;

    if-eqz v1, :cond_b

    :goto_5
    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object p0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->showLoadingShimmer:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/models/ContentType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->contentType:Lcom/whoop/design/models/ContentType;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->contentUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->size:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlaySuffix:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/celebration/TextOverlayStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlayStyle:Lcom/whoop/design/models/celebration/TextOverlayStyle;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/models/celebration/DynamicLottieModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->dynamicLottieProperties:Lcom/whoop/design/models/celebration/DynamicLottieModel;

    return-object v0
.end method

.method public final component8()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->showLoadingShimmer:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/models/ContentType;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/celebration/TextOverlayStyle;Lcom/whoop/design/models/celebration/DynamicLottieModel;Ljava/lang/Boolean;)Lcom/whoop/design/models/celebration/CelebrationMediaModel;
    .locals 10

    const-string v0, "contentType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentUrl"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "size"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/design/models/celebration/CelebrationMediaModel;-><init>(Lcom/whoop/design/models/ContentType;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/celebration/TextOverlayStyle;Lcom/whoop/design/models/celebration/DynamicLottieModel;Ljava/lang/Boolean;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    iget-object v1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->contentType:Lcom/whoop/design/models/ContentType;

    iget-object v3, p1, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->contentType:Lcom/whoop/design/models/ContentType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->contentUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->contentUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->size:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->size:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlaySuffix:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlaySuffix:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlayStyle:Lcom/whoop/design/models/celebration/TextOverlayStyle;

    iget-object v3, p1, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlayStyle:Lcom/whoop/design/models/celebration/TextOverlayStyle;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->dynamicLottieProperties:Lcom/whoop/design/models/celebration/DynamicLottieModel;

    iget-object v3, p1, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->dynamicLottieProperties:Lcom/whoop/design/models/celebration/DynamicLottieModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->showLoadingShimmer:Ljava/lang/Boolean;

    iget-object p1, p1, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->showLoadingShimmer:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getContentType()Lcom/whoop/design/models/ContentType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->contentType:Lcom/whoop/design/models/ContentType;

    return-object v0
.end method

.method public final getContentUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->contentUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getDynamicLottieProperties()Lcom/whoop/design/models/celebration/DynamicLottieModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->dynamicLottieProperties:Lcom/whoop/design/models/celebration/DynamicLottieModel;

    return-object v0
.end method

.method public final getShowLoadingShimmer()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->showLoadingShimmer:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getSize()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->size:Ljava/lang/String;

    return-object v0
.end method

.method public final getTextOverlay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getTextOverlayStyle()Lcom/whoop/design/models/celebration/TextOverlayStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlayStyle:Lcom/whoop/design/models/celebration/TextOverlayStyle;

    return-object v0
.end method

.method public final getTextOverlaySuffix()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlaySuffix:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->contentType:Lcom/whoop/design/models/ContentType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->contentUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->size:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlay:Lcom/whoop/design/util/TextResource;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlaySuffix:Lcom/whoop/design/util/TextResource;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlayStyle:Lcom/whoop/design/models/celebration/TextOverlayStyle;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->dynamicLottieProperties:Lcom/whoop/design/models/celebration/DynamicLottieModel;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/design/models/celebration/DynamicLottieModel;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->showLoadingShimmer:Ljava/lang/Boolean;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->contentType:Lcom/whoop/design/models/ContentType;

    iget-object v1, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->contentUrl:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->size:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlay:Lcom/whoop/design/util/TextResource;

    iget-object v4, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlaySuffix:Lcom/whoop/design/util/TextResource;

    iget-object v5, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->textOverlayStyle:Lcom/whoop/design/models/celebration/TextOverlayStyle;

    iget-object v6, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->dynamicLottieProperties:Lcom/whoop/design/models/celebration/DynamicLottieModel;

    iget-object v7, p0, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->showLoadingShimmer:Ljava/lang/Boolean;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "CelebrationMediaModel(contentType="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", contentUrl="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", size="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", textOverlay="

    const-string v1, ", textOverlaySuffix="

    invoke-static {v8, v2, v0, v3, v1}, Lq63/c;->A(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", textOverlayStyle="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", dynamicLottieProperties="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", showLoadingShimmer="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
