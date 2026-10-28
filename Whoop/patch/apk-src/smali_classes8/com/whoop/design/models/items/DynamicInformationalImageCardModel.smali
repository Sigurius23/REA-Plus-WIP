.class public final Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/DynamicInformationalImageCardModel$$serializer;,
        Lcom/whoop/design/models/items/DynamicInformationalImageCardModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u0000 :2\u00020\u0001:\u0002;:BM\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000c\u0010\rBa\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%Jb\u0010&\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u001fJ\u0010\u0010)\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010.\u001a\u00020-2\u0008\u0010,\u001a\u0004\u0018\u00010+H\u00d6\u0003\u00a2\u0006\u0004\u0008.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00100\u001a\u0004\u00081\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00102\u001a\u0004\u00083\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00102\u001a\u0004\u00084\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00102\u001a\u0004\u00085\u0010\u001fR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00102\u001a\u0004\u00086\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00102\u001a\u0004\u00087\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00108\u001a\u0004\u00089\u0010%\u00a8\u0006<"
    }
    d2 = {
        "Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;",
        "layoutState",
        "",
        "backgroundImageUrl",
        "iconImageUrl",
        "title",
        "description",
        "tagTitle",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "interaction",
        "<init>",
        "(Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "copy",
        "(Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;",
        "getLayoutState",
        "Ljava/lang/String;",
        "getBackgroundImageUrl",
        "getIconImageUrl",
        "getTitle",
        "getDescription",
        "getTagTitle",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getInteraction",
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

.field public static final Companion:Lcom/whoop/design/models/items/DynamicInformationalImageCardModel$Companion;


# instance fields
.field private final backgroundImageUrl:Ljava/lang/String;

.field private final description:Ljava/lang/String;

.field private final iconImageUrl:Ljava/lang/String;

.field private final interaction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final layoutState:Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;

.field private final tagTitle:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->Companion:Lcom/whoop/design/models/items/DynamicInformationalImageCardModel$Companion;

    sget v0, Lcom/whoop/navigation/models/GenericInteraction;->$stable:I

    sput v0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lw91/c;

    const/16 v3, 0x16

    invoke-direct {v2, v3}, Lw91/c;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x7

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const/4 v0, 0x3

    aput-object v1, v2, v0

    const/4 v0, 0x4

    aput-object v1, v2, v0

    const/4 v0, 0x5

    aput-object v1, v2, v0

    const/4 v0, 0x6

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7e

    const/16 v0, 0x7e

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DynamicInformationalImageCardModel$$serializer;

    invoke-virtual {p9}, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p1, p1, 0x1

    if-nez p1, :cond_1

    .line 2
    sget-object p1, Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;->COLLAPSED:Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->layoutState:Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;

    goto :goto_0

    :cond_1
    iput-object p2, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->layoutState:Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;

    :goto_0
    iput-object p3, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->backgroundImageUrl:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->iconImageUrl:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->title:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->description:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->tagTitle:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)V
    .locals 1

    const-string v0, "layoutState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->layoutState:Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;

    .line 6
    iput-object p2, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->backgroundImageUrl:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->iconImageUrl:Ljava/lang/String;

    .line 8
    iput-object p4, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->title:Ljava/lang/String;

    .line 9
    iput-object p5, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->description:Ljava/lang/String;

    .line 10
    iput-object p6, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->tagTitle:Ljava/lang/String;

    .line 11
    iput-object p7, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p8, p8, 0x1

    if-eqz p8, :cond_0

    .line 12
    sget-object p1, Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;->COLLAPSED:Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;

    :cond_0
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 13
    invoke-direct/range {p2 .. p9}, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;-><init>(Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;->Companion:Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState$a;

    invoke-virtual {v0}, Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState$a;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->layoutState:Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->backgroundImageUrl:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->iconImageUrl:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->title:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->description:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->tagTitle:Ljava/lang/String;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->copy(Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->layoutState:Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;

    sget-object v3, Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;->COLLAPSED:Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;

    if-eq v2, v3, :cond_1

    :goto_0
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->layoutState:Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->backgroundImageUrl:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->iconImageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->description:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->tagTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    const/4 v1, 0x6

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->layoutState:Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->backgroundImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->iconImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->tagTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;
    .locals 9

    const-string v0, "layoutState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;-><init>(Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->layoutState:Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;

    iget-object v3, p1, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->layoutState:Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->backgroundImageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->backgroundImageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->iconImageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->iconImageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->tagTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->tagTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object p1, p1, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getBackgroundImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->backgroundImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getIconImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->iconImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getLayoutState()Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->layoutState:Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;

    return-object v0
.end method

.method public final getTagTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->tagTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->layoutState:Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->backgroundImageUrl:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->iconImageUrl:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->title:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->description:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->tagTitle:Ljava/lang/String;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->layoutState:Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;

    iget-object v1, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->backgroundImageUrl:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->iconImageUrl:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->title:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->description:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->tagTitle:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/design/models/items/DynamicInformationalImageCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "DynamicInformationalImageCardModel(layoutState="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", backgroundImageUrl="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", iconImageUrl="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    const-string v1, ", description="

    invoke-static {v7, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", tagTitle="

    const-string v1, ", interaction="

    invoke-static {v7, v4, v0, v5, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ")"

    invoke-static {v7, v6, v0}, Lnh3/a;->j(Ljava/lang/StringBuilder;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
