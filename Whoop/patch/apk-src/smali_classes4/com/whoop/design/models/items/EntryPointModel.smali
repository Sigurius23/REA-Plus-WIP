.class public final Lcom/whoop/design/models/items/EntryPointModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/EntryPointModel$$serializer;,
        Lcom/whoop/design/models/items/EntryPointModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001d\u0008\u0087\u0008\u0018\u0000 ]2\u00020\u0001:\u0002^]B\u0087\u0001\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018B\u009d\u0001\u0008\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0004\u0008\u0017\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010!J\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001fJ\u0010\u0010&\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010(\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0004\u00080\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00082\u0010\u001fJ\u00a6\u0001\u00103\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u00083\u00104J\u0010\u00105\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00085\u0010\u001fJ\u0010\u00106\u001a\u00020\u0019H\u00d6\u0001\u00a2\u0006\u0004\u00086\u00107J\u001a\u0010;\u001a\u00020:2\u0008\u00109\u001a\u0004\u0018\u000108H\u00d6\u0003\u00a2\u0006\u0004\u0008;\u0010<J\'\u0010E\u001a\u00020B2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0001\u00a2\u0006\u0004\u0008C\u0010DR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010F\u001a\u0004\u0008G\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010H\u001a\u0004\u0008I\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010F\u001a\u0004\u0008J\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010H\u001a\u0004\u0008K\u0010!R\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010F\u001a\u0004\u0008L\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010F\u001a\u0004\u0008M\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010N\u001a\u0004\u0008O\u0010\'R\"\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010P\u0012\u0004\u0008R\u0010S\u001a\u0004\u0008Q\u0010)R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010T\u001a\u0004\u0008U\u0010+R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010V\u001a\u0004\u0008W\u0010-R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010X\u001a\u0004\u0008Y\u0010/R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010Z\u001a\u0004\u0008[\u00101R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010F\u001a\u0004\u0008\\\u0010\u001f\u00a8\u0006_"
    }
    d2 = {
        "Lcom/whoop/design/models/items/EntryPointModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "endIcon",
        "body",
        "backgroundStyle",
        "imageUrl",
        "Lcom/whoop/design/models/items/EntryPointModelCta;",
        "callToAction",
        "Lcom/whoop/navigation/e;",
        "destination",
        "Lcom/whoop/design/models/items/TagModel;",
        "navigationTag",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "dismissAction",
        "Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;",
        "analyticEvents",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "genericInteraction",
        "dismissId",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/EntryPointModelCta;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/EntryPointModelCta;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/design/util/TextResource;",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "()Lcom/whoop/design/models/items/EntryPointModelCta;",
        "component8",
        "()Lcom/whoop/navigation/e;",
        "component9",
        "()Lcom/whoop/design/models/items/TagModel;",
        "component10",
        "()Lcom/whoop/whoopaction/domain/models/Action;",
        "component11",
        "()Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;",
        "component12",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "component13",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/EntryPointModelCta;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;)Lcom/whoop/design/models/items/EntryPointModel;",
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
        "(Lcom/whoop/design/models/items/EntryPointModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "Lcom/whoop/design/util/TextResource;",
        "getTitle",
        "getEndIcon",
        "getBody",
        "getBackgroundStyle",
        "getImageUrl",
        "Lcom/whoop/design/models/items/EntryPointModelCta;",
        "getCallToAction",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "getDestination$annotations",
        "()V",
        "Lcom/whoop/design/models/items/TagModel;",
        "getNavigationTag",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "getDismissAction",
        "Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;",
        "getAnalyticEvents",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getGenericInteraction",
        "getDismissId",
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

.field public static final Companion:Lcom/whoop/design/models/items/EntryPointModel$Companion;


# instance fields
.field private final analyticEvents:Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;

.field private final backgroundStyle:Ljava/lang/String;

.field private final body:Lcom/whoop/design/util/TextResource;

.field private final callToAction:Lcom/whoop/design/models/items/EntryPointModelCta;

.field private final destination:Lcom/whoop/navigation/e;

.field private final dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

.field private final dismissId:Ljava/lang/String;

.field private final endIcon:Ljava/lang/String;

.field private final genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final id:Ljava/lang/String;

.field private final imageUrl:Ljava/lang/String;

.field private final navigationTag:Lcom/whoop/design/models/items/TagModel;

.field private final title:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/design/models/items/EntryPointModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/EntryPointModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/EntryPointModel;->Companion:Lcom/whoop/design/models/items/EntryPointModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/EntryPointModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/c;

    const/16 v4, 0x17

    invoke-direct {v3, v4}, Lw91/c;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lw91/c;

    const/16 v5, 0x18

    invoke-direct {v4, v5}, Lw91/c;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v4, 0xd

    new-array v4, v4, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v5, 0x1

    aput-object v1, v4, v5

    const/4 v5, 0x2

    aput-object v1, v4, v5

    const/4 v5, 0x3

    aput-object v1, v4, v5

    const/4 v5, 0x4

    aput-object v1, v4, v5

    const/4 v5, 0x5

    aput-object v1, v4, v5

    const/4 v5, 0x6

    aput-object v1, v4, v5

    const/4 v5, 0x7

    aput-object v3, v4, v5

    aput-object v1, v4, v0

    const/16 v0, 0x9

    aput-object v2, v4, v0

    const/16 v0, 0xa

    aput-object v1, v4, v0

    const/16 v0, 0xb

    aput-object v1, v4, v0

    const/16 v0, 0xc

    aput-object v1, v4, v0

    sput-object v4, Lcom/whoop/design/models/items/EntryPointModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/EntryPointModelCta;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit16 v0, p1, 0x7ff

    const/16 v1, 0x7ff

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/design/models/items/EntryPointModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/EntryPointModel$$serializer;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/EntryPointModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/EntryPointModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/items/EntryPointModel;->title:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lcom/whoop/design/models/items/EntryPointModel;->endIcon:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/items/EntryPointModel;->body:Lcom/whoop/design/util/TextResource;

    iput-object p6, p0, Lcom/whoop/design/models/items/EntryPointModel;->backgroundStyle:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/design/models/items/EntryPointModel;->imageUrl:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/design/models/items/EntryPointModel;->callToAction:Lcom/whoop/design/models/items/EntryPointModelCta;

    iput-object p9, p0, Lcom/whoop/design/models/items/EntryPointModel;->destination:Lcom/whoop/navigation/e;

    iput-object p10, p0, Lcom/whoop/design/models/items/EntryPointModel;->navigationTag:Lcom/whoop/design/models/items/TagModel;

    iput-object p11, p0, Lcom/whoop/design/models/items/EntryPointModel;->dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

    iput-object p12, p0, Lcom/whoop/design/models/items/EntryPointModel;->analyticEvents:Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;

    and-int/lit16 p2, p1, 0x800

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/design/models/items/EntryPointModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_0

    :cond_1
    iput-object p13, p0, Lcom/whoop/design/models/items/EntryPointModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :goto_0
    and-int/lit16 p1, p1, 0x1000

    if-nez p1, :cond_2

    iput-object p3, p0, Lcom/whoop/design/models/items/EntryPointModel;->dismissId:Ljava/lang/String;

    return-void

    :cond_2
    move-object/from16 p1, p14

    iput-object p1, p0, Lcom/whoop/design/models/items/EntryPointModel;->dismissId:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/EntryPointModelCta;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;)V
    .locals 1

    const-string v0, "body"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundStyle"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callToAction"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/EntryPointModel;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/EntryPointModel;->title:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/EntryPointModel;->endIcon:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/EntryPointModel;->body:Lcom/whoop/design/util/TextResource;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/EntryPointModel;->backgroundStyle:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/EntryPointModel;->imageUrl:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/EntryPointModel;->callToAction:Lcom/whoop/design/models/items/EntryPointModelCta;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/items/EntryPointModel;->destination:Lcom/whoop/navigation/e;

    .line 11
    iput-object p9, p0, Lcom/whoop/design/models/items/EntryPointModel;->navigationTag:Lcom/whoop/design/models/items/TagModel;

    .line 12
    iput-object p10, p0, Lcom/whoop/design/models/items/EntryPointModel;->dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

    .line 13
    iput-object p11, p0, Lcom/whoop/design/models/items/EntryPointModel;->analyticEvents:Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;

    .line 14
    iput-object p12, p0, Lcom/whoop/design/models/items/EntryPointModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    .line 15
    iput-object p13, p0, Lcom/whoop/design/models/items/EntryPointModel;->dismissId:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/EntryPointModelCta;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 17

    move/from16 v0, p14

    and-int/lit16 v1, v0, 0x800

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v15, v2

    goto :goto_0

    :cond_0
    move-object/from16 v15, p12

    :goto_0
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_1

    move-object/from16 v16, v2

    :goto_1
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    move-object/from16 v12, p9

    move-object/from16 v13, p10

    move-object/from16 v14, p11

    goto :goto_2

    :cond_1
    move-object/from16 v16, p13

    goto :goto_1

    .line 16
    :goto_2
    invoke-direct/range {v3 .. v16}, Lcom/whoop/design/models/items/EntryPointModel;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/EntryPointModelCta;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;)V

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

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 6

    new-instance v0, Lwc3/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/whoopaction/domain/models/Action;

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

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/EntryPointModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/EntryPointModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/EntryPointModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/EntryPointModel;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/EntryPointModelCta;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/models/items/EntryPointModel;
    .locals 12

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/EntryPointModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/whoop/design/models/items/EntryPointModel;->title:Lcom/whoop/design/util/TextResource;

    goto :goto_0

    :cond_1
    move-object v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/whoop/design/models/items/EntryPointModel;->endIcon:Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v2, p3

    :goto_1
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/whoop/design/models/items/EntryPointModel;->body:Lcom/whoop/design/util/TextResource;

    goto :goto_2

    :cond_3
    move-object/from16 v3, p4

    :goto_2
    and-int/lit8 v4, v0, 0x10

    if-eqz v4, :cond_4

    iget-object v4, p0, Lcom/whoop/design/models/items/EntryPointModel;->backgroundStyle:Ljava/lang/String;

    goto :goto_3

    :cond_4
    move-object/from16 v4, p5

    :goto_3
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_5

    iget-object v5, p0, Lcom/whoop/design/models/items/EntryPointModel;->imageUrl:Ljava/lang/String;

    goto :goto_4

    :cond_5
    move-object/from16 v5, p6

    :goto_4
    and-int/lit8 v6, v0, 0x40

    if-eqz v6, :cond_6

    iget-object v6, p0, Lcom/whoop/design/models/items/EntryPointModel;->callToAction:Lcom/whoop/design/models/items/EntryPointModelCta;

    goto :goto_5

    :cond_6
    move-object/from16 v6, p7

    :goto_5
    and-int/lit16 v7, v0, 0x80

    if-eqz v7, :cond_7

    iget-object v7, p0, Lcom/whoop/design/models/items/EntryPointModel;->destination:Lcom/whoop/navigation/e;

    goto :goto_6

    :cond_7
    move-object/from16 v7, p8

    :goto_6
    and-int/lit16 v8, v0, 0x100

    if-eqz v8, :cond_8

    iget-object v8, p0, Lcom/whoop/design/models/items/EntryPointModel;->navigationTag:Lcom/whoop/design/models/items/TagModel;

    goto :goto_7

    :cond_8
    move-object/from16 v8, p9

    :goto_7
    and-int/lit16 v9, v0, 0x200

    if-eqz v9, :cond_9

    iget-object v9, p0, Lcom/whoop/design/models/items/EntryPointModel;->dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

    goto :goto_8

    :cond_9
    move-object/from16 v9, p10

    :goto_8
    and-int/lit16 v10, v0, 0x400

    if-eqz v10, :cond_a

    iget-object v10, p0, Lcom/whoop/design/models/items/EntryPointModel;->analyticEvents:Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;

    goto :goto_9

    :cond_a
    move-object/from16 v10, p11

    :goto_9
    and-int/lit16 v11, v0, 0x800

    if-eqz v11, :cond_b

    iget-object v11, p0, Lcom/whoop/design/models/items/EntryPointModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_a

    :cond_b
    move-object/from16 v11, p12

    :goto_a
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->dismissId:Ljava/lang/String;

    move-object/from16 p15, v0

    :goto_b
    move-object p2, p0

    move-object p3, p1

    move-object/from16 p4, v1

    move-object/from16 p5, v2

    move-object/from16 p6, v3

    move-object/from16 p7, v4

    move-object/from16 p8, v5

    move-object/from16 p9, v6

    move-object/from16 p10, v7

    move-object/from16 p11, v8

    move-object/from16 p12, v9

    move-object/from16 p13, v10

    move-object/from16 p14, v11

    goto :goto_c

    :cond_c
    move-object/from16 p15, p13

    goto :goto_b

    :goto_c
    invoke-virtual/range {p2 .. p15}, Lcom/whoop/design/models/items/EntryPointModel;->copy(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/EntryPointModelCta;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;)Lcom/whoop/design/models/items/EntryPointModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getDestination$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/EntryPointModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/design/models/items/EntryPointModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/EntryPointModel;->id:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lmd1/a;->a:Lmd1/a;

    iget-object v3, p0, Lcom/whoop/design/models/items/EntryPointModel;->title:Lcom/whoop/design/util/TextResource;

    const/4 v4, 0x1

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v3, 0x2

    iget-object v4, p0, Lcom/whoop/design/models/items/EntryPointModel;->endIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v3, v1, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v3, 0x3

    iget-object v4, p0, Lcom/whoop/design/models/items/EntryPointModel;->body:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v3, v2, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/design/models/items/EntryPointModel;->backgroundStyle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/whoop/design/models/items/EntryPointModel;->imageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/design/models/items/EntryPointModelCta$$serializer;->INSTANCE:Lcom/whoop/design/models/items/EntryPointModelCta$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/EntryPointModel;->callToAction:Lcom/whoop/design/models/items/EntryPointModelCta;

    const/4 v4, 0x6

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x7

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/design/models/items/EntryPointModel;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/design/models/items/TagModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TagModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/EntryPointModel;->navigationTag:Lcom/whoop/design/models/items/TagModel;

    const/16 v4, 0x8

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x9

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/EntryPointModel;->dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/EntryPointModel;->analyticEvents:Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;

    const/16 v3, 0xa

    invoke-interface {p1, p2, v3, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0xb

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/EntryPointModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/EntryPointModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-interface {p1, p2, v0, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/16 v0, 0xc

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/EntryPointModel;->dismissId:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_1
    iget-object p0, p0, Lcom/whoop/design/models/items/EntryPointModel;->dismissId:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

    return-object v0
.end method

.method public final component11()Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->analyticEvents:Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;

    return-object v0
.end method

.method public final component12()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->dismissId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->endIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->body:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->backgroundStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/models/items/EntryPointModelCta;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->callToAction:Lcom/whoop/design/models/items/EntryPointModelCta;

    return-object v0
.end method

.method public final component8()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component9()Lcom/whoop/design/models/items/TagModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->navigationTag:Lcom/whoop/design/models/items/TagModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/EntryPointModelCta;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;)Lcom/whoop/design/models/items/EntryPointModel;
    .locals 15

    const-string v0, "body"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundStyle"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callToAction"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/EntryPointModel;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    invoke-direct/range {v1 .. v14}, Lcom/whoop/design/models/items/EntryPointModel;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/EntryPointModelCta;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/EntryPointModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/EntryPointModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/EntryPointModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/EntryPointModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/EntryPointModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/EntryPointModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/EntryPointModel;->endIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/EntryPointModel;->endIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/EntryPointModel;->body:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/EntryPointModel;->body:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/EntryPointModel;->backgroundStyle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/EntryPointModel;->backgroundStyle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/EntryPointModel;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/EntryPointModel;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/EntryPointModel;->callToAction:Lcom/whoop/design/models/items/EntryPointModelCta;

    iget-object v3, p1, Lcom/whoop/design/models/items/EntryPointModel;->callToAction:Lcom/whoop/design/models/items/EntryPointModelCta;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/EntryPointModel;->destination:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/design/models/items/EntryPointModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/EntryPointModel;->navigationTag:Lcom/whoop/design/models/items/TagModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/EntryPointModel;->navigationTag:Lcom/whoop/design/models/items/TagModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/EntryPointModel;->dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

    iget-object v3, p1, Lcom/whoop/design/models/items/EntryPointModel;->dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/design/models/items/EntryPointModel;->analyticEvents:Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/EntryPointModel;->analyticEvents:Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/items/EntryPointModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lcom/whoop/design/models/items/EntryPointModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/design/models/items/EntryPointModel;->dismissId:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/design/models/items/EntryPointModel;->dismissId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final getAnalyticEvents()Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->analyticEvents:Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;

    return-object v0
.end method

.method public final getBackgroundStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->backgroundStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final getBody()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->body:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getCallToAction()Lcom/whoop/design/models/items/EntryPointModelCta;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->callToAction:Lcom/whoop/design/models/items/EntryPointModelCta;

    return-object v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getDismissAction()Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

    return-object v0
.end method

.method public final getDismissId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->dismissId:Ljava/lang/String;

    return-object v0
.end method

.method public final getEndIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->endIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getGenericInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getNavigationTag()Lcom/whoop/design/models/items/TagModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->navigationTag:Lcom/whoop/design/models/items/TagModel;

    return-object v0
.end method

.method public final getTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->id:Ljava/lang/String;

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

    iget-object v3, p0, Lcom/whoop/design/models/items/EntryPointModel;->title:Lcom/whoop/design/util/TextResource;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/EntryPointModel;->endIcon:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/EntryPointModel;->body:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v3, v2}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/EntryPointModel;->backgroundStyle:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/EntryPointModel;->imageUrl:Ljava/lang/String;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/EntryPointModel;->callToAction:Lcom/whoop/design/models/items/EntryPointModelCta;

    invoke-virtual {v3}, Lcom/whoop/design/models/items/EntryPointModelCta;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->destination:Lcom/whoop/navigation/e;

    if-nez v0, :cond_4

    move v0, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v0

    :goto_4
    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->navigationTag:Lcom/whoop/design/models/items/TagModel;

    if-nez v0, :cond_5

    move v0, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v0}, Lcom/whoop/design/models/items/TagModel;->hashCode()I

    move-result v0

    :goto_5
    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

    if-nez v0, :cond_6

    move v0, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_6
    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->analyticEvents:Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;

    if-nez v0, :cond_7

    move v0, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v0}, Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;->hashCode()I

    move-result v0

    :goto_7
    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v0, :cond_8

    move v0, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v0}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v0

    :goto_8
    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/design/models/items/EntryPointModel;->dismissId:Ljava/lang/String;

    if-nez v0, :cond_9

    goto :goto_9

    :cond_9
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v3, v1

    return v3
.end method

.method public toString()Ljava/lang/String;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/design/models/items/EntryPointModel;->id:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/design/models/items/EntryPointModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v3, v0, Lcom/whoop/design/models/items/EntryPointModel;->endIcon:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/design/models/items/EntryPointModel;->body:Lcom/whoop/design/util/TextResource;

    iget-object v5, v0, Lcom/whoop/design/models/items/EntryPointModel;->backgroundStyle:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/design/models/items/EntryPointModel;->imageUrl:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/design/models/items/EntryPointModel;->callToAction:Lcom/whoop/design/models/items/EntryPointModelCta;

    iget-object v8, v0, Lcom/whoop/design/models/items/EntryPointModel;->destination:Lcom/whoop/navigation/e;

    iget-object v9, v0, Lcom/whoop/design/models/items/EntryPointModel;->navigationTag:Lcom/whoop/design/models/items/TagModel;

    iget-object v10, v0, Lcom/whoop/design/models/items/EntryPointModel;->dismissAction:Lcom/whoop/whoopaction/domain/models/Action;

    iget-object v11, v0, Lcom/whoop/design/models/items/EntryPointModel;->analyticEvents:Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;

    iget-object v12, v0, Lcom/whoop/design/models/items/EntryPointModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v13, v0, Lcom/whoop/design/models/items/EntryPointModel;->dismissId:Ljava/lang/String;

    const-string v14, ", title="

    const-string v15, ", endIcon="

    const-string v0, "EntryPointModel(id="

    invoke-static {v0, v1, v14, v2, v15}, Lq63/c;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", body="

    const-string v2, ", backgroundStyle="

    invoke-static {v0, v3, v1, v4, v2}, Lq63/c;->A(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    const-string v1, ", imageUrl="

    const-string v2, ", callToAction="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", destination="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", navigationTag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dismissAction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", analyticEvents="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", genericInteraction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dismissId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v13, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
