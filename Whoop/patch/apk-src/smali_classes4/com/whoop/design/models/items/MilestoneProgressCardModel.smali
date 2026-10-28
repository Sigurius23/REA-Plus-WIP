.class public final Lcom/whoop/design/models/items/MilestoneProgressCardModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/MilestoneProgressCardModel$$serializer;,
        Lcom/whoop/design/models/items/MilestoneProgressCardModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u0000 @2\u00020\u0001:\u0002A@BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fB_\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010&J\u0010\u0010(\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J^\u0010*\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000cH\u00c6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010\"J\u0010\u0010-\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u001a\u00102\u001a\u0002012\u0008\u00100\u001a\u0004\u0018\u00010/H\u00d6\u0003\u00a2\u0006\u0004\u00082\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00104\u001a\u0004\u00085\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00104\u001a\u0004\u00086\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00107\u001a\u0004\u00088\u0010\"R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00109\u001a\u0004\u0008:\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010;\u001a\u0004\u0008<\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010;\u001a\u0004\u0008=\u0010&R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010>\u001a\u0004\u0008?\u0010)\u00a8\u0006B"
    }
    d2 = {
        "Lcom/whoop/design/models/items/MilestoneProgressCardModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "description",
        "",
        "style",
        "Lcom/whoop/design/models/colortheme/ColorThemeModel;",
        "colors",
        "Lcom/whoop/design/models/items/MilestoneItem;",
        "currentMilestone",
        "nextMilestone",
        "",
        "progressPercent",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Lcom/whoop/design/models/items/MilestoneItem;Lcom/whoop/design/models/items/MilestoneItem;D)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Lcom/whoop/design/models/items/MilestoneItem;Lcom/whoop/design/models/items/MilestoneItem;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/MilestoneProgressCardModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/design/util/TextResource;",
        "component2",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "()Lcom/whoop/design/models/colortheme/ColorThemeModel;",
        "component5",
        "()Lcom/whoop/design/models/items/MilestoneItem;",
        "component6",
        "component7",
        "()D",
        "copy",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Lcom/whoop/design/models/items/MilestoneItem;Lcom/whoop/design/models/items/MilestoneItem;D)Lcom/whoop/design/models/items/MilestoneProgressCardModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/util/TextResource;",
        "getTitle",
        "getDescription",
        "Ljava/lang/String;",
        "getStyle",
        "Lcom/whoop/design/models/colortheme/ColorThemeModel;",
        "getColors",
        "Lcom/whoop/design/models/items/MilestoneItem;",
        "getCurrentMilestone",
        "getNextMilestone",
        "D",
        "getProgressPercent",
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/design/models/items/MilestoneProgressCardModel$Companion;


# instance fields
.field private final colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

.field private final currentMilestone:Lcom/whoop/design/models/items/MilestoneItem;

.field private final description:Lcom/whoop/design/util/TextResource;

.field private final nextMilestone:Lcom/whoop/design/models/items/MilestoneItem;

.field private final progressPercent:D

.field private final style:Ljava/lang/String;

.field private final title:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/design/models/items/MilestoneProgressCardModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/MilestoneProgressCardModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->Companion:Lcom/whoop/design/models/items/MilestoneProgressCardModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Lcom/whoop/design/models/items/MilestoneItem;Lcom/whoop/design/models/items/MilestoneItem;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p1, 0x43

    const/16 v0, 0x43

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/design/models/items/MilestoneProgressCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/MilestoneProgressCardModel$$serializer;

    invoke-virtual {p10}, Lcom/whoop/design/models/items/MilestoneProgressCardModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->title:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->description:Lcom/whoop/design/util/TextResource;

    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->style:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->style:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    goto :goto_1

    :cond_2
    iput-object p5, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    :goto_1
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->currentMilestone:Lcom/whoop/design/models/items/MilestoneItem;

    goto :goto_2

    :cond_3
    iput-object p6, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->currentMilestone:Lcom/whoop/design/models/items/MilestoneItem;

    :goto_2
    and-int/lit8 p1, p1, 0x20

    if-nez p1, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->nextMilestone:Lcom/whoop/design/models/items/MilestoneItem;

    goto :goto_3

    :cond_4
    iput-object p7, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->nextMilestone:Lcom/whoop/design/models/items/MilestoneItem;

    :goto_3
    iput-wide p8, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->progressPercent:D

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Lcom/whoop/design/models/items/MilestoneItem;Lcom/whoop/design/models/items/MilestoneItem;D)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->title:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->description:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->style:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->currentMilestone:Lcom/whoop/design/models/items/MilestoneItem;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->nextMilestone:Lcom/whoop/design/models/items/MilestoneItem;

    .line 9
    iput-wide p7, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->progressPercent:D

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Lcom/whoop/design/models/items/MilestoneItem;Lcom/whoop/design/models/items/MilestoneItem;DILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p9, 0x4

    const/4 v0, 0x0

    if-eqz p10, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_1

    move-object p4, v0

    :cond_1
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_2

    move-object p5, v0

    :cond_2
    and-int/lit8 p9, p9, 0x20

    if-eqz p9, :cond_3

    move-wide p8, p7

    move-object p7, v0

    :goto_0
    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_3
    move-wide p8, p7

    move-object p7, p6

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {p1 .. p9}, Lcom/whoop/design/models/items/MilestoneProgressCardModel;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Lcom/whoop/design/models/items/MilestoneItem;Lcom/whoop/design/models/items/MilestoneItem;D)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/MilestoneProgressCardModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Lcom/whoop/design/models/items/MilestoneItem;Lcom/whoop/design/models/items/MilestoneItem;DILjava/lang/Object;)Lcom/whoop/design/models/items/MilestoneProgressCardModel;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->title:Lcom/whoop/design/util/TextResource;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->description:Lcom/whoop/design/util/TextResource;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->style:Ljava/lang/String;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->currentMilestone:Lcom/whoop/design/models/items/MilestoneItem;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->nextMilestone:Lcom/whoop/design/models/items/MilestoneItem;

    :cond_5
    and-int/lit8 p9, p9, 0x40

    if-eqz p9, :cond_6

    iget-wide p7, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->progressPercent:D

    :cond_6
    move-wide p9, p7

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Lcom/whoop/design/models/items/MilestoneItem;Lcom/whoop/design/models/items/MilestoneItem;D)Lcom/whoop/design/models/items/MilestoneProgressCardModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/MilestoneProgressCardModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lmd1/a;->a:Lmd1/a;

    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->title:Lcom/whoop/design/util/TextResource;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->description:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->style:Ljava/lang/String;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->style:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lcom/whoop/design/models/colortheme/ColorThemeModel$$serializer;->INSTANCE:Lcom/whoop/design/models/colortheme/ColorThemeModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->currentMilestone:Lcom/whoop/design/models/items/MilestoneItem;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lcom/whoop/design/models/items/MilestoneItem$$serializer;->INSTANCE:Lcom/whoop/design/models/items/MilestoneItem$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->currentMilestone:Lcom/whoop/design/models/items/MilestoneItem;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->nextMilestone:Lcom/whoop/design/models/items/MilestoneItem;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lcom/whoop/design/models/items/MilestoneItem$$serializer;->INSTANCE:Lcom/whoop/design/models/items/MilestoneItem$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->nextMilestone:Lcom/whoop/design/models/items/MilestoneItem;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x6

    iget-wide v1, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->progressPercent:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->description:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/colortheme/ColorThemeModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/items/MilestoneItem;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->currentMilestone:Lcom/whoop/design/models/items/MilestoneItem;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/items/MilestoneItem;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->nextMilestone:Lcom/whoop/design/models/items/MilestoneItem;

    return-object v0
.end method

.method public final component7()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->progressPercent:D

    return-wide v0
.end method

.method public final copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Lcom/whoop/design/models/items/MilestoneItem;Lcom/whoop/design/models/items/MilestoneItem;D)Lcom/whoop/design/models/items/MilestoneProgressCardModel;
    .locals 10

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/MilestoneProgressCardModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-wide/from16 v8, p7

    invoke-direct/range {v1 .. v9}, Lcom/whoop/design/models/items/MilestoneProgressCardModel;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/models/colortheme/ColorThemeModel;Lcom/whoop/design/models/items/MilestoneItem;Lcom/whoop/design/models/items/MilestoneItem;D)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/MilestoneProgressCardModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/MilestoneProgressCardModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->description:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->description:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->style:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->style:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->currentMilestone:Lcom/whoop/design/models/items/MilestoneItem;

    iget-object v3, p1, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->currentMilestone:Lcom/whoop/design/models/items/MilestoneItem;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->nextMilestone:Lcom/whoop/design/models/items/MilestoneItem;

    iget-object v3, p1, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->nextMilestone:Lcom/whoop/design/models/items/MilestoneItem;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->progressPercent:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->progressPercent:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    if-eqz p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getColors()Lcom/whoop/design/models/colortheme/ColorThemeModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    return-object v0
.end method

.method public final getCurrentMilestone()Lcom/whoop/design/models/items/MilestoneItem;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->currentMilestone:Lcom/whoop/design/models/items/MilestoneItem;

    return-object v0
.end method

.method public final getDescription()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->description:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getNextMilestone()Lcom/whoop/design/models/items/MilestoneItem;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->nextMilestone:Lcom/whoop/design/models/items/MilestoneItem;

    return-object v0
.end method

.method public final getProgressPercent()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->progressPercent:D

    return-wide v0
.end method

.method public final getStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->description:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->style:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/design/models/colortheme/ColorThemeModel;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->currentMilestone:Lcom/whoop/design/models/items/MilestoneItem;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/design/models/items/MilestoneItem;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->nextMilestone:Lcom/whoop/design/models/items/MilestoneItem;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/design/models/items/MilestoneItem;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-wide v1, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->progressPercent:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->description:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->style:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->colors:Lcom/whoop/design/models/colortheme/ColorThemeModel;

    iget-object v4, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->currentMilestone:Lcom/whoop/design/models/items/MilestoneItem;

    iget-object v5, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->nextMilestone:Lcom/whoop/design/models/items/MilestoneItem;

    iget-wide v6, p0, Lcom/whoop/design/models/items/MilestoneProgressCardModel;->progressPercent:D

    const-string v8, ", description="

    const-string v9, ", style="

    const-string v10, "MilestoneProgressCardModel(title="

    invoke-static {v10, v0, v8, v1, v9}, Lte0/d;->q(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", colors="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", currentMilestone="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", nextMilestone="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", progressPercent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v6, v7, v1, v0}, Lq63/c;->f(DLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
