.class public final Lcom/whoop/design/models/items/AchievementProgressCardModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/AchievementProgressCardModel$$serializer;,
        Lcom/whoop/design/models/items/AchievementProgressCardModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\u0008\u0087\u0008\u0018\u0000 N2\u00020\u0001:\u0002ONBo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014B\u0087\u0001\u0008\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\u0008\u0013\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001bJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001bJ\u0012\u0010#\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\rH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0088\u0001\u0010+\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00c6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010\u001bJ\u0010\u0010.\u001a\u00020\u0015H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u001a\u00102\u001a\u00020\r2\u0008\u00101\u001a\u0004\u0018\u000100H\u00d6\u0003\u00a2\u0006\u0004\u00082\u00103J\'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001\u00a2\u0006\u0004\u0008:\u0010;R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010=\u001a\u0004\u0008>\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010=\u001a\u0004\u0008?\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010=\u001a\u0004\u0008@\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010=\u001a\u0004\u0008A\u0010\u001bR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010B\u001a\u0004\u0008C\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010=\u001a\u0004\u0008D\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010=\u001a\u0004\u0008E\u0010\u001bR\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010F\u001a\u0004\u0008G\u0010$R\u0017\u0010\u000e\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010H\u001a\u0004\u0008I\u0010&R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010J\u001a\u0004\u0008K\u0010(R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010L\u001a\u0004\u0008M\u0010*\u00a8\u0006P"
    }
    d2 = {
        "Lcom/whoop/design/models/items/AchievementProgressCardModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "numerator",
        "denominator",
        "description",
        "style",
        "Lcom/whoop/design/models/colortheme/ColorThemeModel;",
        "colors",
        "backgroundStyle",
        "iconUrl",
        "",
        "progressPercent",
        "",
        "showArrowIcon",
        "Lcom/whoop/navigation/e;",
        "destination",
        "Lcom/whoop/design/models/celebration/CelebrationMediaModel;",
        "media",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;ZLcom/whoop/navigation/e;Lcom/whoop/design/models/celebration/CelebrationMediaModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;ZLcom/whoop/navigation/e;Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "()Lcom/whoop/design/models/colortheme/ColorThemeModel;",
        "component6",
        "component7",
        "component8",
        "()Ljava/lang/Double;",
        "component9",
        "()Z",
        "component10",
        "()Lcom/whoop/navigation/e;",
        "component11",
        "()Lcom/whoop/design/models/celebration/CelebrationMediaModel;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;ZLcom/whoop/navigation/e;Lcom/whoop/design/models/celebration/CelebrationMediaModel;)Lcom/whoop/design/models/items/AchievementProgressCardModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/AchievementProgressCardModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getNumerator",
        "getDenominator",
        "getDescription",
        "getStyle",
        "Lcom/whoop/design/models/colortheme/ColorThemeModel;",
        "getColors",
        "getBackgroundStyle",
        "getIconUrl",
        "Ljava/lang/Double;",
        "getProgressPercent",
        "Z",
        "getShowArrowIcon",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "Lcom/whoop/design/models/celebration/CelebrationMediaModel;",
        "getMedia",
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

.field public static final Companion:Lcom/whoop/design/models/items/AchievementProgressCardModel$Companion;


# instance fields
.field private final backgroundStyle:Ljava/lang/String;

.field private final colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

.field private final denominator:Ljava/lang/String;

.field private final description:Ljava/lang/String;

.field private final destination:Lcom/whoop/navigation/e;

.field private final iconUrl:Ljava/lang/String;

.field private final media:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

.field private final numerator:Ljava/lang/String;

.field private final progressPercent:Ljava/lang/Double;

.field private final showArrowIcon:Z

.field private final style:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/design/models/items/AchievementProgressCardModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/AchievementProgressCardModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->Companion:Lcom/whoop/design/models/items/AchievementProgressCardModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw70/a;

    const/4 v4, 0x5

    invoke-direct {v3, v4}, Lw70/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v3, 0xb

    new-array v3, v3, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v3, v5

    const/4 v5, 0x1

    aput-object v1, v3, v5

    const/4 v5, 0x2

    aput-object v1, v3, v5

    const/4 v5, 0x3

    aput-object v1, v3, v5

    const/4 v5, 0x4

    aput-object v1, v3, v5

    aput-object v1, v3, v4

    const/4 v4, 0x6

    aput-object v1, v3, v4

    const/4 v4, 0x7

    aput-object v1, v3, v4

    aput-object v1, v3, v0

    const/16 v0, 0x9

    aput-object v2, v3, v0

    const/16 v0, 0xa

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/design/models/items/AchievementProgressCardModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;ZLcom/whoop/navigation/e;Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p13, p1, 0x1ef

    const/16 v0, 0x1ef

    if-eq v0, p13, :cond_0

    .line 1
    sget-object p13, Lcom/whoop/design/models/items/AchievementProgressCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/AchievementProgressCardModel$$serializer;

    invoke-virtual {p13}, Lcom/whoop/design/models/items/AchievementProgressCardModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p13

    invoke-static {p1, v0, p13}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->numerator:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->denominator:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->description:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->style:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x10

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    goto :goto_0

    :cond_1
    iput-object p6, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    :goto_0
    iput-object p7, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->backgroundStyle:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->iconUrl:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->progressPercent:Ljava/lang/Double;

    iput-boolean p10, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->showArrowIcon:Z

    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->destination:Lcom/whoop/navigation/e;

    goto :goto_1

    :cond_2
    iput-object p11, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->destination:Lcom/whoop/navigation/e;

    :goto_1
    and-int/lit16 p1, p1, 0x400

    if-nez p1, :cond_3

    iput-object p3, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->media:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    return-void

    :cond_3
    iput-object p12, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->media:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;ZLcom/whoop/navigation/e;Lcom/whoop/design/models/celebration/CelebrationMediaModel;)V
    .locals 1

    const-string v0, "numerator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "denominator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundStyle"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->numerator:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->denominator:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->description:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->style:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->backgroundStyle:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->iconUrl:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->progressPercent:Ljava/lang/Double;

    .line 11
    iput-boolean p9, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->showArrowIcon:Z

    .line 12
    iput-object p10, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->destination:Lcom/whoop/navigation/e;

    .line 13
    iput-object p11, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->media:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;ZLcom/whoop/navigation/e;Lcom/whoop/design/models/celebration/CelebrationMediaModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p13, p12, 0x10

    const/4 v0, 0x0

    if-eqz p13, :cond_0

    move-object p5, v0

    :cond_0
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_1

    move-object p10, v0

    :cond_1
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_2

    move-object p12, v0

    :goto_0
    move-object p11, p10

    move p10, p9

    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_2
    move-object p12, p11

    goto :goto_0

    .line 14
    :goto_1
    invoke-direct/range {p1 .. p12}, Lcom/whoop/design/models/items/AchievementProgressCardModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;ZLcom/whoop/navigation/e;Lcom/whoop/design/models/celebration/CelebrationMediaModel;)V

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

    invoke-static {}, Lcom/whoop/design/models/items/AchievementProgressCardModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/AchievementProgressCardModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;ZLcom/whoop/navigation/e;Lcom/whoop/design/models/celebration/CelebrationMediaModel;ILjava/lang/Object;)Lcom/whoop/design/models/items/AchievementProgressCardModel;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->numerator:Ljava/lang/String;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->denominator:Ljava/lang/String;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->description:Ljava/lang/String;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->style:Ljava/lang/String;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->backgroundStyle:Ljava/lang/String;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->iconUrl:Ljava/lang/String;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->progressPercent:Ljava/lang/Double;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-boolean p9, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->showArrowIcon:Z

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->destination:Lcom/whoop/navigation/e;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->media:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    :cond_a
    move-object p12, p10

    move-object p13, p11

    move-object p10, p8

    move p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/design/models/items/AchievementProgressCardModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;ZLcom/whoop/navigation/e;Lcom/whoop/design/models/celebration/CelebrationMediaModel;)Lcom/whoop/design/models/items/AchievementProgressCardModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/AchievementProgressCardModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->numerator:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->denominator:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->description:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->style:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lcom/whoop/design/models/colortheme/ColorThemeModel$$serializer;->INSTANCE:Lcom/whoop/design/models/colortheme/ColorThemeModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->backgroundStyle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->iconUrl:Ljava/lang/String;

    const/4 v3, 0x6

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->progressPercent:Ljava/lang/Double;

    const/4 v3, 0x7

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x8

    iget-boolean v2, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->showArrowIcon:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->destination:Lcom/whoop/navigation/e;

    if-eqz v2, :cond_3

    :goto_1
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/16 v0, 0xa

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->media:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lcom/whoop/design/models/celebration/CelebrationMediaModel$$serializer;->INSTANCE:Lcom/whoop/design/models/celebration/CelebrationMediaModel$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->media:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->numerator:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component11()Lcom/whoop/design/models/celebration/CelebrationMediaModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->media:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->denominator:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/colortheme/ColorThemeModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->backgroundStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->progressPercent:Ljava/lang/Double;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->showArrowIcon:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;ZLcom/whoop/navigation/e;Lcom/whoop/design/models/celebration/CelebrationMediaModel;)Lcom/whoop/design/models/items/AchievementProgressCardModel;
    .locals 13

    const-string v0, "numerator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "denominator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundStyle"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/AchievementProgressCardModel;

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/whoop/design/models/items/AchievementProgressCardModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;ZLcom/whoop/navigation/e;Lcom/whoop/design/models/celebration/CelebrationMediaModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/AchievementProgressCardModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/AchievementProgressCardModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->numerator:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/AchievementProgressCardModel;->numerator:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->denominator:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/AchievementProgressCardModel;->denominator:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/AchievementProgressCardModel;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->style:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/AchievementProgressCardModel;->style:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/AchievementProgressCardModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->backgroundStyle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/AchievementProgressCardModel;->backgroundStyle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->iconUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/AchievementProgressCardModel;->iconUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->progressPercent:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/design/models/items/AchievementProgressCardModel;->progressPercent:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->showArrowIcon:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/AchievementProgressCardModel;->showArrowIcon:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->destination:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/design/models/items/AchievementProgressCardModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->media:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    iget-object p1, p1, Lcom/whoop/design/models/items/AchievementProgressCardModel;->media:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getBackgroundStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->backgroundStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final getColors()Lcom/whoop/design/models/colortheme/ColorThemeModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    return-object v0
.end method

.method public final getDenominator()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->denominator:Ljava/lang/String;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getMedia()Lcom/whoop/design/models/celebration/CelebrationMediaModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->media:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    return-object v0
.end method

.method public final getNumerator()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->numerator:Ljava/lang/String;

    return-object v0
.end method

.method public final getProgressPercent()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->progressPercent:Ljava/lang/Double;

    return-object v0
.end method

.method public final getShowArrowIcon()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->showArrowIcon:Z

    return v0
.end method

.method public final getStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->style:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->numerator:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->denominator:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->description:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->style:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/design/models/colortheme/ColorThemeModel;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->backgroundStyle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->iconUrl:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->progressPercent:Ljava/lang/Double;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->showArrowIcon:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->destination:Lcom/whoop/navigation/e;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->media:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->numerator:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->denominator:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->description:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->style:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    iget-object v5, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->backgroundStyle:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->iconUrl:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->progressPercent:Ljava/lang/Double;

    iget-boolean v8, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->showArrowIcon:Z

    iget-object v9, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->destination:Lcom/whoop/navigation/e;

    iget-object v10, p0, Lcom/whoop/design/models/items/AchievementProgressCardModel;->media:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    const-string v11, ", denominator="

    const-string v12, ", description="

    const-string v13, "AchievementProgressCardModel(numerator="

    invoke-static {v13, v0, v11, v1, v12}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", style="

    const-string v11, ", colors="

    invoke-static {v0, v2, v1, v3, v11}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", backgroundStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", iconUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", progressPercent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", showArrowIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", destination="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", media="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
