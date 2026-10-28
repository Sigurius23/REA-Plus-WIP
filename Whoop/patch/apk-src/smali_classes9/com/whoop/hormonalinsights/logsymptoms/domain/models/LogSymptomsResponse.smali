.class public final Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse$$serializer;,
        Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u0000 ?2\u00020\u0001:\u0002@AB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010B]\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000f\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)JT\u0010*\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0010\u0008\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000cH\u00c6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010!J\u0010\u0010-\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u001a\u00101\u001a\u0002002\u0008\u0010/\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00081\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00103\u001a\u0004\u00084\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00105\u001a\u0004\u00086\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00107\u001a\u0004\u00088\u0010#R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00109\u001a\u0004\u0008:\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010;\u001a\u0004\u0008<\u0010\'R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010=\u001a\u0004\u0008>\u0010)\u00a8\u0006B"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;",
        "",
        "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;",
        "navigationBar",
        "",
        "title",
        "Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;",
        "categorySelector",
        "Lcom/whoop/design/models/items/CyclePhaseStyle;",
        "style",
        "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;",
        "primaryButton",
        "",
        "",
        "suggestedTrackerIds",
        "<init>",
        "(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;Ljava/lang/String;Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Lcom/whoop/design/models/items/CyclePhaseStyle;Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;Ljava/util/List;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;Ljava/lang/String;Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Lcom/whoop/design/models/items/CyclePhaseStyle;Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$hormonal_insights_release",
        "(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "()Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;",
        "component4",
        "()Lcom/whoop/design/models/items/CyclePhaseStyle;",
        "component5",
        "()Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;",
        "component6",
        "()Ljava/util/List;",
        "copy",
        "(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;Ljava/lang/String;Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Lcom/whoop/design/models/items/CyclePhaseStyle;Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;Ljava/util/List;)Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;",
        "getNavigationBar",
        "Ljava/lang/String;",
        "getTitle",
        "Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;",
        "getCategorySelector",
        "Lcom/whoop/design/models/items/CyclePhaseStyle;",
        "getStyle",
        "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;",
        "getPrimaryButton",
        "Ljava/util/List;",
        "getSuggestedTrackerIds",
        "Companion",
        "$serializer",
        "a",
        "hormonal-insights_release"
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

.field public static final Companion:Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse$a;


# instance fields
.field private final categorySelector:Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

.field private final navigationBar:Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;

.field private final primaryButton:Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;

.field private final style:Lcom/whoop/design/models/items/CyclePhaseStyle;

.field private final suggestedTrackerIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->Companion:Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ljl0/a;

    const/16 v3, 0x1a

    invoke-direct {v2, v3}, Ljl0/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Ljl0/a;

    const/16 v4, 0x1b

    invoke-direct {v3, v4}, Ljl0/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x6

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v1, v3, v4

    const/4 v4, 0x3

    aput-object v2, v3, v4

    const/4 v2, 0x4

    aput-object v1, v3, v2

    const/4 v1, 0x5

    aput-object v0, v3, v1

    sput-object v3, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;Ljava/lang/String;Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Lcom/whoop/design/models/items/CyclePhaseStyle;Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse$$serializer;

    invoke-virtual {p8}, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->navigationBar:Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;

    iput-object p3, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->title:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->categorySelector:Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    iput-object p5, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->style:Lcom/whoop/design/models/items/CyclePhaseStyle;

    iput-object p6, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->primaryButton:Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;

    iput-object p7, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->suggestedTrackerIds:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;Ljava/lang/String;Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Lcom/whoop/design/models/items/CyclePhaseStyle;Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;",
            "Lcom/whoop/design/models/items/CyclePhaseStyle;",
            "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "navigationBar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "categorySelector"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primaryButton"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->navigationBar:Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;

    .line 4
    iput-object p2, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->title:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->categorySelector:Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    .line 6
    iput-object p4, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->style:Lcom/whoop/design/models/items/CyclePhaseStyle;

    .line 7
    iput-object p5, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->primaryButton:Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->suggestedTrackerIds:Ljava/util/List;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.CyclePhaseStyle"

    invoke-static {}, Lcom/whoop/design/models/items/CyclePhaseStyle;->values()[Lcom/whoop/design/models/items/CyclePhaseStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;Ljava/lang/String;Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Lcom/whoop/design/models/items/CyclePhaseStyle;Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->navigationBar:Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->categorySelector:Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->style:Lcom/whoop/design/models/items/CyclePhaseStyle;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->primaryButton:Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->suggestedTrackerIds:Ljava/util/List;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->copy(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;Ljava/lang/String;Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Lcom/whoop/design/models/items/CyclePhaseStyle;Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;Ljava/util/List;)Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$hormonal_insights_release(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar$$serializer;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->navigationBar:Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel$$serializer;->INSTANCE:Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel$$serializer;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->categorySelector:Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->style:Lcom/whoop/design/models/items/CyclePhaseStyle;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel$$serializer;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->primaryButton:Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->suggestedTrackerIds:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->navigationBar:Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->categorySelector:Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/CyclePhaseStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->style:Lcom/whoop/design/models/items/CyclePhaseStyle;

    return-object v0
.end method

.method public final component5()Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->primaryButton:Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->suggestedTrackerIds:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;Ljava/lang/String;Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Lcom/whoop/design/models/items/CyclePhaseStyle;Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;Ljava/util/List;)Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;",
            "Lcom/whoop/design/models/items/CyclePhaseStyle;",
            "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;"
        }
    .end annotation

    const-string v0, "navigationBar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "categorySelector"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primaryButton"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;-><init>(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;Ljava/lang/String;Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Lcom/whoop/design/models/items/CyclePhaseStyle;Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->navigationBar:Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->navigationBar:Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->categorySelector:Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->categorySelector:Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->style:Lcom/whoop/design/models/items/CyclePhaseStyle;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->style:Lcom/whoop/design/models/items/CyclePhaseStyle;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->primaryButton:Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->primaryButton:Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->suggestedTrackerIds:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->suggestedTrackerIds:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getCategorySelector()Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->categorySelector:Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    return-object v0
.end method

.method public final getNavigationBar()Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->navigationBar:Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;

    return-object v0
.end method

.method public final getPrimaryButton()Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->primaryButton:Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;

    return-object v0
.end method

.method public final getStyle()Lcom/whoop/design/models/items/CyclePhaseStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->style:Lcom/whoop/design/models/items/CyclePhaseStyle;

    return-object v0
.end method

.method public final getSuggestedTrackerIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->suggestedTrackerIds:Ljava/util/List;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->navigationBar:Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->categorySelector:Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->style:Lcom/whoop/design/models/items/CyclePhaseStyle;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->primaryButton:Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->suggestedTrackerIds:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->navigationBar:Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->categorySelector:Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->style:Lcom/whoop/design/models/items/CyclePhaseStyle;

    iget-object v4, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->primaryButton:Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;

    iget-object v5, p0, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->suggestedTrackerIds:Ljava/util/List;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "LogSymptomsResponse(navigationBar="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", categorySelector="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", style="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", primaryButton="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", suggestedTrackerIds="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
