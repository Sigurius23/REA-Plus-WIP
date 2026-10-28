.class public final Lcom/whoop/design/models/items/ActivityModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/ActivityModel$$serializer;,
        Lcom/whoop/design/models/items/ActivityModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001b\u0008\u0087\u0008\u0018\u0000 W2\u00020\u0001:\u0002XWB\u00a5\u0001\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016B\u00a7\u0001\u0008\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008\u0015\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001dJ\u0010\u0010%\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001dJ\u0010\u0010&\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u001dJ\u0012\u0010\'\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\u001dJ\u0012\u0010(\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010\u001dJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\u00b0\u0001\u0010/\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00022\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00c6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u0010\u00101\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00081\u0010\u001dJ\u0010\u00102\u001a\u00020\u0017H\u00d6\u0001\u00a2\u0006\u0004\u00082\u00103J\u001a\u00107\u001a\u0002062\u0008\u00105\u001a\u0004\u0018\u000104H\u00d6\u0003\u00a2\u0006\u0004\u00087\u00108J\'\u0010A\u001a\u00020>2\u0006\u00109\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0001\u00a2\u0006\u0004\u0008?\u0010@R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010B\u001a\u0004\u0008C\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010D\u001a\u0004\u0008E\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010D\u001a\u0004\u0008F\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010D\u001a\u0004\u0008G\u0010\u001fR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010D\u001a\u0004\u0008H\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010B\u001a\u0004\u0008I\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010B\u001a\u0004\u0008J\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010B\u001a\u0004\u0008K\u0010\u001dR\u0017\u0010\u000c\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010B\u001a\u0004\u0008L\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010B\u001a\u0004\u0008M\u0010\u001dR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010N\u001a\u0004\u0008O\u0010)R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010P\u001a\u0004\u0008Q\u0010+R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010B\u001a\u0004\u0008R\u0010\u001dR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010S\u0012\u0004\u0008U\u0010V\u001a\u0004\u0008T\u0010.\u00a8\u0006Y"
    }
    d2 = {
        "Lcom/whoop/design/models/items/ActivityModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "scoreDisplay",
        "startTimeText",
        "endTimeText",
        "iconUrl",
        "secondaryIconUrl",
        "status",
        "type",
        "activityV2Id",
        "Lcom/whoop/design/models/items/During;",
        "during",
        "Lcom/whoop/design/models/items/DetectedActivityMetadata;",
        "detectedActivityMetadata",
        "ctaState",
        "Lcom/whoop/navigation/e;",
        "destination",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/During;Lcom/whoop/design/models/items/DetectedActivityMetadata;Ljava/lang/String;Lcom/whoop/navigation/e;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/During;Lcom/whoop/design/models/items/DetectedActivityMetadata;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/design/util/TextResource;",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "()Lcom/whoop/design/models/items/During;",
        "component12",
        "()Lcom/whoop/design/models/items/DetectedActivityMetadata;",
        "component13",
        "component14",
        "()Lcom/whoop/navigation/e;",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/During;Lcom/whoop/design/models/items/DetectedActivityMetadata;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/design/models/items/ActivityModel;",
        "toString",
        "hashCode",
        "()I",
        "",
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
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/ActivityModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "Lcom/whoop/design/util/TextResource;",
        "getTitle",
        "getScoreDisplay",
        "getStartTimeText",
        "getEndTimeText",
        "getIconUrl",
        "getSecondaryIconUrl",
        "getStatus",
        "getType",
        "getActivityV2Id",
        "Lcom/whoop/design/models/items/During;",
        "getDuring",
        "Lcom/whoop/design/models/items/DetectedActivityMetadata;",
        "getDetectedActivityMetadata",
        "getCtaState",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "getDestination$annotations",
        "()V",
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

.field public static final Companion:Lcom/whoop/design/models/items/ActivityModel$Companion;


# instance fields
.field private final activityV2Id:Ljava/lang/String;

.field private final ctaState:Ljava/lang/String;

.field private final destination:Lcom/whoop/navigation/e;

.field private final detectedActivityMetadata:Lcom/whoop/design/models/items/DetectedActivityMetadata;

.field private final during:Lcom/whoop/design/models/items/During;

.field private final endTimeText:Lcom/whoop/design/util/TextResource;

.field private final iconUrl:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final scoreDisplay:Lcom/whoop/design/util/TextResource;

.field private final secondaryIconUrl:Ljava/lang/String;

.field private final startTimeText:Lcom/whoop/design/util/TextResource;

.field private final status:Ljava/lang/String;

.field private final title:Lcom/whoop/design/util/TextResource;

.field private final type:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/design/models/items/ActivityModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/ActivityModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/ActivityModel;->Companion:Lcom/whoop/design/models/items/ActivityModel$Companion;

    sget v0, Lcom/whoop/navigation/e;->d:I

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int/2addr v0, v2

    or-int/2addr v0, v2

    or-int/2addr v0, v2

    or-int/2addr v0, v2

    sput v0, Lcom/whoop/design/models/items/ActivityModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lun1/f;

    const/16 v3, 0x8

    invoke-direct {v2, v3}, Lun1/f;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/16 v2, 0xe

    new-array v2, v2, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v2, v4

    const/4 v4, 0x1

    aput-object v1, v2, v4

    const/4 v4, 0x2

    aput-object v1, v2, v4

    const/4 v4, 0x3

    aput-object v1, v2, v4

    const/4 v4, 0x4

    aput-object v1, v2, v4

    const/4 v4, 0x5

    aput-object v1, v2, v4

    const/4 v4, 0x6

    aput-object v1, v2, v4

    const/4 v4, 0x7

    aput-object v1, v2, v4

    aput-object v1, v2, v3

    const/16 v3, 0x9

    aput-object v1, v2, v3

    const/16 v3, 0xa

    aput-object v1, v2, v3

    const/16 v3, 0xb

    aput-object v1, v2, v3

    const/16 v3, 0xc

    aput-object v1, v2, v3

    const/16 v1, 0xd

    aput-object v0, v2, v1

    sput-object v2, Lcom/whoop/design/models/items/ActivityModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/During;Lcom/whoop/design/models/items/DetectedActivityMetadata;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit16 v0, p1, 0x400

    const/16 v1, 0x400

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/design/models/items/ActivityModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ActivityModel$$serializer;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ActivityModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    const-string v1, ""

    if-nez v0, :cond_1

    iput-object v1, p0, Lcom/whoop/design/models/items/ActivityModel;->id:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p2, p0, Lcom/whoop/design/models/items/ActivityModel;->id:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_2

    .line 2
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p2

    .line 3
    iput-object p2, p0, Lcom/whoop/design/models/items/ActivityModel;->title:Lcom/whoop/design/util/TextResource;

    goto :goto_1

    :cond_2
    iput-object p3, p0, Lcom/whoop/design/models/items/ActivityModel;->title:Lcom/whoop/design/util/TextResource;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_3

    .line 4
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p2

    .line 5
    iput-object p2, p0, Lcom/whoop/design/models/items/ActivityModel;->scoreDisplay:Lcom/whoop/design/util/TextResource;

    goto :goto_2

    :cond_3
    iput-object p4, p0, Lcom/whoop/design/models/items/ActivityModel;->scoreDisplay:Lcom/whoop/design/util/TextResource;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_4

    .line 6
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p2

    .line 7
    iput-object p2, p0, Lcom/whoop/design/models/items/ActivityModel;->startTimeText:Lcom/whoop/design/util/TextResource;

    goto :goto_3

    :cond_4
    iput-object p5, p0, Lcom/whoop/design/models/items/ActivityModel;->startTimeText:Lcom/whoop/design/util/TextResource;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_5

    .line 8
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p2

    .line 9
    iput-object p2, p0, Lcom/whoop/design/models/items/ActivityModel;->endTimeText:Lcom/whoop/design/util/TextResource;

    goto :goto_4

    :cond_5
    iput-object p6, p0, Lcom/whoop/design/models/items/ActivityModel;->endTimeText:Lcom/whoop/design/util/TextResource;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_6

    iput-object v1, p0, Lcom/whoop/design/models/items/ActivityModel;->iconUrl:Ljava/lang/String;

    goto :goto_5

    :cond_6
    iput-object p7, p0, Lcom/whoop/design/models/items/ActivityModel;->iconUrl:Ljava/lang/String;

    :goto_5
    and-int/lit8 p2, p1, 0x40

    const/4 p3, 0x0

    if-nez p2, :cond_7

    iput-object p3, p0, Lcom/whoop/design/models/items/ActivityModel;->secondaryIconUrl:Ljava/lang/String;

    goto :goto_6

    :cond_7
    iput-object p8, p0, Lcom/whoop/design/models/items/ActivityModel;->secondaryIconUrl:Ljava/lang/String;

    :goto_6
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_8

    iput-object v1, p0, Lcom/whoop/design/models/items/ActivityModel;->status:Ljava/lang/String;

    goto :goto_7

    :cond_8
    iput-object p9, p0, Lcom/whoop/design/models/items/ActivityModel;->status:Ljava/lang/String;

    :goto_7
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_9

    iput-object v1, p0, Lcom/whoop/design/models/items/ActivityModel;->type:Ljava/lang/String;

    goto :goto_8

    :cond_9
    iput-object p10, p0, Lcom/whoop/design/models/items/ActivityModel;->type:Ljava/lang/String;

    :goto_8
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_a

    iput-object v1, p0, Lcom/whoop/design/models/items/ActivityModel;->activityV2Id:Ljava/lang/String;

    goto :goto_9

    :cond_a
    iput-object p11, p0, Lcom/whoop/design/models/items/ActivityModel;->activityV2Id:Ljava/lang/String;

    :goto_9
    iput-object p12, p0, Lcom/whoop/design/models/items/ActivityModel;->during:Lcom/whoop/design/models/items/During;

    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_b

    iput-object p3, p0, Lcom/whoop/design/models/items/ActivityModel;->detectedActivityMetadata:Lcom/whoop/design/models/items/DetectedActivityMetadata;

    goto :goto_a

    :cond_b
    iput-object p13, p0, Lcom/whoop/design/models/items/ActivityModel;->detectedActivityMetadata:Lcom/whoop/design/models/items/DetectedActivityMetadata;

    :goto_a
    and-int/lit16 p2, p1, 0x1000

    if-nez p2, :cond_c

    iput-object p3, p0, Lcom/whoop/design/models/items/ActivityModel;->ctaState:Ljava/lang/String;

    goto :goto_b

    :cond_c
    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/whoop/design/models/items/ActivityModel;->ctaState:Ljava/lang/String;

    :goto_b
    and-int/lit16 p1, p1, 0x2000

    if-nez p1, :cond_d

    iput-object p3, p0, Lcom/whoop/design/models/items/ActivityModel;->destination:Lcom/whoop/navigation/e;

    return-void

    :cond_d
    move-object/from16 p1, p15

    iput-object p1, p0, Lcom/whoop/design/models/items/ActivityModel;->destination:Lcom/whoop/navigation/e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/During;Lcom/whoop/design/models/items/DetectedActivityMetadata;Ljava/lang/String;Lcom/whoop/navigation/e;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconUrl"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lcom/whoop/design/models/items/ActivityModel;->id:Ljava/lang/String;

    .line 12
    iput-object p2, p0, Lcom/whoop/design/models/items/ActivityModel;->title:Lcom/whoop/design/util/TextResource;

    .line 13
    iput-object p3, p0, Lcom/whoop/design/models/items/ActivityModel;->scoreDisplay:Lcom/whoop/design/util/TextResource;

    .line 14
    iput-object p4, p0, Lcom/whoop/design/models/items/ActivityModel;->startTimeText:Lcom/whoop/design/util/TextResource;

    .line 15
    iput-object p5, p0, Lcom/whoop/design/models/items/ActivityModel;->endTimeText:Lcom/whoop/design/util/TextResource;

    .line 16
    iput-object p6, p0, Lcom/whoop/design/models/items/ActivityModel;->iconUrl:Ljava/lang/String;

    .line 17
    iput-object p7, p0, Lcom/whoop/design/models/items/ActivityModel;->secondaryIconUrl:Ljava/lang/String;

    .line 18
    iput-object p8, p0, Lcom/whoop/design/models/items/ActivityModel;->status:Ljava/lang/String;

    .line 19
    iput-object p9, p0, Lcom/whoop/design/models/items/ActivityModel;->type:Ljava/lang/String;

    .line 20
    iput-object p10, p0, Lcom/whoop/design/models/items/ActivityModel;->activityV2Id:Ljava/lang/String;

    .line 21
    iput-object p11, p0, Lcom/whoop/design/models/items/ActivityModel;->during:Lcom/whoop/design/models/items/During;

    .line 22
    iput-object p12, p0, Lcom/whoop/design/models/items/ActivityModel;->detectedActivityMetadata:Lcom/whoop/design/models/items/DetectedActivityMetadata;

    .line 23
    iput-object p13, p0, Lcom/whoop/design/models/items/ActivityModel;->ctaState:Ljava/lang/String;

    .line 24
    iput-object p14, p0, Lcom/whoop/design/models/items/ActivityModel;->destination:Lcom/whoop/navigation/e;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/During;Lcom/whoop/design/models/items/DetectedActivityMetadata;Ljava/lang/String;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 18

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    .line 25
    const-string v2, ""

    if-eqz v1, :cond_0

    move-object v4, v2

    goto :goto_0

    :cond_0
    move-object/from16 v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    .line 26
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move-object v5, v1

    goto :goto_1

    :cond_1
    move-object/from16 v5, p2

    :goto_1
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_2

    .line 27
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move-object v6, v1

    goto :goto_2

    :cond_2
    move-object/from16 v6, p3

    :goto_2
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_3

    .line 28
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move-object v7, v1

    goto :goto_3

    :cond_3
    move-object/from16 v7, p4

    :goto_3
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_4

    .line 29
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move-object v8, v1

    goto :goto_4

    :cond_4
    move-object/from16 v8, p5

    :goto_4
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_5

    move-object v9, v2

    goto :goto_5

    :cond_5
    move-object/from16 v9, p6

    :goto_5
    and-int/lit8 v1, v0, 0x40

    const/4 v3, 0x0

    if-eqz v1, :cond_6

    move-object v10, v3

    goto :goto_6

    :cond_6
    move-object/from16 v10, p7

    :goto_6
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_7

    move-object v11, v2

    goto :goto_7

    :cond_7
    move-object/from16 v11, p8

    :goto_7
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_8

    move-object v12, v2

    goto :goto_8

    :cond_8
    move-object/from16 v12, p9

    :goto_8
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_9

    move-object v13, v2

    goto :goto_9

    :cond_9
    move-object/from16 v13, p10

    :goto_9
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_a

    move-object v15, v3

    goto :goto_a

    :cond_a
    move-object/from16 v15, p12

    :goto_a
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_b

    move-object/from16 v16, v3

    goto :goto_b

    :cond_b
    move-object/from16 v16, p13

    :goto_b
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_c

    move-object/from16 v17, v3

    move-object/from16 v14, p11

    move-object/from16 v3, p0

    goto :goto_c

    :cond_c
    move-object/from16 v17, p14

    move-object/from16 v3, p0

    move-object/from16 v14, p11

    .line 30
    :goto_c
    invoke-direct/range {v3 .. v17}, Lcom/whoop/design/models/items/ActivityModel;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/During;Lcom/whoop/design/models/items/DetectedActivityMetadata;Ljava/lang/String;Lcom/whoop/navigation/e;)V

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

    invoke-static {}, Lcom/whoop/design/models/items/ActivityModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/ActivityModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/ActivityModel;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/During;Lcom/whoop/design/models/items/DetectedActivityMetadata;Ljava/lang/String;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lcom/whoop/design/models/items/ActivityModel;
    .locals 14

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/whoop/design/models/items/ActivityModel;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/whoop/design/models/items/ActivityModel;->title:Lcom/whoop/design/util/TextResource;

    goto :goto_1

    :cond_1
    move-object/from16 v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/whoop/design/models/items/ActivityModel;->scoreDisplay:Lcom/whoop/design/util/TextResource;

    goto :goto_2

    :cond_2
    move-object/from16 v3, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    iget-object v4, p0, Lcom/whoop/design/models/items/ActivityModel;->startTimeText:Lcom/whoop/design/util/TextResource;

    goto :goto_3

    :cond_3
    move-object/from16 v4, p4

    :goto_3
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_4

    iget-object v5, p0, Lcom/whoop/design/models/items/ActivityModel;->endTimeText:Lcom/whoop/design/util/TextResource;

    goto :goto_4

    :cond_4
    move-object/from16 v5, p5

    :goto_4
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    iget-object v6, p0, Lcom/whoop/design/models/items/ActivityModel;->iconUrl:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v6, p6

    :goto_5
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_6

    iget-object v7, p0, Lcom/whoop/design/models/items/ActivityModel;->secondaryIconUrl:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v7, p7

    :goto_6
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_7

    iget-object v8, p0, Lcom/whoop/design/models/items/ActivityModel;->status:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v8, p8

    :goto_7
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_8

    iget-object v9, p0, Lcom/whoop/design/models/items/ActivityModel;->type:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v9, p9

    :goto_8
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    iget-object v10, p0, Lcom/whoop/design/models/items/ActivityModel;->activityV2Id:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v10, p10

    :goto_9
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_a

    iget-object v11, p0, Lcom/whoop/design/models/items/ActivityModel;->during:Lcom/whoop/design/models/items/During;

    goto :goto_a

    :cond_a
    move-object/from16 v11, p11

    :goto_a
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_b

    iget-object v12, p0, Lcom/whoop/design/models/items/ActivityModel;->detectedActivityMetadata:Lcom/whoop/design/models/items/DetectedActivityMetadata;

    goto :goto_b

    :cond_b
    move-object/from16 v12, p12

    :goto_b
    and-int/lit16 v13, v0, 0x1000

    if-eqz v13, :cond_c

    iget-object v13, p0, Lcom/whoop/design/models/items/ActivityModel;->ctaState:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v13, p13

    :goto_c
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/whoop/design/models/items/ActivityModel;->destination:Lcom/whoop/navigation/e;

    move-object/from16 p15, v0

    :goto_d
    move-object p1, p0

    move-object/from16 p2, v1

    move-object/from16 p3, v2

    move-object/from16 p4, v3

    move-object/from16 p5, v4

    move-object/from16 p6, v5

    move-object/from16 p7, v6

    move-object/from16 p8, v7

    move-object/from16 p9, v8

    move-object/from16 p10, v9

    move-object/from16 p11, v10

    move-object/from16 p12, v11

    move-object/from16 p13, v12

    move-object/from16 p14, v13

    goto :goto_e

    :cond_d
    move-object/from16 p15, p14

    goto :goto_d

    :goto_e
    invoke-virtual/range {p1 .. p15}, Lcom/whoop/design/models/items/ActivityModel;->copy(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/During;Lcom/whoop/design/models/items/DetectedActivityMetadata;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/design/models/items/ActivityModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getDestination$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/ActivityModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/design/models/items/ActivityModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    const-string v3, ""

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/ActivityModel;->id:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v4, p0, Lcom/whoop/design/models/items/ActivityModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/ActivityModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    sget-object v2, Lmd1/a;->a:Lmd1/a;

    iget-object v4, p0, Lcom/whoop/design/models/items/ActivityModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v1, v2, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/ActivityModel;->scoreDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :goto_2
    sget-object v2, Lmd1/a;->a:Lmd1/a;

    iget-object v4, p0, Lcom/whoop/design/models/items/ActivityModel;->scoreDisplay:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v1, v2, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/items/ActivityModel;->startTimeText:Lcom/whoop/design/util/TextResource;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :goto_3
    sget-object v2, Lmd1/a;->a:Lmd1/a;

    iget-object v4, p0, Lcom/whoop/design/models/items/ActivityModel;->startTimeText:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v1, v2, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/design/models/items/ActivityModel;->endTimeText:Lcom/whoop/design/util/TextResource;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    :goto_4
    sget-object v2, Lmd1/a;->a:Lmd1/a;

    iget-object v4, p0, Lcom/whoop/design/models/items/ActivityModel;->endTimeText:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v1, v2, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/design/models/items/ActivityModel;->iconUrl:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    :goto_5
    iget-object v2, p0, Lcom/whoop/design/models/items/ActivityModel;->iconUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_b
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lcom/whoop/design/models/items/ActivityModel;->secondaryIconUrl:Ljava/lang/String;

    if-eqz v2, :cond_d

    :goto_6
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v4, p0, Lcom/whoop/design/models/items/ActivityModel;->secondaryIconUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_7

    :cond_e
    iget-object v2, p0, Lcom/whoop/design/models/items/ActivityModel;->status:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    :goto_7
    iget-object v2, p0, Lcom/whoop/design/models/items/ActivityModel;->status:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_f
    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_10

    goto :goto_8

    :cond_10
    iget-object v2, p0, Lcom/whoop/design/models/items/ActivityModel;->type:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    :goto_8
    iget-object v2, p0, Lcom/whoop/design/models/items/ActivityModel;->type:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_11
    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_12

    goto :goto_9

    :cond_12
    iget-object v2, p0, Lcom/whoop/design/models/items/ActivityModel;->activityV2Id:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    :goto_9
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/ActivityModel;->activityV2Id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_13
    sget-object v1, Lcom/whoop/design/models/items/During$$serializer;->INSTANCE:Lcom/whoop/design/models/items/During$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/ActivityModel;->during:Lcom/whoop/design/models/items/During;

    const/16 v3, 0xa

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xb

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_14

    goto :goto_a

    :cond_14
    iget-object v2, p0, Lcom/whoop/design/models/items/ActivityModel;->detectedActivityMetadata:Lcom/whoop/design/models/items/DetectedActivityMetadata;

    if-eqz v2, :cond_15

    :goto_a
    sget-object v2, Lcom/whoop/design/models/items/DetectedActivityMetadata$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DetectedActivityMetadata$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/ActivityModel;->detectedActivityMetadata:Lcom/whoop/design/models/items/DetectedActivityMetadata;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_15
    const/16 v1, 0xc

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_16

    goto :goto_b

    :cond_16
    iget-object v2, p0, Lcom/whoop/design/models/items/ActivityModel;->ctaState:Ljava/lang/String;

    if-eqz v2, :cond_17

    :goto_b
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/ActivityModel;->ctaState:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_17
    const/16 v1, 0xd

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_18

    goto :goto_c

    :cond_18
    iget-object v2, p0, Lcom/whoop/design/models/items/ActivityModel;->destination:Lcom/whoop/navigation/e;

    if-eqz v2, :cond_19

    :goto_c
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/design/models/items/ActivityModel;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_19
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ActivityModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ActivityModel;->activityV2Id:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Lcom/whoop/design/models/items/During;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ActivityModel;->during:Lcom/whoop/design/models/items/During;

    return-object v0
.end method

.method public final component12()Lcom/whoop/design/models/items/DetectedActivityMetadata;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ActivityModel;->detectedActivityMetadata:Lcom/whoop/design/models/items/DetectedActivityMetadata;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ActivityModel;->ctaState:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ActivityModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ActivityModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ActivityModel;->scoreDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ActivityModel;->startTimeText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ActivityModel;->endTimeText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ActivityModel;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ActivityModel;->secondaryIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ActivityModel;->status:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ActivityModel;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/During;Lcom/whoop/design/models/items/DetectedActivityMetadata;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/design/models/items/ActivityModel;
    .locals 16

    const-string v0, "title"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconUrl"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/ActivityModel;

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    invoke-direct/range {v1 .. v15}, Lcom/whoop/design/models/items/ActivityModel;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/During;Lcom/whoop/design/models/items/DetectedActivityMetadata;Ljava/lang/String;Lcom/whoop/navigation/e;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/ActivityModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/ActivityModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/ActivityModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ActivityModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/ActivityModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/ActivityModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/ActivityModel;->scoreDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/ActivityModel;->scoreDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/ActivityModel;->startTimeText:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/ActivityModel;->startTimeText:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/ActivityModel;->endTimeText:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/ActivityModel;->endTimeText:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/ActivityModel;->iconUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ActivityModel;->iconUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/ActivityModel;->secondaryIconUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ActivityModel;->secondaryIconUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/ActivityModel;->status:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ActivityModel;->status:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/ActivityModel;->type:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ActivityModel;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/ActivityModel;->activityV2Id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ActivityModel;->activityV2Id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/design/models/items/ActivityModel;->during:Lcom/whoop/design/models/items/During;

    iget-object v3, p1, Lcom/whoop/design/models/items/ActivityModel;->during:Lcom/whoop/design/models/items/During;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/items/ActivityModel;->detectedActivityMetadata:Lcom/whoop/design/models/items/DetectedActivityMetadata;

    iget-object v3, p1, Lcom/whoop/design/models/items/ActivityModel;->detectedActivityMetadata:Lcom/whoop/design/models/items/DetectedActivityMetadata;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/design/models/items/ActivityModel;->ctaState:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ActivityModel;->ctaState:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/design/models/items/ActivityModel;->destination:Lcom/whoop/navigation/e;

    iget-object p1, p1, Lcom/whoop/design/models/items/ActivityModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    return v2

    :cond_f
    return v0
.end method

.method public final getActivityV2Id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ActivityModel;->activityV2Id:Ljava/lang/String;

    return-object v0
.end method

.method public final getCtaState()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ActivityModel;->ctaState:Ljava/lang/String;

    return-object v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ActivityModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getDetectedActivityMetadata()Lcom/whoop/design/models/items/DetectedActivityMetadata;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ActivityModel;->detectedActivityMetadata:Lcom/whoop/design/models/items/DetectedActivityMetadata;

    return-object v0
.end method

.method public final getDuring()Lcom/whoop/design/models/items/During;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ActivityModel;->during:Lcom/whoop/design/models/items/During;

    return-object v0
.end method

.method public final getEndTimeText()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ActivityModel;->endTimeText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ActivityModel;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ActivityModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getScoreDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ActivityModel;->scoreDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getSecondaryIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ActivityModel;->secondaryIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getStartTimeText()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ActivityModel;->startTimeText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getStatus()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ActivityModel;->status:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ActivityModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ActivityModel;->type:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/ActivityModel;->id:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/ActivityModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v3, v2}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/ActivityModel;->scoreDisplay:Lcom/whoop/design/util/TextResource;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/ActivityModel;->startTimeText:Lcom/whoop/design/util/TextResource;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/ActivityModel;->endTimeText:Lcom/whoop/design/util/TextResource;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/ActivityModel;->iconUrl:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/ActivityModel;->secondaryIconUrl:Ljava/lang/String;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/ActivityModel;->status:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/ActivityModel;->type:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/ActivityModel;->activityV2Id:Ljava/lang/String;

    if-nez v3, :cond_5

    move v3, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/ActivityModel;->during:Lcom/whoop/design/models/items/During;

    if-nez v3, :cond_6

    move v3, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Lcom/whoop/design/models/items/During;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/ActivityModel;->detectedActivityMetadata:Lcom/whoop/design/models/items/DetectedActivityMetadata;

    if-nez v3, :cond_7

    move v3, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v3}, Lcom/whoop/design/models/items/DetectedActivityMetadata;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/ActivityModel;->ctaState:Ljava/lang/String;

    if-nez v3, :cond_8

    move v3, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/design/models/items/ActivityModel;->destination:Lcom/whoop/navigation/e;

    if-nez v2, :cond_9

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/design/models/items/ActivityModel;->id:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/design/models/items/ActivityModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v3, v0, Lcom/whoop/design/models/items/ActivityModel;->scoreDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v4, v0, Lcom/whoop/design/models/items/ActivityModel;->startTimeText:Lcom/whoop/design/util/TextResource;

    iget-object v5, v0, Lcom/whoop/design/models/items/ActivityModel;->endTimeText:Lcom/whoop/design/util/TextResource;

    iget-object v6, v0, Lcom/whoop/design/models/items/ActivityModel;->iconUrl:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/design/models/items/ActivityModel;->secondaryIconUrl:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/design/models/items/ActivityModel;->status:Ljava/lang/String;

    iget-object v9, v0, Lcom/whoop/design/models/items/ActivityModel;->type:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/design/models/items/ActivityModel;->activityV2Id:Ljava/lang/String;

    iget-object v11, v0, Lcom/whoop/design/models/items/ActivityModel;->during:Lcom/whoop/design/models/items/During;

    iget-object v12, v0, Lcom/whoop/design/models/items/ActivityModel;->detectedActivityMetadata:Lcom/whoop/design/models/items/DetectedActivityMetadata;

    iget-object v13, v0, Lcom/whoop/design/models/items/ActivityModel;->ctaState:Ljava/lang/String;

    iget-object v14, v0, Lcom/whoop/design/models/items/ActivityModel;->destination:Lcom/whoop/navigation/e;

    const-string v15, ", title="

    const-string v0, ", scoreDisplay="

    move-object/from16 v16, v13

    const-string v13, "ActivityModel(id="

    invoke-static {v13, v1, v15, v2, v0}, Lq63/c;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", startTimeText="

    const-string v2, ", endTimeText="

    invoke-static {v0, v3, v1, v4, v2}, Lq63/c;->y(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    const-string v1, ", iconUrl="

    const-string v2, ", secondaryIconUrl="

    invoke-static {v0, v5, v1, v6, v2}, Lq63/c;->z(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", status="

    const-string v2, ", type="

    invoke-static {v0, v7, v1, v8, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", activityV2Id="

    const-string v2, ", during="

    invoke-static {v0, v9, v1, v10, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", detectedActivityMetadata="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ctaState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", destination="

    const-string v2, ")"

    move-object/from16 v3, v16

    invoke-static {v0, v3, v1, v14, v2}, Lev/n;->j(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
