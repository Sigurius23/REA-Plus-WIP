.class public final Lcom/whoop/design/models/cards/CardContainerModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/cards/CardContainerModel$$serializer;,
        Lcom/whoop/design/models/cards/CardContainerModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\u0008\u0087\u0008\u0018\u0000 M2\u00020\u0001:\u0002NMBc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0001\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011Bu\u0008\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0001\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0001H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u0018J\u0012\u0010 \u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%Jv\u0010&\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u0018J\u0010\u0010)\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010.\u001a\u00020-2\u0008\u0010,\u001a\u0004\u0018\u00010+H\u00d6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001\u00a2\u0006\u0004\u00086\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00109\u001a\u0004\u0008:\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u00109\u0012\u0004\u0008<\u0010=\u001a\u0004\u0008;\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00109\u0012\u0004\u0008?\u0010=\u001a\u0004\u0008>\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010@\u001a\u0004\u0008A\u0010\u001cR \u0010\u0008\u001a\u00020\u00018\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010B\u0012\u0004\u0008D\u0010=\u001a\u0004\u0008C\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00109\u001a\u0004\u0008E\u0010\u0018R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010F\u0012\u0004\u0008H\u0010=\u001a\u0004\u0008G\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010I\u001a\u0004\u0008J\u0010#R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010K\u001a\u0004\u0008L\u0010%\u00a8\u0006O"
    }
    d2 = {
        "Lcom/whoop/design/models/cards/CardContainerModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "title",
        "endIcon",
        "Lcom/whoop/design/models/cards/HeaderContentModel;",
        "headerContent",
        "item",
        "cardName",
        "Lcom/whoop/navigation/e;",
        "destination",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "interaction",
        "Lcom/whoop/design/models/colortheme/ColorBackgroundModel;",
        "backgroundColor",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/cards/HeaderContentModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/colortheme/ColorBackgroundModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/cards/HeaderContentModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/colortheme/ColorBackgroundModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Lcom/whoop/design/models/cards/HeaderContentModel;",
        "component5",
        "()Lcom/whoop/design/models/DesignSystemModel;",
        "component6",
        "component7",
        "()Lcom/whoop/navigation/e;",
        "component8",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "component9",
        "()Lcom/whoop/design/models/colortheme/ColorBackgroundModel;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/cards/HeaderContentModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/colortheme/ColorBackgroundModel;)Lcom/whoop/design/models/cards/CardContainerModel;",
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
        "(Lcom/whoop/design/models/cards/CardContainerModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "getTitle",
        "getTitle$annotations",
        "()V",
        "getEndIcon",
        "getEndIcon$annotations",
        "Lcom/whoop/design/models/cards/HeaderContentModel;",
        "getHeaderContent",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "getItem",
        "getItem$annotations",
        "getCardName",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "getDestination$annotations",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getInteraction",
        "Lcom/whoop/design/models/colortheme/ColorBackgroundModel;",
        "getBackgroundColor",
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

.field public static final Companion:Lcom/whoop/design/models/cards/CardContainerModel$Companion;


# instance fields
.field private final backgroundColor:Lcom/whoop/design/models/colortheme/ColorBackgroundModel;

.field private final cardName:Ljava/lang/String;

.field private final destination:Lcom/whoop/navigation/e;

.field private final endIcon:Ljava/lang/String;

.field private final headerContent:Lcom/whoop/design/models/cards/HeaderContentModel;

.field private final id:Ljava/lang/String;

.field private final interaction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final item:Lcom/whoop/design/models/DesignSystemModel;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/design/models/cards/CardContainerModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/cards/CardContainerModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/cards/CardContainerModel;->Companion:Lcom/whoop/design/models/cards/CardContainerModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/cards/CardContainerModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lt42/a;

    const/4 v4, 0x7

    invoke-direct {v3, v4}, Lt42/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lt42/a;

    invoke-direct {v5, v0}, Lt42/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v5, 0x9

    new-array v5, v5, [Ll83/h;

    const/4 v6, 0x0

    aput-object v1, v5, v6

    const/4 v6, 0x1

    aput-object v1, v5, v6

    const/4 v6, 0x2

    aput-object v1, v5, v6

    const/4 v6, 0x3

    aput-object v1, v5, v6

    const/4 v6, 0x4

    aput-object v3, v5, v6

    const/4 v3, 0x5

    aput-object v1, v5, v3

    const/4 v3, 0x6

    aput-object v2, v5, v3

    aput-object v1, v5, v4

    aput-object v1, v5, v0

    sput-object v5, Lcom/whoop/design/models/cards/CardContainerModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/cards/HeaderContentModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/colortheme/ColorBackgroundModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p11, p1, 0x193

    const/16 v0, 0x193

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/design/models/cards/CardContainerModel$$serializer;->INSTANCE:Lcom/whoop/design/models/cards/CardContainerModel$$serializer;

    invoke-virtual {p11}, Lcom/whoop/design/models/cards/CardContainerModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/cards/CardContainerModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/cards/CardContainerModel;->title:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/design/models/cards/CardContainerModel;->endIcon:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lcom/whoop/design/models/cards/CardContainerModel;->endIcon:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/design/models/cards/CardContainerModel;->headerContent:Lcom/whoop/design/models/cards/HeaderContentModel;

    goto :goto_1

    :cond_2
    iput-object p5, p0, Lcom/whoop/design/models/cards/CardContainerModel;->headerContent:Lcom/whoop/design/models/cards/HeaderContentModel;

    :goto_1
    iput-object p6, p0, Lcom/whoop/design/models/cards/CardContainerModel;->item:Lcom/whoop/design/models/DesignSystemModel;

    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/design/models/cards/CardContainerModel;->cardName:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p7, p0, Lcom/whoop/design/models/cards/CardContainerModel;->cardName:Ljava/lang/String;

    :goto_2
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/cards/CardContainerModel;->destination:Lcom/whoop/navigation/e;

    goto :goto_3

    :cond_4
    iput-object p8, p0, Lcom/whoop/design/models/cards/CardContainerModel;->destination:Lcom/whoop/navigation/e;

    :goto_3
    iput-object p9, p0, Lcom/whoop/design/models/cards/CardContainerModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    iput-object p10, p0, Lcom/whoop/design/models/cards/CardContainerModel;->backgroundColor:Lcom/whoop/design/models/colortheme/ColorBackgroundModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/cards/HeaderContentModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/colortheme/ColorBackgroundModel;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/cards/CardContainerModel;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/cards/CardContainerModel;->title:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/cards/CardContainerModel;->endIcon:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/cards/CardContainerModel;->headerContent:Lcom/whoop/design/models/cards/HeaderContentModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/cards/CardContainerModel;->item:Lcom/whoop/design/models/DesignSystemModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/cards/CardContainerModel;->cardName:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/cards/CardContainerModel;->destination:Lcom/whoop/navigation/e;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/cards/CardContainerModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    .line 11
    iput-object p9, p0, Lcom/whoop/design/models/cards/CardContainerModel;->backgroundColor:Lcom/whoop/design/models/colortheme/ColorBackgroundModel;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/cards/HeaderContentModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/colortheme/ColorBackgroundModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_2

    move-object p6, v0

    :cond_2
    and-int/lit8 p10, p10, 0x40

    if-eqz p10, :cond_3

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

    :cond_3
    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    goto :goto_0

    .line 12
    :goto_1
    invoke-direct/range {p1 .. p10}, Lcom/whoop/design/models/cards/CardContainerModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/cards/HeaderContentModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/colortheme/ColorBackgroundModel;)V

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

    new-array v1, v2, [Lwc3/c;

    invoke-direct {v0, v3, v4, v1}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
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

    invoke-static {}, Lcom/whoop/design/models/cards/CardContainerModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/cards/CardContainerModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/cards/CardContainerModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/cards/CardContainerModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/cards/HeaderContentModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/colortheme/ColorBackgroundModel;ILjava/lang/Object;)Lcom/whoop/design/models/cards/CardContainerModel;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/cards/CardContainerModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/cards/CardContainerModel;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/cards/CardContainerModel;->endIcon:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/cards/CardContainerModel;->headerContent:Lcom/whoop/design/models/cards/HeaderContentModel;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/cards/CardContainerModel;->item:Lcom/whoop/design/models/DesignSystemModel;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/cards/CardContainerModel;->cardName:Ljava/lang/String;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/cards/CardContainerModel;->destination:Lcom/whoop/navigation/e;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/cards/CardContainerModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/design/models/cards/CardContainerModel;->backgroundColor:Lcom/whoop/design/models/colortheme/ColorBackgroundModel;

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

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/design/models/cards/CardContainerModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/cards/HeaderContentModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/colortheme/ColorBackgroundModel;)Lcom/whoop/design/models/cards/CardContainerModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getDestination$annotations()V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    return-void
.end method

.method public static synthetic getEndIcon$annotations()V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    return-void
.end method

.method public static synthetic getItem$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getTitle$annotations()V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/cards/CardContainerModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/cards/CardContainerModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/design/models/cards/CardContainerModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/design/models/cards/CardContainerModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/cards/CardContainerModel;->endIcon:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/cards/CardContainerModel;->endIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/cards/CardContainerModel;->headerContent:Lcom/whoop/design/models/cards/HeaderContentModel;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lcom/whoop/design/models/cards/HeaderContentModel$$serializer;->INSTANCE:Lcom/whoop/design/models/cards/HeaderContentModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/cards/CardContainerModel;->headerContent:Lcom/whoop/design/models/cards/HeaderContentModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x4

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/cards/CardContainerModel;->item:Lcom/whoop/design/models/DesignSystemModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/cards/CardContainerModel;->cardName:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/cards/CardContainerModel;->cardName:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/cards/CardContainerModel;->destination:Lcom/whoop/navigation/e;

    if-eqz v2, :cond_7

    :goto_3
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/cards/CardContainerModel;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    sget-object v0, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object v1, p0, Lcom/whoop/design/models/cards/CardContainerModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    const/4 v2, 0x7

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/colortheme/ColorBackgroundModel$$serializer;->INSTANCE:Lcom/whoop/design/models/colortheme/ColorBackgroundModel$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/cards/CardContainerModel;->backgroundColor:Lcom/whoop/design/models/colortheme/ColorBackgroundModel;

    const/16 v1, 0x8

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/CardContainerModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/CardContainerModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/CardContainerModel;->endIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/cards/HeaderContentModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/CardContainerModel;->headerContent:Lcom/whoop/design/models/cards/HeaderContentModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/CardContainerModel;->item:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/CardContainerModel;->cardName:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/CardContainerModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component8()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/CardContainerModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final component9()Lcom/whoop/design/models/colortheme/ColorBackgroundModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/CardContainerModel;->backgroundColor:Lcom/whoop/design/models/colortheme/ColorBackgroundModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/cards/HeaderContentModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/colortheme/ColorBackgroundModel;)Lcom/whoop/design/models/cards/CardContainerModel;
    .locals 11

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/cards/CardContainerModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/whoop/design/models/cards/CardContainerModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/cards/HeaderContentModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/colortheme/ColorBackgroundModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/cards/CardContainerModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/cards/CardContainerModel;

    iget-object v1, p0, Lcom/whoop/design/models/cards/CardContainerModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/cards/CardContainerModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/cards/CardContainerModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/cards/CardContainerModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/cards/CardContainerModel;->endIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/cards/CardContainerModel;->endIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/cards/CardContainerModel;->headerContent:Lcom/whoop/design/models/cards/HeaderContentModel;

    iget-object v3, p1, Lcom/whoop/design/models/cards/CardContainerModel;->headerContent:Lcom/whoop/design/models/cards/HeaderContentModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/cards/CardContainerModel;->item:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v3, p1, Lcom/whoop/design/models/cards/CardContainerModel;->item:Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/cards/CardContainerModel;->cardName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/cards/CardContainerModel;->cardName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/cards/CardContainerModel;->destination:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/design/models/cards/CardContainerModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/cards/CardContainerModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lcom/whoop/design/models/cards/CardContainerModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/cards/CardContainerModel;->backgroundColor:Lcom/whoop/design/models/colortheme/ColorBackgroundModel;

    iget-object p1, p1, Lcom/whoop/design/models/cards/CardContainerModel;->backgroundColor:Lcom/whoop/design/models/colortheme/ColorBackgroundModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getBackgroundColor()Lcom/whoop/design/models/colortheme/ColorBackgroundModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/CardContainerModel;->backgroundColor:Lcom/whoop/design/models/colortheme/ColorBackgroundModel;

    return-object v0
.end method

.method public final getCardName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/CardContainerModel;->cardName:Ljava/lang/String;

    return-object v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/CardContainerModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getEndIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/CardContainerModel;->endIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getHeaderContent()Lcom/whoop/design/models/cards/HeaderContentModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/CardContainerModel;->headerContent:Lcom/whoop/design/models/cards/HeaderContentModel;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/CardContainerModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/CardContainerModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getItem()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/CardContainerModel;->item:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/CardContainerModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/cards/CardContainerModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/cards/CardContainerModel;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/cards/CardContainerModel;->endIcon:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/design/models/cards/CardContainerModel;->headerContent:Lcom/whoop/design/models/cards/HeaderContentModel;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/design/models/cards/HeaderContentModel;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/cards/CardContainerModel;->item:Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/cards/CardContainerModel;->cardName:Ljava/lang/String;

    if-nez v0, :cond_2

    move v0, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/cards/CardContainerModel;->destination:Lcom/whoop/navigation/e;

    if-nez v0, :cond_3

    move v0, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/cards/CardContainerModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v0, :cond_4

    move v0, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v0

    :goto_4
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/cards/CardContainerModel;->backgroundColor:Lcom/whoop/design/models/colortheme/ColorBackgroundModel;

    if-nez v0, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v0}, Lcom/whoop/design/models/colortheme/ColorBackgroundModel;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v2, v3

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/whoop/design/models/cards/CardContainerModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/cards/CardContainerModel;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/cards/CardContainerModel;->endIcon:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/cards/CardContainerModel;->headerContent:Lcom/whoop/design/models/cards/HeaderContentModel;

    iget-object v4, p0, Lcom/whoop/design/models/cards/CardContainerModel;->item:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v5, p0, Lcom/whoop/design/models/cards/CardContainerModel;->cardName:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/design/models/cards/CardContainerModel;->destination:Lcom/whoop/navigation/e;

    iget-object v7, p0, Lcom/whoop/design/models/cards/CardContainerModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v8, p0, Lcom/whoop/design/models/cards/CardContainerModel;->backgroundColor:Lcom/whoop/design/models/colortheme/ColorBackgroundModel;

    const-string v9, ", title="

    const-string v10, ", endIcon="

    const-string v11, "CardContainerModel(id="

    invoke-static {v11, v0, v9, v1, v10}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", headerContent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", item="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cardName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", destination="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", interaction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", backgroundColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
