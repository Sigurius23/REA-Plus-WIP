.class public final Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/milestonepill/domain/model/MilestonePillResponse$$serializer;,
        Lcom/whoop/milestonepill/domain/model/MilestonePillResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008*\u0008\u0087\u0008\u0018\u0000 D2\u00020\u0001:\u0002EDB]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011Bu\u0008\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u0016J\'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010!J\u0010\u0010(\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010!J\u0012\u0010)\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010!J\u0012\u0010,\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-Jr\u0010.\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\u00022\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u00022\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u0010\u00100\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00080\u0010!J\u0010\u00101\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u00081\u00102J\u001a\u00104\u001a\u00020\u00072\u0008\u00103\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00084\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00106\u001a\u0004\u00087\u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00106\u001a\u0004\u00088\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00109\u001a\u0004\u0008:\u0010$R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010;\u001a\u0004\u0008<\u0010&R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00106\u001a\u0004\u0008=\u0010!R\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00106\u001a\u0004\u0008>\u0010!R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010?\u001a\u0004\u0008@\u0010*R\u0017\u0010\r\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u00106\u001a\u0004\u0008A\u0010!R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010B\u001a\u0004\u0008C\u0010-\u00a8\u0006F"
    }
    d2 = {
        "Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;",
        "",
        "",
        "contentUrl",
        "contentType",
        "Lcom/whoop/design/models/celebration/DynamicLottieModel;",
        "dynamicLottieProperties",
        "",
        "showLoadingShimmer",
        "count",
        "style",
        "Lcom/whoop/design/models/colortheme/ColorThemeModel;",
        "colors",
        "textStyle",
        "Lcom/whoop/navigation/e;",
        "navigation",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/celebration/DynamicLottieModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/lang/String;Lcom/whoop/navigation/e;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/celebration/DynamicLottieModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$milestone_pill_arch_mini_release",
        "(Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Lcom/whoop/design/models/celebration/DynamicLottieModel;",
        "component4",
        "()Ljava/lang/Boolean;",
        "component5",
        "component6",
        "component7",
        "()Lcom/whoop/design/models/colortheme/ColorThemeModel;",
        "component8",
        "component9",
        "()Lcom/whoop/navigation/e;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/celebration/DynamicLottieModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getContentUrl",
        "getContentType",
        "Lcom/whoop/design/models/celebration/DynamicLottieModel;",
        "getDynamicLottieProperties",
        "Ljava/lang/Boolean;",
        "getShowLoadingShimmer",
        "getCount",
        "getStyle",
        "Lcom/whoop/design/models/colortheme/ColorThemeModel;",
        "getColors",
        "getTextStyle",
        "Lcom/whoop/navigation/e;",
        "getNavigation",
        "Companion",
        "$serializer",
        "milestone-pill-arch-mini_release"
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

.field public static final Companion:Lcom/whoop/milestonepill/domain/model/MilestonePillResponse$Companion;


# instance fields
.field private final colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

.field private final contentType:Ljava/lang/String;

.field private final contentUrl:Ljava/lang/String;

.field private final count:Ljava/lang/String;

.field private final dynamicLottieProperties:Lcom/whoop/design/models/celebration/DynamicLottieModel;

.field private final navigation:Lcom/whoop/navigation/e;

.field private final showLoadingShimmer:Ljava/lang/Boolean;

.field private final style:Ljava/lang/String;

.field private final textStyle:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->Companion:Lcom/whoop/milestonepill/domain/model/MilestonePillResponse$Companion;

    sget v0, Lcom/whoop/navigation/e;->d:I

    sget v2, Lcom/whoop/design/models/colortheme/ColorThemeModel;->$stable:I

    or-int/2addr v0, v2

    sget v2, Lcom/whoop/design/models/celebration/DynamicLottieModel;->$stable:I

    or-int/2addr v0, v2

    sput v0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ldx2/a;

    const/16 v3, 0xc

    invoke-direct {v2, v3}, Ldx2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/16 v2, 0x9

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

    const/4 v3, 0x6

    aput-object v1, v2, v3

    const/4 v3, 0x7

    aput-object v1, v2, v3

    const/16 v1, 0x8

    aput-object v0, v2, v1

    sput-object v2, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/celebration/DynamicLottieModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p11, p1, 0x1b3

    const/16 v0, 0x1b3

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse$$serializer;->INSTANCE:Lcom/whoop/milestonepill/domain/model/MilestonePillResponse$$serializer;

    invoke-virtual {p11}, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->contentUrl:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->contentType:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->dynamicLottieProperties:Lcom/whoop/design/models/celebration/DynamicLottieModel;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->dynamicLottieProperties:Lcom/whoop/design/models/celebration/DynamicLottieModel;

    :goto_0
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->showLoadingShimmer:Ljava/lang/Boolean;

    goto :goto_1

    :cond_2
    iput-object p5, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->showLoadingShimmer:Ljava/lang/Boolean;

    :goto_1
    iput-object p6, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->count:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->style:Ljava/lang/String;

    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_3

    iput-object p3, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    goto :goto_2

    :cond_3
    iput-object p8, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    :goto_2
    iput-object p9, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->textStyle:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->navigation:Lcom/whoop/navigation/e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/celebration/DynamicLottieModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/lang/String;Lcom/whoop/navigation/e;)V
    .locals 1

    const-string v0, "contentUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "count"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyle"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->contentUrl:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->contentType:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->dynamicLottieProperties:Lcom/whoop/design/models/celebration/DynamicLottieModel;

    .line 6
    iput-object p4, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->showLoadingShimmer:Ljava/lang/Boolean;

    .line 7
    iput-object p5, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->count:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->style:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    .line 10
    iput-object p8, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->textStyle:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->navigation:Lcom/whoop/navigation/e;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/celebration/DynamicLottieModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/lang/String;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p10, 0x4

    const/4 v0, 0x0

    if-eqz p11, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_1

    move-object p4, v0

    :cond_1
    and-int/lit8 p10, p10, 0x40

    if-eqz p10, :cond_2

    move-object p10, p9

    move-object p9, p8

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

    :cond_2
    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    goto :goto_0

    .line 12
    :goto_1
    invoke-direct/range {p1 .. p10}, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/celebration/DynamicLottieModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/lang/String;Lcom/whoop/navigation/e;)V

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

    invoke-static {}, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/celebration/DynamicLottieModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/lang/String;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->contentUrl:Ljava/lang/String;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->contentType:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->dynamicLottieProperties:Lcom/whoop/design/models/celebration/DynamicLottieModel;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->showLoadingShimmer:Ljava/lang/Boolean;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->count:Ljava/lang/String;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->style:Ljava/lang/String;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->textStyle:Ljava/lang/String;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->navigation:Lcom/whoop/navigation/e;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/celebration/DynamicLottieModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$milestone_pill_arch_mini_release(Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->contentUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->contentType:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->dynamicLottieProperties:Lcom/whoop/design/models/celebration/DynamicLottieModel;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lcom/whoop/design/models/celebration/DynamicLottieModel$$serializer;->INSTANCE:Lcom/whoop/design/models/celebration/DynamicLottieModel$$serializer;

    iget-object v3, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->dynamicLottieProperties:Lcom/whoop/design/models/celebration/DynamicLottieModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->showLoadingShimmer:Ljava/lang/Boolean;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v3, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->showLoadingShimmer:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->count:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->style:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lcom/whoop/design/models/colortheme/ColorThemeModel$$serializer;->INSTANCE:Lcom/whoop/design/models/colortheme/ColorThemeModel$$serializer;

    iget-object v3, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x7

    iget-object v2, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->textStyle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x8

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->navigation:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->contentUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->contentType:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/celebration/DynamicLottieModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->dynamicLottieProperties:Lcom/whoop/design/models/celebration/DynamicLottieModel;

    return-object v0
.end method

.method public final component4()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->showLoadingShimmer:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->count:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/models/colortheme/ColorThemeModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->textStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->navigation:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/celebration/DynamicLottieModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;
    .locals 11

    const-string v0, "contentUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "count"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textStyle"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v8, p7

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/celebration/DynamicLottieModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/lang/String;Lcom/whoop/navigation/e;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;

    iget-object v1, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->contentUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->contentUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->contentType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->contentType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->dynamicLottieProperties:Lcom/whoop/design/models/celebration/DynamicLottieModel;

    iget-object v3, p1, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->dynamicLottieProperties:Lcom/whoop/design/models/celebration/DynamicLottieModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->showLoadingShimmer:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->showLoadingShimmer:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->count:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->count:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->style:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->style:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    iget-object v3, p1, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->textStyle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->textStyle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->navigation:Lcom/whoop/navigation/e;

    iget-object p1, p1, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->navigation:Lcom/whoop/navigation/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getColors()Lcom/whoop/design/models/colortheme/ColorThemeModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    return-object v0
.end method

.method public final getContentType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->contentType:Ljava/lang/String;

    return-object v0
.end method

.method public final getContentUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->contentUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getCount()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->count:Ljava/lang/String;

    return-object v0
.end method

.method public final getDynamicLottieProperties()Lcom/whoop/design/models/celebration/DynamicLottieModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->dynamicLottieProperties:Lcom/whoop/design/models/celebration/DynamicLottieModel;

    return-object v0
.end method

.method public final getNavigation()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->navigation:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getShowLoadingShimmer()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->showLoadingShimmer:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final getTextStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->textStyle:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->contentUrl:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->contentType:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->dynamicLottieProperties:Lcom/whoop/design/models/celebration/DynamicLottieModel;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/design/models/celebration/DynamicLottieModel;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->showLoadingShimmer:Ljava/lang/Boolean;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->count:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->style:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/design/models/colortheme/ColorThemeModel;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->textStyle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->navigation:Lcom/whoop/navigation/e;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->contentUrl:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->contentType:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->dynamicLottieProperties:Lcom/whoop/design/models/celebration/DynamicLottieModel;

    iget-object v3, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->showLoadingShimmer:Ljava/lang/Boolean;

    iget-object v4, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->count:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->style:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    iget-object v7, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->textStyle:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->navigation:Lcom/whoop/navigation/e;

    const-string v9, ", contentType="

    const-string v10, ", dynamicLottieProperties="

    const-string v11, "MilestonePillResponse(contentUrl="

    invoke-static {v11, v0, v9, v1, v10}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", showLoadingShimmer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", count="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", style="

    const-string v2, ", colors="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", navigation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v8, v1}, Lte0/d;->o(Ljava/lang/StringBuilder;Lcom/whoop/navigation/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
