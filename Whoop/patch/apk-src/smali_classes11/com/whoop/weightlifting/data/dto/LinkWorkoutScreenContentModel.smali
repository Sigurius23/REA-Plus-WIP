.class public final Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel$$serializer;,
        Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001c\u0008\u0087\u0008\u0018\u0000 N2\u00020\u0001:\u0002ONBY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011Bq\u0008\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001bJ\u0016\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#Jp\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010\'\u001a\u00020&H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010-\u001a\u00020,2\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001\u00a2\u0006\u0004\u00085\u00106R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u00108\u0012\u0004\u0008:\u0010;\u001a\u0004\u00089\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u00108\u0012\u0004\u0008=\u0010;\u001a\u0004\u0008<\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010>\u0012\u0004\u0008@\u0010;\u001a\u0004\u0008?\u0010\u001bR\"\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010A\u0012\u0004\u0008C\u0010;\u001a\u0004\u0008B\u0010\u001dR\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010>\u0012\u0004\u0008E\u0010;\u001a\u0004\u0008D\u0010\u001bR\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010>\u0012\u0004\u0008G\u0010;\u001a\u0004\u0008F\u0010\u001bR&\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010H\u0012\u0004\u0008J\u0010;\u001a\u0004\u0008I\u0010!R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010K\u0012\u0004\u0008M\u0010;\u001a\u0004\u0008L\u0010#\u00a8\u0006P"
    }
    d2 = {
        "Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;",
        "",
        "Lcom/whoop/design/util/TextResource;",
        "headline",
        "subtext",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "aiChatCallout",
        "Lcom/whoop/weightlifting/data/dto/AddTileModel;",
        "addTile",
        "builderCta",
        "divider",
        "",
        "Lcom/whoop/weightlifting/data/dto/MenuItemModel;",
        "templates",
        "Lcom/whoop/weightlifting/data/dto/MetaData;",
        "metadata",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/weightlifting/data/dto/AddTileModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MetaData;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/weightlifting/data/dto/AddTileModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/design/util/TextResource;",
        "component2",
        "component3",
        "()Lcom/whoop/design/models/DesignSystemModel;",
        "component4",
        "()Lcom/whoop/weightlifting/data/dto/AddTileModel;",
        "component5",
        "component6",
        "component7",
        "()Ljava/util/List;",
        "component8",
        "()Lcom/whoop/weightlifting/data/dto/MetaData;",
        "copy",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/weightlifting/data/dto/AddTileModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MetaData;)Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weightlifting_release",
        "(Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/design/util/TextResource;",
        "getHeadline",
        "getHeadline$annotations",
        "()V",
        "getSubtext",
        "getSubtext$annotations",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "getAiChatCallout",
        "getAiChatCallout$annotations",
        "Lcom/whoop/weightlifting/data/dto/AddTileModel;",
        "getAddTile",
        "getAddTile$annotations",
        "getBuilderCta",
        "getBuilderCta$annotations",
        "getDivider",
        "getDivider$annotations",
        "Ljava/util/List;",
        "getTemplates",
        "getTemplates$annotations",
        "Lcom/whoop/weightlifting/data/dto/MetaData;",
        "getMetadata",
        "getMetadata$annotations",
        "Companion",
        "$serializer",
        "weightlifting_release"
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

.field public static final Companion:Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel$Companion;


# instance fields
.field private final addTile:Lcom/whoop/weightlifting/data/dto/AddTileModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "add_tile"
    .end annotation
.end field

.field private final aiChatCallout:Lcom/whoop/design/models/DesignSystemModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "ai_chat_callout"
    .end annotation
.end field

.field private final builderCta:Lcom/whoop/design/models/DesignSystemModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "builder_cta"
    .end annotation
.end field

.field private final divider:Lcom/whoop/design/models/DesignSystemModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "divider"
    .end annotation
.end field

.field private final headline:Lcom/whoop/design/util/TextResource;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "headline"
    .end annotation
.end field

.field private final metadata:Lcom/whoop/weightlifting/data/dto/MetaData;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "metadata"
    .end annotation
.end field

.field private final subtext:Lcom/whoop/design/util/TextResource;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "subtext"
    .end annotation
.end field

.field private final templates:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "templates"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/MenuItemModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->Companion:Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lkt2/a;

    const/16 v4, 0x17

    invoke-direct {v3, v4}, Lkt2/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lkt2/a;

    const/16 v5, 0x18

    invoke-direct {v4, v5}, Lkt2/a;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v5, Lkt2/a;

    const/16 v6, 0x19

    invoke-direct {v5, v6}, Lkt2/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v6, Lkt2/a;

    const/16 v7, 0x1a

    invoke-direct {v6, v7}, Lkt2/a;-><init>(I)V

    invoke-static {v2, v6}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v0, v0, [Ll83/h;

    const/4 v6, 0x0

    aput-object v1, v0, v6

    const/4 v6, 0x1

    aput-object v1, v0, v6

    const/4 v6, 0x2

    aput-object v3, v0, v6

    const/4 v3, 0x3

    aput-object v1, v0, v3

    const/4 v3, 0x4

    aput-object v4, v0, v3

    const/4 v3, 0x5

    aput-object v5, v0, v3

    const/4 v3, 0x6

    aput-object v2, v0, v3

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/weightlifting/data/dto/AddTileModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel$$serializer;

    invoke-virtual {p10}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->headline:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->subtext:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->aiChatCallout:Lcom/whoop/design/models/DesignSystemModel;

    iput-object p5, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->addTile:Lcom/whoop/weightlifting/data/dto/AddTileModel;

    iput-object p6, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->builderCta:Lcom/whoop/design/models/DesignSystemModel;

    iput-object p7, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->divider:Lcom/whoop/design/models/DesignSystemModel;

    iput-object p8, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->templates:Ljava/util/List;

    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    return-void

    :cond_1
    iput-object p9, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/weightlifting/data/dto/AddTileModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MetaData;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Lcom/whoop/weightlifting/data/dto/AddTileModel;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/MenuItemModel;",
            ">;",
            "Lcom/whoop/weightlifting/data/dto/MetaData;",
            ")V"
        }
    .end annotation

    const-string v0, "headline"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "templates"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->headline:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-object p2, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->subtext:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->aiChatCallout:Lcom/whoop/design/models/DesignSystemModel;

    .line 6
    iput-object p4, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->addTile:Lcom/whoop/weightlifting/data/dto/AddTileModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->builderCta:Lcom/whoop/design/models/DesignSystemModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->divider:Lcom/whoop/design/models/DesignSystemModel;

    .line 9
    iput-object p7, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->templates:Ljava/util/List;

    .line 10
    iput-object p8, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/weightlifting/data/dto/AddTileModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MetaData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    move/from16 v0, p9

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v9, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    goto :goto_1

    :cond_0
    move-object/from16 v9, p8

    goto :goto_0

    .line 11
    :goto_1
    invoke-direct/range {v1 .. v9}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/weightlifting/data/dto/AddTileModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MetaData;)V

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 6

    new-instance v0, Lwc3/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lwc3/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v5, v2, [Ljava/lang/annotation/Annotation;

    invoke-direct {v4, v1, v5}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    new-array v2, v2, [Lwc3/c;

    invoke-direct {v0, v3, v1, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 6

    new-instance v0, Lwc3/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lwc3/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v5, v2, [Ljava/lang/annotation/Annotation;

    invoke-direct {v4, v1, v5}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    new-array v2, v2, [Lwc3/c;

    invoke-direct {v0, v3, v1, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 6

    new-instance v0, Lwc3/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lwc3/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v5, v2, [Ljava/lang/annotation/Annotation;

    invoke-direct {v4, v1, v5}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    new-array v2, v2, [Lwc3/c;

    invoke-direct {v0, v3, v1, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/weightlifting/data/dto/MenuItemModel$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/MenuItemModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/weightlifting/data/dto/AddTileModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MetaData;ILjava/lang/Object;)Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->headline:Lcom/whoop/design/util/TextResource;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->subtext:Lcom/whoop/design/util/TextResource;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->aiChatCallout:Lcom/whoop/design/models/DesignSystemModel;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->addTile:Lcom/whoop/weightlifting/data/dto/AddTileModel;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->builderCta:Lcom/whoop/design/models/DesignSystemModel;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->divider:Lcom/whoop/design/models/DesignSystemModel;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->templates:Ljava/util/List;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

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

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/weightlifting/data/dto/AddTileModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MetaData;)Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getAddTile$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "add_tile"
    .end annotation

    return-void
.end method

.method public static synthetic getAiChatCallout$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "ai_chat_callout"
    .end annotation

    return-void
.end method

.method public static synthetic getBuilderCta$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "builder_cta"
    .end annotation

    return-void
.end method

.method public static synthetic getDivider$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "divider"
    .end annotation

    return-void
.end method

.method public static synthetic getHeadline$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "headline"
    .end annotation

    return-void
.end method

.method public static synthetic getMetadata$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "metadata"
    .end annotation

    return-void
.end method

.method public static synthetic getSubtext$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "subtext"
    .end annotation

    return-void
.end method

.method public static synthetic getTemplates$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "templates"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$weightlifting_release(Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lmd1/a;->a:Lmd1/a;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->headline:Lcom/whoop/design/util/TextResource;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->subtext:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->aiChatCallout:Lcom/whoop/design/models/DesignSystemModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/weightlifting/data/dto/AddTileModel$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/AddTileModel$$serializer;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->addTile:Lcom/whoop/weightlifting/data/dto/AddTileModel;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->builderCta:Lcom/whoop/design/models/DesignSystemModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->divider:Lcom/whoop/design/models/DesignSystemModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->templates:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/whoop/weightlifting/data/dto/MetaData$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/MetaData$$serializer;

    iget-object p0, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->headline:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->subtext:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->aiChatCallout:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final component4()Lcom/whoop/weightlifting/data/dto/AddTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->addTile:Lcom/whoop/weightlifting/data/dto/AddTileModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->builderCta:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->divider:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/MenuItemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->templates:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Lcom/whoop/weightlifting/data/dto/MetaData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/weightlifting/data/dto/AddTileModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MetaData;)Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Lcom/whoop/weightlifting/data/dto/AddTileModel;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/MenuItemModel;",
            ">;",
            "Lcom/whoop/weightlifting/data/dto/MetaData;",
            ")",
            "Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;"
        }
    .end annotation

    const-string v0, "headline"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "templates"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/weightlifting/data/dto/AddTileModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/weightlifting/data/dto/MetaData;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->headline:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->headline:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->subtext:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->subtext:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->aiChatCallout:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->aiChatCallout:Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->addTile:Lcom/whoop/weightlifting/data/dto/AddTileModel;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->addTile:Lcom/whoop/weightlifting/data/dto/AddTileModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->builderCta:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->builderCta:Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->divider:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->divider:Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->templates:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->templates:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    iget-object p1, p1, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getAddTile()Lcom/whoop/weightlifting/data/dto/AddTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->addTile:Lcom/whoop/weightlifting/data/dto/AddTileModel;

    return-object v0
.end method

.method public final getAiChatCallout()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->aiChatCallout:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final getBuilderCta()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->builderCta:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final getDivider()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->divider:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final getHeadline()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->headline:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getMetadata()Lcom/whoop/weightlifting/data/dto/MetaData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    return-object v0
.end method

.method public final getSubtext()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->subtext:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getTemplates()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/MenuItemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->templates:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->headline:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->subtext:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->aiChatCallout:Lcom/whoop/design/models/DesignSystemModel;

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

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->addTile:Lcom/whoop/weightlifting/data/dto/AddTileModel;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/dto/AddTileModel;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->builderCta:Lcom/whoop/design/models/DesignSystemModel;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->divider:Lcom/whoop/design/models/DesignSystemModel;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->templates:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/dto/MetaData;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->headline:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->subtext:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->aiChatCallout:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->addTile:Lcom/whoop/weightlifting/data/dto/AddTileModel;

    iget-object v4, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->builderCta:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v5, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->divider:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v6, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->templates:Ljava/util/List;

    iget-object v7, p0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutScreenContentModel;->metadata:Lcom/whoop/weightlifting/data/dto/MetaData;

    const-string v8, ", subtext="

    const-string v9, ", aiChatCallout="

    const-string v10, "LinkWorkoutScreenContentModel(headline="

    invoke-static {v10, v0, v8, v1, v9}, Lte0/d;->q(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", addTile="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", builderCta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", divider="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", templates="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", metadata="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
